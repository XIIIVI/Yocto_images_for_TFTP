
SUMMARY = "Microsoft Azure Key Vault Keys Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python/tree/master/sdk/keyvault/azure-keyvault-keys"
AUTHOR = "Microsoft Corporation <azurekeyvault@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=4775c160225746fed7830c2598e1e7ff"

SRC_URI = "https://files.pythonhosted.org/packages/f6/03/a5e9b1e8f20c84de55b598eecb86815ed3ee4fc72d4764e5b7a014e3fadd/azure-keyvault-keys-4.4.0.zip"
SRC_URI[md5sum] = "ac80f9aa5335bade1f15fde164634528"
SRC_URI[sha256sum] = "7792ad0d5e63ad9eafa68bdce5de91b3ffcc7ca7a6afdc576785e6a2793caed0"

S = "${WORKDIR}/azure-keyvault-keys-4.4.0"

RDEPENDS_${PN} = "python3-azure-core python3-cryptography python3-msrest python3-azure-common python3-six"

inherit setuptools3
