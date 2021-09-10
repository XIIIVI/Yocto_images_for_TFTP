
SUMMARY = "Microsoft Azure Cosmos DB Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=34bd22b6c73295bb32833f1ddc1f9805"

SRC_URI = "https://files.pythonhosted.org/packages/65/81/d6d8812775b253c698e29c4f0f4a983aa4111b874fa9a9f2ae153b9e515a/azure-mgmt-cosmosdb-6.4.0.zip"
SRC_URI[md5sum] = "57cdc620b9eee477f27c2997896c538a"
SRC_URI[sha256sum] = "fb6b8ab80ab97214b94ae9e462ba1c459b68a3af296ffc26317ebd3ff500e00b"

S = "${WORKDIR}/azure-mgmt-cosmosdb-6.4.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
