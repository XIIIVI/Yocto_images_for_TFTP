
SUMMARY = "Microsoft Azure Cognitive Services Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=b821e9ac2f141ccd376eb1d8b6ffc877"

SRC_URI = "https://files.pythonhosted.org/packages/f4/70/bc6a1037642081a5fbea6f409a82e3d502d8dea24c2ab1d028a0541ee0ae/azure-mgmt-cognitiveservices-12.0.0.zip"
SRC_URI[md5sum] = "3692ff9aaa3945f512d9b51a0b6dca11"
SRC_URI[sha256sum] = "73054bd19866577e7e327518afc8f47e1639a11aea29a7466354b81804f4a676"

S = "${WORKDIR}/azure-mgmt-cognitiveservices-12.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
