SUMMARY = "Raspberry Pi GPIO module"
HOMEPAGE = "http://abyz.me.uk/rpi/pigpio/python.html"
AUTHOR = "joan <joan@abyz.me.uk>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=2ac077804713ae112a818a10ae0527dc"

SRC_URI = "https://files.pythonhosted.org/packages/a9/4a/3ebdfd90906553fb5420e80a475eb52f0809f2a29b547ba3b260db0cbc8f/pigpio-${PV}.tar.gz"
SRC_URI[md5sum] = "e05e3f5cb6c50f4b3eeb4ac50627507e"
SRC_URI[sha256sum] = "91efa50e4990649da97408a384782d6ccf58342fc59cdfe21ed7a42911569975"

S = "${WORKDIR}/pigpio-${PV}"

RDEPENDS_${PN} = "pigpiod"

inherit setuptools3
