SUMMARY = "OLED display"
DESCRIPTION = "This recipe installs all the tools required to monitor an OLED display thru I2C"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

UTILITY_NAME="display-info"
DIR_SHELL="${libexecdir}"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI = " \
    file://display-info.service \
    file://display-info.sh \
    file://display-info.timer \
    file://display-info.py \
"

inherit systemd

RDEPENDS_${PN} += "bash python3-oled-text"

SYSTEMD_SERVICE_${PN} = "${UTILITY_NAME}.timer"
SYSTEMD_AUTO_ENABLE_${PN} = "enable"

BB_STRICT_CHECKSUM = "0"

RDEPENDS_${PN} += "bash python3"

do_install() {
    sed -e 's,DIR_INSTALL,${DIR_SHELL},g' -i ${WORKDIR}/${UTILITY_NAME}.service
    sed -e 's,DIR_INSTALL,${DIR_SHELL},g' -i ${WORKDIR}/${UTILITY_NAME}.sh

    install -d ${D}/${DIR_SHELL}
    install -m 0555 -D ${WORKDIR}/${UTILITY_NAME}.sh ${D}${DIR_SHELL}/${UTILITY_NAME}.sh
    install -m 0555 -D ${WORKDIR}/${UTILITY_NAME}.py ${D}${DIR_SHELL}/${UTILITY_NAME}.py
    install -d ${D}/${systemd_system_unitdir}
    install -m 0644 -D ${WORKDIR}/${UTILITY_NAME}.service ${D}${systemd_system_unitdir}/${UTILITY_NAME}.service
    install -m 0644 -D ${WORKDIR}/${UTILITY_NAME}.timer ${D}${systemd_system_unitdir}/${UTILITY_NAME}.timer
}

SYSTEMD_SERVICE_${PN} += "\
         ${UTILITY_NAME}.service \
         ${UTILITY_NAME}.timer \
         "

FILES_${PN} += "${systemd_system_unitdir}/${UTILITY_NAME}.service"
FILES_${PN} += "${systemd_system_unitdir}/${UTILITY_NAME}.timer"
FILES_${PN} += "${DIR_SHELL}/${UTILITY_NAME}.sh"
FILES_${PN} += "${DIR_SHELL}/${UTILITY_NAME}.py"
