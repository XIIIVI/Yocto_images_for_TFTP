
SUMMARY = "Microsoft Azure API Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=0604470629660b3c0eb9d294164e023e"

SRC_URI = "https://files.pythonhosted.org/packages/9a/c4/56bf916be8935d8808e9ebfe9e342f859d2b6fc31f6ff44de8e508cebe70/azure-mgmt-apimanagement-2.1.0.zip"
SRC_URI[md5sum] = "7b9744ef6be59d81a8bb5280eb26068e"
SRC_URI[sha256sum] = "58296bd45e876df33f93f3a41c866c36476f5f3bd46818e8891308794f041c94"

S = "${WORKDIR}/azure-mgmt-apimanagement-2.1.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
