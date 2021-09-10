
SUMMARY = "Microsoft Azure Managed Services Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=6611bfba3a37adc4ccf200db2684c9a4"

SRC_URI = "https://files.pythonhosted.org/packages/4f/aa/81a7ca9c6b9a3124e644e3f4b7fd78ab9a3fde1d4a407f736ec8f7b28d04/azure-mgmt-managedservices-6.0.0.zip"
SRC_URI[md5sum] = "eeeb2c5c6cb888eb507178ae196444b4"
SRC_URI[sha256sum] = "ec0cb3858bcf8edf5eee0eddee81560424eb84352e0df082ddc94eb99badfd5e"

S = "${WORKDIR}/azure-mgmt-managedservices-6.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
