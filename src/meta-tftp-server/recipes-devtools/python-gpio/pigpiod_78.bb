SUMMARY = "pigpio is a library for the Raspberry which allows control of the General Purpose Input Outputs (GPIO)"
DESCRIPTION = "Greatly inspired by https://www.dazhuanlan.com/mlyhy616/topics/1766869 and https://www.mail-archive.com/yocto@yoctoproject.org/msg36727.html"
HOMEPAGE = "https://http://abyz.me.uk/rpi/pigpio/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI = " \
    git://github.com/joan2937/pigpio.git;protocol=https \
    file://pigpiod.service \
"
SRCREV = "cc17196c7586c3625ac8adf8f34838d320ffeda6"

S = "${WORKDIR}/git"

UTILITY_NAME="pigpiod"

inherit pkgconfig cmake systemd

INSANE_SKIP_${PN} = "dev-so"
SYSTEMD_SERVICE_${PN} = "${UTILITY_NAME}.service"
SYSTEMD_AUTO_ENABLE_${PN} = "enable"

do_configure_append() {
     echo '\n' | tee -a ${S}/CMakeLists.txt
     echo '\n' >> ${S}/CMakeLists.txt
     echo 'set(${PROJECT_NAME}_VERSION "78")' | tee -a ${S}/CMakeLists.txt
     echo 'set_target_properties(${PROJECT_NAME} PROPERTIES VERSION ${${PROJECT_NAME}_VERSION} SOVERSION ${${PROJECT_NAME}_VERSION})' | tee -a ${S}/CMakeLists.txt
     echo 'message(STATUS "Version: ${${PROJECT_NAME}_VERSION}")' | tee -a ${S}/CMakeLists.txt
}

do_install_append() {
     sed -e 's,PIGPIO_INSTALL_DIR,${bindir},g' -i ${WORKDIR}/${UTILITY_NAME}.service

     install -d ${D}${bindir}
     install -m 0755 pigpiod ${D}${bindir}
     install -d ${D}/${systemd_system_unitdir}
     install -m 0644 -D ${WORKDIR}/${UTILITY_NAME}.service ${D}${systemd_system_unitdir}/${UTILITY_NAME}.service
     rm -Rf ${D}${libdir}/cmake/pigpio
}

SYSTEMD_SERVICE_${PN} += "\
         ${UTILITY_NAME}.service \
         "

FILES_${PN} += "${bindir}/pigpiod"
FILES_${PN} += "${systemd_system_unitdir}/${UTILITY_NAME}.service"
FILES_${PN} += "/usr/man"
FILES_${PN} += "/usr/man/man1"
FILES_${PN} += "/usr/man/man3"
FILES_${PN} += "/usr/man/man1/pig2vcd.1"
FILES_${PN} += "/usr/man/man1/pigpiod.1"
FILES_${PN} += "/usr/man/man1/pigs.1"
FILES_${PN} += "/usr/man/man3/pigpio.3"
FILES_${PN} += "/usr/man/man3/pigpiod_if.3"
FILES_${PN} += "/usr/man/man3/pigpiod_if2.3"
FILES_${PN} += "${libdir}/libpigpio.so"
FILES_${PN} += "${libdir}/libpigpiod_if.so"
FILES_${PN} += "${libdir}/libpigpiod_if2.so"
FILES_${PN} += "${libdir}/cmake"


FILES_${PN}-dev = "${includedir}"