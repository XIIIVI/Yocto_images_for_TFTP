
SUMMARY = "Python wrapper module around the OpenSSL library"
HOMEPAGE = "https://pyopenssl.org/"
AUTHOR = "The pyOpenSSL developers <cryptography-dev@python.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://files.pythonhosted.org/packages/98/cd/cbc9c152daba9b5de6094a185c66f1c6eb91c507f378bb7cad83d623ea88/pyOpenSSL-20.0.1.tar.gz"
SRC_URI[md5sum] = "40f81b5faf059e89ab4377ec5554bd5e"
SRC_URI[sha256sum] = "4c231c759543ba02560fcd2480c48dcec4dae34c9da7d3747c508227e0624b51"

S = "${WORKDIR}/pyOpenSSL-20.0.1"

RDEPENDS_${PN} = "python3-cryptography python3-six"

inherit setuptools3
