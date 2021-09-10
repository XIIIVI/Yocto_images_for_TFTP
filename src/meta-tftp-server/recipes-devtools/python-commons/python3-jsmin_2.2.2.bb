
SUMMARY = "JavaScript minifier."
HOMEPAGE = "https://github.com/tikitu/jsmin/"
AUTHOR = "Tikitu de Jager <tikitu+jsmin@logophile.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3a3301ce2ad647e172f4a1016c67324d"

SRC_URI = "https://files.pythonhosted.org/packages/17/73/615d1267a82ed26cd7c124108c3c61169d8e40c36d393883eaee3a561852/jsmin-2.2.2.tar.gz"
SRC_URI[md5sum] = "00e7a3179a4591aab2ee707b3214e2fd"
SRC_URI[sha256sum] = "b6df99b2cd1c75d9d342e4335b535789b8da9107ec748212706ef7bbe5c2553b"

S = "${WORKDIR}/jsmin-2.2.2"

RDEPENDS_${PN} = ""

inherit setuptools3
