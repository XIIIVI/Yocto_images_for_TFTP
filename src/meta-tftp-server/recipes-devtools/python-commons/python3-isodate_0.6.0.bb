
SUMMARY = "An ISO 8601 date/time/duration parser and formatter"
HOMEPAGE = "https://github.com/gweis/isodate/"
AUTHOR = "Gerhard Weis <gerhard.weis@proclos.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://setup.py;md5=b3c3f211145c81973fc82be0a9475f33"

SRC_URI = "https://files.pythonhosted.org/packages/b1/80/fb8c13a4cd38eb5021dc3741a9e588e4d1de88d895c1910c6fc8a08b7a70/isodate-0.6.0.tar.gz"
SRC_URI[md5sum] = "0e1203fce27ce65e2d01c5f21c4d428f"
SRC_URI[sha256sum] = "2e364a3d5759479cdb2d37cce6b9376ea504db2ff90252a2e5b7cc89cc9ff2d8"

S = "${WORKDIR}/isodate-0.6.0"

RDEPENDS_${PN} = "python3-six"

inherit setuptools3
