
SUMMARY = "Use the full Github API v3"
HOMEPAGE = "https://github.com/pygithub/pygithub"
AUTHOR = "Vincent Jacques <vincent@vincent-jacques.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "https://files.pythonhosted.org/packages/98/36/386d282903c572b18abc36de68aaf4146db4659c82dceee009ef88a86b67/PyGithub-1.55.tar.gz"
SRC_URI[md5sum] = "03e5883a8d4358b0786a0db84ad56a22"
SRC_URI[sha256sum] = "1bbfff9372047ff3f21d5cd8e07720f3dbfdaf6462fcaed9d815f528f1ba7283"

S = "${WORKDIR}/PyGithub-1.55"

RDEPENDS_${PN} = "python3-deprecated python3-pyjwt python3-pynacl python3-requests"

inherit setuptools3
