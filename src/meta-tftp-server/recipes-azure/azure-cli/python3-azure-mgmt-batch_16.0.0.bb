
SUMMARY = "Microsoft Azure Batch Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=9c3d826ae3f58757901b32ce498c6488"

SRC_URI = "https://files.pythonhosted.org/packages/32/06/aedae003e3b5295a3f62a4d12e00f22f6d0e31287aa637183b0b1f7125ca/azure-mgmt-batch-16.0.0.zip"
SRC_URI[md5sum] = "a9fbc0a80aad07255e9e904ca4892b31"
SRC_URI[sha256sum] = "1b3cecd6f16813879c6ac1a1bb01f9a6f2752cd1f9157eb04d5e41e4a89f3c34"

S = "${WORKDIR}/azure-mgmt-batch-16.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
