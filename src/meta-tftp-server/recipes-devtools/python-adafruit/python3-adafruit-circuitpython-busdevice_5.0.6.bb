
SUMMARY = "CircuitPython bus device classes to manage bus sharing."
HOMEPAGE = "https://github.com/adafruit/Adafruit_CircuitPython_BusDevice"
AUTHOR = "Adafruit Industries <circuitpython@adafruit.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6ec69d6e9e6c85adfb7799d7f8cf044e"

SRC_URI = "https://files.pythonhosted.org/packages/09/b8/5a057c82715f22b90097a0c6fbaec75993a151f3f568664e9f9ad40d6384/adafruit-circuitpython-busdevice-5.0.6.tar.gz"
SRC_URI[md5sum] = "05c24624148d1101485c229e65418746"
SRC_URI[sha256sum] = "9bb2934e90a151da8b7d9646b25c2ce0b3fd4853f8ba73e8faffedfd8315eda7"

S = "${WORKDIR}/adafruit-circuitpython-busdevice-5.0.6"

RDEPENDS_${PN} = ""
DEPENDS += "python3-setuptools-scm-native"

inherit setuptools3
