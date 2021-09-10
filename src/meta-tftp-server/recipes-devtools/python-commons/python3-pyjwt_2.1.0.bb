
SUMMARY = "JSON Web Token implementation in Python"
HOMEPAGE = "https://github.com/jpadilla/pyjwt"
AUTHOR = "Jose Padilla <hello@jpadilla.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=68626705a7b513ca8d5f44a3e200ed0c"

SRC_URI = "https://files.pythonhosted.org/packages/0c/c6/3cdc7cb1289b35186fd7fd61836b6d83632ca0f7eee552516777361667b1/PyJWT-2.1.0.tar.gz"
SRC_URI[md5sum] = "34c235e02746683bfc81a61f9ec4dc85"
SRC_URI[sha256sum] = "fba44e7898bbca160a2b2b501f492824fc8382485d3a6f11ba5d0c1937ce6130"

S = "${WORKDIR}/PyJWT-2.1.0"

RDEPENDS_${PN} = ""

inherit setuptools3
