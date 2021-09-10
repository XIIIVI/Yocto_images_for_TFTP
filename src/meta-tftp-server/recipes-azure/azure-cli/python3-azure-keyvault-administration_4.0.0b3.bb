
SUMMARY = "Microsoft Azure Key Vault Administration Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python/tree/master/sdk/keyvault/azure-keyvault-administration"
AUTHOR = "Microsoft Corporation <azurekeyvault@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=78add3636a76b8ac21679b33152bb43e"

SRC_URI = "https://files.pythonhosted.org/packages/0d/3b/b43b361f9b1383d00943b2a0315c7e8c66040b8d0f827321d21f45446556/azure-keyvault-administration-4.0.0b3.zip"
SRC_URI[md5sum] = "9740761cd5dc6f2de8c72a2d7932b6ad"
SRC_URI[sha256sum] = "777b4958e6ccde9951babcdfa96987927e42a952fd7a441f9fd01e0dcfcac4b4"

S = "${WORKDIR}/azure-keyvault-administration-4.0.0b3"

RDEPENDS_${PN} = "python3-azure-common python3-azure-core python3-msrest"

inherit setuptools3
