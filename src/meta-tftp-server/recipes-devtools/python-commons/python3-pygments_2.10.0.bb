
SUMMARY = "Pygments is a syntax highlighting package written in Python."
HOMEPAGE = "https://pygments.org/"
AUTHOR = "Georg Brandl <georg@python.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=98419e351433ac106a24e3ad435930bc"

SRC_URI = "https://files.pythonhosted.org/packages/b7/b3/5cba26637fe43500d4568d0ee7b7362de1fb29c0e158d50b4b69e9a40422/Pygments-2.10.0.tar.gz"
SRC_URI[md5sum] = "87369a4e15019caf9cf056ab2c5858b3"
SRC_URI[sha256sum] = "f398865f7eb6874156579fdf36bc840a03cab64d1cde9e93d68f46a425ec52c6"

S = "${WORKDIR}/Pygments-2.10.0"

RDEPENDS_${PN} = ""

inherit setuptools3
