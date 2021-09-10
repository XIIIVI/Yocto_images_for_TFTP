
SUMMARY = "Microsoft Azure Key Vault Certificates Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python/tree/master/sdk/keyvault/azure-keyvault-certificates"
AUTHOR = "Microsoft Corporation <azurekeyvault@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=fdd133f95f634f4fb272a434603c65c4"

SRC_URI = "https://files.pythonhosted.org/packages/f6/09/22335a4f01dd10de1832575e75d0c770b032f41816bc2da65d0dc5d3cd7e/azure-keyvault-certificates-4.3.0.zip"
SRC_URI[md5sum] = "c37a2c7f498cd17df4f138e7a8e5eb32"
SRC_URI[sha256sum] = "4e0a9bae9fd4c222617fbce6b31f97e2e0622774479de3c387239cbfbb828d87"

S = "${WORKDIR}/azure-keyvault-certificates-4.3.0"

RDEPENDS_${PN} = "python3-azure-core python3-msrest python3-azure-common"

inherit setuptools3
