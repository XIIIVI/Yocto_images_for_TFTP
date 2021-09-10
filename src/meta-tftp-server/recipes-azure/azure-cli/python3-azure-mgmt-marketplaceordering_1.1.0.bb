
SUMMARY = "Microsoft Azure Market Place Ordering Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=85a2912d704cebb6e48aa7540584c86b"

SRC_URI = "https://files.pythonhosted.org/packages/17/9c/74d7746672a4e9ac6136e3043078a2f4d0a0e3568daf2de772de8e4d7cff/azure-mgmt-marketplaceordering-1.1.0.zip"
SRC_URI[md5sum] = "924092ac9208a43fd7afb8d33b23e105"
SRC_URI[sha256sum] = "68b381f52a4df4435dacad5a97e1c59ac4c981f667dcca8f9d04453417d60ad8"

S = "${WORKDIR}/azure-mgmt-marketplaceordering-1.1.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
