
SUMMARY = "Microsoft Azure Storage Common Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-storage-python"
AUTHOR = "Microsoft Corporation <ascl@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=72c7dbf512a49429b7f34597d3f12d4b"

SRC_URI = "https://files.pythonhosted.org/packages/48/12/e074fe454bc327fbe2a61e20d3260473ee4a0fd85387baf249dc83c8e774/azure-storage-common-2.1.0.tar.gz"
SRC_URI[md5sum] = "8b78fae1786098193ce21ddea0bf0157"
SRC_URI[sha256sum] = "ccedef5c67227bc4d6670ffd37cec18fb529a1b7c3a5e53e4096eb0cf23dc73f"

S = "${WORKDIR}/azure-storage-common-2.1.0"

RDEPENDS_${PN} = "python3-azure-common python3-cryptography python3-python-dateutil python3-requests"

inherit setuptools3
