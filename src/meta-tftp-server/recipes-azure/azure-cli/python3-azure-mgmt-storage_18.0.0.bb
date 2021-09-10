
SUMMARY = "Microsoft Azure Storage Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=8915f6371d62d08a3e75835bd0e426b3"

SRC_URI = "https://files.pythonhosted.org/packages/33/35/3d38afbef0af2b9fb140a4230b4d1919c4cc60135447f5114946d1e12da7/azure-mgmt-storage-18.0.0.zip"
SRC_URI[md5sum] = "a7c0c1e01fc6b0a7a7a47dbb26b6e441"
SRC_URI[sha256sum] = "d17beb34273797fa89863632ff0e1eb9b6a55198abb8c7f05d84980762e5f71f"

S = "${WORKDIR}/azure-mgmt-storage-18.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
