
SUMMARY = "YAML parser and emitter for Python"
HOMEPAGE = "https://pyyaml.org/"
AUTHOR = "Kirill Simonov <xi@resolvent.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6d8242660a8371add5fe547adf083079"

SRC_URI = "https://files.pythonhosted.org/packages/a0/a4/d63f2d7597e1a4b55aa3b4d6c5b029991d3b824b5bd331af8d4ab1ed687d/PyYAML-5.4.1.tar.gz"
SRC_URI[md5sum] = "46e25294c7efec23d4072ed6a7777f46"
SRC_URI[sha256sum] = "607774cbba28732bfa802b54baa7484215f530991055bb562efbed5b2f20a45e"

S = "${WORKDIR}/PyYAML-5.4.1"

RDEPENDS_${PN} = ""

inherit setuptools3
