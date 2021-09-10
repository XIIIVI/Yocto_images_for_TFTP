
SUMMARY = "Microsoft Azure Client Library for Python (Common)"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=f5f1d463b4bc9eae6f21812724eea6b3"

SRC_URI = "https://files.pythonhosted.org/packages/68/ac/c803d8422b4ae1bd6938e6bcd53cd7944ec120112039b9bd59b350b3b8ae/azure-common-1.1.27.zip"
SRC_URI[md5sum] = "271f32696cd67737bbb4378dd9d2013a"
SRC_URI[sha256sum] = "9f3f5d991023acbd93050cf53c4e863c6973ded7e236c69e99c8ff5c7bad41ef"

S = "${WORKDIR}/azure-common-1.1.27"

RDEPENDS_${PN} = ""

inherit setuptools3
