
SUMMARY = "Cross-platform colored terminal text."
HOMEPAGE = "https://github.com/tartley/colorama"
AUTHOR = "Jonathan Hartley <tartley@tartley.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b4936429a56a652b84c5c01280dcaa26"

SRC_URI = "https://files.pythonhosted.org/packages/1f/bb/5d3246097ab77fa083a61bd8d3d527b7ae063c7d8e8671b1cf8c4ec10cbe/colorama-0.4.4.tar.gz"
SRC_URI[md5sum] = "57b22f2597f63df051b69906fbf310cc"
SRC_URI[sha256sum] = "5941b2b48a20143d2267e95b1c2a7603ce057ee39fd88e7329b0c292aa16869b"

S = "${WORKDIR}/colorama-0.4.4"

RDEPENDS_${PN} = ""

inherit setuptools3
