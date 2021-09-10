
SUMMARY = "Microsoft Azure Service Fabric Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=f97b7bb2d639b63ce128cd70e16c5df4"

SRC_URI = "https://files.pythonhosted.org/packages/c4/7b/a5e11345bdf01b5bd4843e828dc05afb4c19399bf7616dddeaaeca02d097/azure-mgmt-servicefabric-2.0.0.zip"
SRC_URI[md5sum] = "161eeb5479158861c623853c843a5f3c"
SRC_URI[sha256sum] = "4c6f3de2526a27af78aecae248604f941c4d059fbcf2265912a380e3c788735d"

S = "${WORKDIR}/azure-mgmt-servicefabric-2.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
