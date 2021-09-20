LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_prepend = " \
"

RDEPENDS_${PN} += " \
    ${PREFERRED_PROVIDER_virtual/docker} \
    ${@bb.utils.contains('DISTRO', 'iotedgeos', 'python3-azure-cli', '', d)} \
    ${@bb.utils.contains('DISTRO', 'tftpos', 'python3-azure-cli', '', d)} \
"

do_configure_prepend() {
     sed -i "s|#-BUILD_DATE-#|$(date)|g" "${WORKDIR}/share/dot.profile"
}
