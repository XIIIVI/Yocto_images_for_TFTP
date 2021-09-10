
SUMMARY = "Microsoft Azure Command-Line Tools Core Module"
HOMEPAGE = "https://github.com/Azure/azure-cli"
AUTHOR = "Microsoft Corporation <azpycli@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f74e59e099e328d80285c9eba6d4a53f"

SRC_URI = "https://files.pythonhosted.org/packages/f4/37/9cdcbaef06cb623ecb11b752689a881e8212e611932785ca354b54654b87/azure-cli-core-2.28.0.tar.gz"
SRC_URI[md5sum] = "74d80d40b553021094dc48f08138afc4"
SRC_URI[sha256sum] = "fcd170c278d6e39d1a846c04254b290b335542e823dfc54ba7094dea3fa50778"

S = "${WORKDIR}/azure-cli-core-2.28.0"

RDEPENDS_${PN} = "python3-adal python3-argcomplete python3-azure-cli-telemetry python3-azure-common python3-azure-mgmt-core python3-cryptography python3-humanfriendly python3-jmespath python3-knack python3-msal python3-paramiko python3-pkginfo python3-pyjwt python3-pyopenssl python3-requests python3-six python3-urllib3 python3-psutil"

inherit setuptools3
