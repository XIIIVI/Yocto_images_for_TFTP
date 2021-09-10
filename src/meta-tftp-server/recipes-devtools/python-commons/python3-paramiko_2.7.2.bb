
SUMMARY = "SSH2 protocol library"
HOMEPAGE = "https://github.com/paramiko/paramiko/"
AUTHOR = "Jeff Forcier <jeff@bitprophet.org>"
LICENSE = "LGPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd0120fc2e9f841c73ac707a30389af5"

SRC_URI = "https://files.pythonhosted.org/packages/cf/a1/20d00ce559a692911f11cadb7f94737aca3ede1c51de16e002c7d3a888e0/paramiko-2.7.2.tar.gz"
SRC_URI[md5sum] = "44136d79da4cd7619e368018ad022619"
SRC_URI[sha256sum] = "7f36f4ba2c0d81d219f4595e35f70d56cc94f9ac40a6acdf51d6ca210ce65035"

S = "${WORKDIR}/paramiko-2.7.2"

RDEPENDS_${PN} = "python3-bcrypt python3-cryptography python3-pynacl"

inherit setuptools3
