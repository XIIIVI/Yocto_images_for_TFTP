
SUMMARY = "Microsoft Azure Identity Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python/tree/master/sdk/identity/azure-identity"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=37cb49fc9c3e2c23caa107ba891b63a0"

SRC_URI = "https://files.pythonhosted.org/packages/a8/20/6dcb10fdbce9d6c22fdc401ee0b825c751125ad078d49b2750eb6aeb0050/azure-identity-1.6.1.zip"
SRC_URI[md5sum] = "ec58ec4cfc7433cd273b91b8162c0b6d"
SRC_URI[sha256sum] = "69035c81f280fac5fa9c55f87be3a359b264853727486e3568818bb43988080e"

S = "${WORKDIR}/azure-identity-1.6.1"

RDEPENDS_${PN} = "python3-azure-core python3-cryptography python3-msal python3-msal-extensions python3-six"

inherit setuptools3
