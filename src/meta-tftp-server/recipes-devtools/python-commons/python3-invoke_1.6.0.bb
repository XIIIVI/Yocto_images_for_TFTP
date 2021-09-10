
SUMMARY = "Pythonic task execution"
HOMEPAGE = "http://docs.pyinvoke.org"
AUTHOR = "Jeff Forcier <jeff@bitprophet.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8815068973f31b78c328dc067e297ab"

SRC_URI = "https://files.pythonhosted.org/packages/37/b3/0b88358ee07789688d17ec7074a656da68ced50a122183187be12928b535/invoke-1.6.0.tar.gz"
SRC_URI[md5sum] = "6fef8fbc14d7174987d001dbd0b42a84"
SRC_URI[sha256sum] = "374d1e2ecf78981da94bfaf95366216aaec27c2d6a7b7d5818d92da55aa258d3"

S = "${WORKDIR}/invoke-1.6.0"

RDEPENDS_${PN} = ""

inherit setuptools3
