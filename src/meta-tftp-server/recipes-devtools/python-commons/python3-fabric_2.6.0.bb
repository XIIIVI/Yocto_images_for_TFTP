
SUMMARY = "High level SSH command execution"
HOMEPAGE = "http://fabfile.org"
AUTHOR = "Jeff Forcier <jeff@bitprophet.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8815068973f31b78c328dc067e297ab"

SRC_URI = "https://files.pythonhosted.org/packages/32/61/9a26b8f3dcdb5cb17daff57c9a85be6d5963d50488f45319d64a413da762/fabric-2.6.0.tar.gz"
SRC_URI[md5sum] = "1b5ca4debfa10e0e2a7f79a1e4d40720"
SRC_URI[sha256sum] = "47f184b070272796fd2f9f0436799e18f2ccba4ee8ee587796fca192acd46cd2"

S = "${WORKDIR}/fabric-2.6.0"

RDEPENDS_${PN} = "python3-invoke python3-paramiko python3-pathlib2"

inherit setuptools3
