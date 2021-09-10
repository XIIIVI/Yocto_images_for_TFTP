
SUMMARY = "Microsoft Azure Key Vault Secrets Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python/tree/master/sdk/keyvault/azure-keyvault-secrets"
AUTHOR = "Microsoft Corporation <azurekeyvault@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=b4ab6ed4b4a4d546be73674c9bac4941"

SRC_URI = "https://files.pythonhosted.org/packages/0a/d0/c18187e128a627d4c33f579f686872a0b965a742736a7588404787b12a8b/azure-keyvault-secrets-4.3.0.zip"
SRC_URI[md5sum] = "408bb25040e499c3c3e12a4c08d993f5"
SRC_URI[sha256sum] = "26279ba3a6c727deba1fb61f549496867baddffbf062bd579d6fd2bc04e95276"

S = "${WORKDIR}/azure-keyvault-secrets-4.3.0"

RDEPENDS_${PN} = "python3-azure-core python3-msrest python3-azure-common"

inherit setuptools3
