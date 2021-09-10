
SUMMARY = "ANTLR 4.9.2 runtime for Python 3.7"
HOMEPAGE = "http://www.antlr.org"
AUTHOR = "Eric Vergnaud, Terence Parr, Sam Harwell <eric.vergnaud@wanadoo.fr>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://setup.py;md5=224d5622b8b10212923a7694e5f0a13e"

SRC_URI = "https://files.pythonhosted.org/packages/04/9c/d5ef93dc1e5a862cae004a64d15425c2a1ae8ba967a08f03dfb11aedf7bf/antlr4-python3-runtime-4.9.2.tar.gz"
SRC_URI[md5sum] = "8ab5cf79d0e9f0a23e9fb3ca996a89e5"
SRC_URI[sha256sum] = "31f5abdc7faf16a1a6e9bf2eb31565d004359b821b09944436a34361929ae85a"

S = "${WORKDIR}/antlr4-python3-runtime-4.9.2"

RDEPENDS_${PN} = ""

inherit setuptools3
