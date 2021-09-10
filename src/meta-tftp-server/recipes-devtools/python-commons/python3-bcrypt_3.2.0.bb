
SUMMARY = "Modern password hashing for your software and your servers"
HOMEPAGE = "https://github.com/pyca/bcrypt/"
AUTHOR = "The Python Cryptographic Authority developers <cryptography-dev@python.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

SRC_URI = "https://files.pythonhosted.org/packages/d8/ba/21c475ead997ee21502d30f76fd93ad8d5858d19a3fad7cd153de698c4dd/bcrypt-3.2.0.tar.gz"
SRC_URI[md5sum] = "fe31390dab603728f756cd3d6830c80a"
SRC_URI[sha256sum] = "5b93c1726e50a93a033c36e5ca7fdcd29a5c7395af50a6892f5d9e7c6cfbfb29"

S = "${WORKDIR}/bcrypt-3.2.0"

RDEPENDS_${PN} = "python3-cffi python3-six"

inherit setuptools3
