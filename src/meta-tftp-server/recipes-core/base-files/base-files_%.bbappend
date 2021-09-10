LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_prepend = " \
                   file://share/dot.bashrc.guestfish \
"

#                   file://docker/custom-guestfish.dockerar 

RDEPENDS_${PN} += " \
    ${PREFERRED_PROVIDER_virtual/docker} \
    ${@bb.utils.contains('DISTRO', 'iotedgeos', 'python3-azure-cli', '', d)} \
    ${@bb.utils.contains('DISTRO', 'tftpos', 'python3-azure-cli', '', d)} \
"

DIR_ARCHIVE="${libexecdir}/docker-archives"

do_configure_prepend() {
     install -d ${D}/${DIR_ARCHIVE}

     if [ ${@bb.utils.contains('DISTRO', 'tftpos', '1', '0', d)} = "1" ]; then
         cat "${WORKDIR}/share/dot.bashrc.guestfish" >> "${WORKDIR}/share/dot.bashrc"
#         install -m 0444 -D ${WORKDIR}/custom-guestfish.dockerar ${D}${DIR_ARCHIVE}/custom-guestfish.tar.gz
     fi

     sed -i "s|#-BUILD_DATE-#|$(date)|g" "${WORKDIR}/share/dot.profile"
}

FILES_${PN} += "${DIR_ARCHIVE}/"
