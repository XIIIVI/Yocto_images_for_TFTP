SUMMARY = "CircuitPython APIs for non-CircuitPython versions of Python such as CPython on Linux and MicroPython."
HOMEPAGE = "https://github.com/adafruit/Adafruit_Blinka"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=660e614bc7efb0697cc793d8a22a55c2"

SRC_URI = " \
           https://files.pythonhosted.org/packages/fe/39/023dc4d30289ff3248f0b16273351008e0bd15530779b00a16d0385ba5b6/Adafruit-Blinka-6.13.0.tar.gz;name=blinka \
           git://github.com/adafruit/libgpiod_pulsein;branch=master;protocol=https;rev=19cff93d2bd803e49a874ec0ec7d364170908182;nobranch=1 \
"

SRC_URI[blinka.md5sum] = "00a2629ca4ee25d155a8151347d92d47"
SRC_URI[blinka.sha256sum] = "acbcfb778dc5e37ad9ef0aa1e1998e597a99c8a2a08b0dda58c05681950ea1f2"

BB_STRICT_CHECKSUM = "0"

S = "${WORKDIR}/Adafruit-Blinka-6.13.0"

inherit setuptools3

RDEPENDS_${PN} += " \
    libgpiod \
    python3-adafruit-platformdetect \
    python3-adafruit-pureio \
    python3-core \
    python3-binho-host-adapter \
    python3-pyftdi \
    python3-pyserial \
    python3-pyusb \
    python3-rpi-ws281x \
    python3-sysv-ipc \
"
RDEPENDS_${PN}_append_rpi = " rpi-gpio"

DEPENDS += "python3-setuptools-scm-native libgpiod"

do_install_append() {
     cd ${WORKDIR}/git/src
     sed -i '/CC=/d' Makefile
     sed -i '/CFLAGS=/d' Makefile
     sed -i '/libgpiod_pulsein:/{N;s/\n.*//;}' Makefile
     echo '\t\t$(CC) -o $@ $^ -I. -lgpiod -pthread -Wall $(CFLAGS) ${CPPFLAGS} ${LDFLAGS}' >> Makefile
     oe_runmake
     cp libgpiod_pulsein ${D}${PYTHON_SITEPACKAGES_DIR}/adafruit_blinka/microcontroller/bcm283x/pulseio
     cd -     
}
