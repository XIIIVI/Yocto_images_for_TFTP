
SUMMARY = "Microsoft Azure Key Vault Client Libraries for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python/tree/master/sdk/keyvault/azure-keyvault"
AUTHOR = "Microsoft Corporation <azurekeyvault@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=bd74cfa1d6095250471565e709f59783"

SRC_URI = "https://files.pythonhosted.org/packages/99/94/a7cc3a0e794681e049d1882cb041513dd3624be5d6e138ac486cc8415a81/azure-keyvault-4.1.0.zip"
SRC_URI[md5sum] = "b7f0aaf05fc9febea519fef3c58e7fb8"
SRC_URI[sha256sum] = "69002a546921a8290eb54d9a3805cfc515c321bc1d4c0bfcfb463620245eca40"

S = "${WORKDIR}/azure-keyvault-4.1.0"

RDEPENDS_${PN} = "python3-azure-keyvault-certificates python3-azure-keyvault-secrets python3-azure-keyvault-keys"

inherit setuptools3
