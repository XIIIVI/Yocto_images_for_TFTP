
SUMMARY = "Microsoft Azure Keyvault Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=ff5a69bfe82151deb038092fae8daffe"

SRC_URI = "https://files.pythonhosted.org/packages/48/c4/31ab2e25fc29fb0adbaaa9371086d9266e089119fc49a55ca77f42c4a9ef/azure-mgmt-keyvault-9.1.0.zip"
SRC_URI[md5sum] = "11ee697e1576bf608417b6642733b479"
SRC_URI[sha256sum] = "cd35e81c4a3cf812ade4bdcf1f7ccf4b5b78a801ef967340012a6ac9fe61ded2"

S = "${WORKDIR}/azure-mgmt-keyvault-9.1.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
