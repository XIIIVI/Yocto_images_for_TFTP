
SUMMARY = "Microsoft Azure Resource Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=556b49e331e6d2e0105fd969fb7a9f2c"

SRC_URI = "https://files.pythonhosted.org/packages/5c/b3/ec5591a7d25cd27fede908e68309ac668cbfaa190613fc92528a643f8770/azure-mgmt-resource-19.0.0.zip"
SRC_URI[md5sum] = "1ef3e54494d8bc50c5a59d4df4af92d0"
SRC_URI[sha256sum] = "bbb60bb9419633c2339569d4e097908638c7944e782b5aef0f5d9535085a9100"

S = "${WORKDIR}/azure-mgmt-resource-19.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
