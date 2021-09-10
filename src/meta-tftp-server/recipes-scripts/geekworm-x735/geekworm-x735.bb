SUMMARY = "Geekworm X735"
DESCRIPTION = "This recipe installs all the tools required to monitor the Geekworm X735 hat"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

RDEPENDS_${PN} += "bash python3"


FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI = " \
    file://x735pwr.sh \
    file://x735softsd.sh \
    file://geekworm-x735.service \
    file://geekworm-x735.timer \
    file://pwm_fan_control.py \
"

UTILITY_NAME="geekworm-x735"
DIR_SHELL="${libexecdir}"

do_install() {
    sed -e 's,DIR_INSTALL,${DIR_SHELL},g' -i ${WORKDIR}/${UTILITY_NAME}.service

    install -d ${D}/${sysconfdir}
    install -m 0555 -D ${WORKDIR}/x735pwr.sh ${D}${sysconfdir}/x735pwr.sh
    install -m 0555 -D ${WORKDIR}/x735softsd.sh ${D}${sysconfdir}/x735softsd.sh
    install -d ${D}/${DIR_SHELL}
    install -m 0555 -D ${WORKDIR}/pwm_fan_control.py ${D}${DIR_SHELL}/pwm_fan_control.py
    install -d ${D}/${systemd_system_unitdir}
    install -m 0444 -D ${WORKDIR}/${UTILITY_NAME}.service ${D}${systemd_system_unitdir}/${UTILITY_NAME}.service
    install -m 0444 -D ${WORKDIR}/${UTILITY_NAME}.timer ${D}${systemd_system_unitdir}/${UTILITY_NAME}.timer
}

SYSTEMD_SERVICE_${PN} += "${UTILITY_NAME}.service"
SYSTEMD_SERVICE_${PN} += "${UTILITY_NAME}.timer"

FILES_${PN} += "${systemd_system_unitdir}/${UTILITY_NAME}.service"
FILES_${PN} += "${systemd_system_unitdir}/${UTILITY_NAME}.timer"
FILES_${PN} += "${sysconfdir}/x735pwr.sh"
FILES_${PN} += "${sysconfdir}/x735softsd.sh"
FILES_${PN} += "${DIR_SHELL}/pwm_fan_control.py"
