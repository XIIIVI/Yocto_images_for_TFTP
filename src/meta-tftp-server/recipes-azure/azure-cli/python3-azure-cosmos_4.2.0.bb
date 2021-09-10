
SUMMARY = "Microsoft Azure Cosmos Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <askdocdb@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=35b5a4b284dcca8dda38949854025b46"

SRC_URI = "https://files.pythonhosted.org/packages/87/0d/ee9d2110b82692af77b2ff22294a5563948b42d25f92a5df95471612dbd8/azure-cosmos-4.2.0.zip"
SRC_URI[md5sum] = "f9c31bd22bda5479c29970c503c265eb"
SRC_URI[sha256sum] = "867191fa5966446101f7ca3834f23060a85735d0b660303ca353864945d572b6"

S = "${WORKDIR}/azure-cosmos-4.2.0"

RDEPENDS_${PN} = "python3-six python3-azure-core"

inherit setuptools3
