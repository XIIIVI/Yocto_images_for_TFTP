SUMMARY = "CircuitPython APIs for non-CircuitPython versions of Python such as CPython on Linux and MicroPython."
HOMEPAGE = "https://github.com/adafruit/Adafruit_Blinka"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=660e614bc7efb0697cc793d8a22a55c2"

SRC_URI = "https://files.pythonhosted.org/packages/fe/39/023dc4d30289ff3248f0b16273351008e0bd15530779b00a16d0385ba5b6/Adafruit-Blinka-6.13.0.tar.gz"
SRC_URI[md5sum] = "00a2629ca4ee25d155a8151347d92d47"
SRC_URI[sha256sum] = "acbcfb778dc5e37ad9ef0aa1e1998e597a99c8a2a08b0dda58c05681950ea1f2"

S = "${WORKDIR}/Adafruit-Blinka-6.13.0"
inherit setuptools3

DEPENDS += "python3-setuptools-scm-native"

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
RDEPENDS_${PN} = "python3-adafruit-platformdetect python3-adafruit-pureio "

do_install:append() {
# it ships ./bcm283x/pulseio/libgpiod_pulsein which is a prebuilt
# 32bit binary therefore we should make this specific to 32bit rpi machines (based on bcm283x) only
    if [ ${@bb.utils.contains('TUNE_FEATURES', 'callconvention-hard', '1', '0', d)} = "0" ]; then
        rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/adafruit_blinka/microcontroller/bcm283x
    fi
}

RDEPENDS_${PN}_append_rpi = " rpi-gpio"