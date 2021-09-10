
SUMMARY = "Microsoft Azure Traffic Manager Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=8a031f91e071924f828df86786693c64"

SRC_URI = "https://files.pythonhosted.org/packages/14/98/6fb3bc67bb862b7bac2ea43108aa1648f72c8fa63de22ab1e58278224c43/azure-mgmt-trafficmanager-0.51.0.zip"
SRC_URI[md5sum] = "ba711c01c00d6a21928f315bd39fa960"
SRC_URI[sha256sum] = "fc8ae77022cfe52fda4379a2f31e0b857574d536e41291a7b569b5c0f4104186"

S = "${WORKDIR}/azure-mgmt-trafficmanager-0.51.0"

RDEPENDS_${PN} = "python3-msrest python3-msrestazure python3-azure-common"

inherit setuptools3
