FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = " \
    file://install-nested-images.service \
    file://install-nested-images.sh \
    file://docker/ \
"

RDEPENDS_${PN} += "bash"

DIR_SHELL="${libexecdir}"
DIR_ARCHIVE="${DIR_SHELL}/docker-archives"

# Change the container location
# Change the way to start Docker by specifying the container location

do_install_append() {
     sed -e "s#/usr/bin/dockerd#/usr/bin/dockerd --data-root #-DIR_DATA-#/docker/var#g" -i ${D}/${systemd_system_unitdir}/docker.service

     sed -e "s#DIR_INSTALL#${DIR_SHELL}#g" -i ${WORKDIR}/install-nested-images.service
     install -m 0444 -D ${WORKDIR}/install-nested-images.service ${D}${systemd_system_unitdir}/install-nested-images.service
     sed -e "s#DIR_ARCHIVES#${DIR_ARCHIVE}#g" -i ${WORKDIR}/install-nested-images.sh
     install -m 0555 -D ${WORKDIR}/install-nested-images.sh ${D}${DIR_SHELL}/install-nested-images.sh

     install -d ${D}/${DIR_ARCHIVE}/
     install -m 0444 ${WORKDIR}/docker/* ${D}/${DIR_ARCHIVE}
}

SYSTEMD_SERVICE_${PN} += "\
         install-nested-images.service \
         "

FILES_${PN} += "${systemd_system_unitdir}/install-nested-images.service"
FILES_${PN} += "${DIR_SHELL}/install-nested-images.sh"
FILES_${PN} += "${DIR_ARCHIVE}"
