
SUMMARY = "Microsoft App Configuration Data Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python/tree/main/sdk/appconfiguration/azure-appconfiguration"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=e4bdee6c6bc1b8c0aec86c07d251d527"

SRC_URI = "https://files.pythonhosted.org/packages/a0/bf/fbff040ddbeacb44a2fca3af0349870ef0b69664f4e0590bd74f3c598a8d/azure-appconfiguration-1.2.0.zip"
SRC_URI[md5sum] = "4a339682cd2dd6947692678468eb66c2"
SRC_URI[sha256sum] = "85c9c25612f160897ae212532ec7c19c94b0f4463f4830d0ee08cb2d296df407"

S = "${WORKDIR}/azure-appconfiguration-1.2.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-core"

inherit setuptools3
