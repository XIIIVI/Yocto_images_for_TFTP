
SUMMARY = "CircuitPython frambuf module, based on the Python frambuf module."
HOMEPAGE = "https://github.com/adafruit/Adafruit_CircuitPython_framebuf"
AUTHOR = "Adafruit Industries <circuitpython@adafruit.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6ad4a8854b39ad474755ef1aea813bac"

SRC_URI = "https://files.pythonhosted.org/packages/7f/9b/68b95cdb395e364981306d4f61e84cdafd3cbec8506fcd06c77d6d1bfc51/adafruit-circuitpython-framebuf-1.4.7.tar.gz"
SRC_URI[md5sum] = "b45f515c3253df5df048519f01adc132"
SRC_URI[sha256sum] = "50d4403dfc704ef2b9adb7ca7ccb73049b4528abd6a44fd018fb09cb692d6fc1"

S = "${WORKDIR}/adafruit-circuitpython-framebuf-1.4.7"

RDEPENDS_${PN} = "python3-customized-adafruit-blinka"
DEPENDS += "python3-setuptools-scm-native"

inherit setuptools3
