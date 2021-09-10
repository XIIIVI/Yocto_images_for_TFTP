
SUMMARY = "CircuitPython APIs for non-CircuitPython versions of Python such as CPython on Linux and MicroPython."
HOMEPAGE = "https://github.com/adafruit/Adafruit_Blinka"
AUTHOR = "Adafruit Industries <circuitpython@adafruit.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=660e614bc7efb0697cc793d8a22a55c2"

SRC_URI = "https://files.pythonhosted.org/packages/fe/39/023dc4d30289ff3248f0b16273351008e0bd15530779b00a16d0385ba5b6/Adafruit-Blinka-6.13.0.tar.gz"
SRC_URI[md5sum] = "00a2629ca4ee25d155a8151347d92d47"
SRC_URI[sha256sum] = "acbcfb778dc5e37ad9ef0aa1e1998e597a99c8a2a08b0dda58c05681950ea1f2"

S = "${WORKDIR}/Adafruit-Blinka-6.13.0"

RDEPENDS_${PN} = "python3-adafruit-platformdetect python3-adafruit-pureio python3-binho-host-adapter python3-pyftdi python3-pyserial python3-pyusb python3-rpi-ws281x python3-sysv-ipc"
DEPENDS += "python3-setuptools-scm-native"

TARGET_CC_ARCH += "${LDFLAGS}"
INSANE_SKIP_${PN} += "arch"
INSANE_SKIP_${PN} += "file-rdeps"

inherit setuptools3

RDEPENDS_${PN}_append_rpi = " rpi-gpio"