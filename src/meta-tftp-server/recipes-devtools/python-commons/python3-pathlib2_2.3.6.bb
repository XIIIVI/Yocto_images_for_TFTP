
SUMMARY = "Object-oriented filesystem paths"
HOMEPAGE = "https://github.com/mcmtroffaes/pathlib2"
AUTHOR = "Matthias C. M. Troffaes <matthias.troffaes@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=2dc08586cce3ab91bfa091b655c0e440"

SRC_URI = "https://files.pythonhosted.org/packages/df/16/e9d6bcf1aed52a55bc1696324ab22586716053b3e97b85266e0f3ad36bae/pathlib2-2.3.6.tar.gz"
SRC_URI[md5sum] = "e50a0cf94e406c5110b3aed535626e9e"
SRC_URI[sha256sum] = "7d8bcb5555003cdf4a8d2872c538faa3a0f5d20630cb360e518ca3b981795e5f"

S = "${WORKDIR}/pathlib2-2.3.6"

RDEPENDS_${PN} = "python3-six"

inherit setuptools3
