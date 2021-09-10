
SUMMARY = "Microsoft Azure Storage Client Library for Python with multi API version support."
HOMEPAGE = "https://github.com/Azure/azure-multiapi-storage-python"
AUTHOR = "Microsoft Corporation <azpycli@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=ee35f6ef502683bd58eae0d7f47f7a2e"

SRC_URI = "https://files.pythonhosted.org/packages/42/b6/49b40df44b2a3356c6c90a330f204de57fedfe62c84716026abcef02bfa6/azure-multiapi-storage-0.6.2.tar.gz"
SRC_URI[md5sum] = "55fd5b86961359bfe6d0d9b693275f2a"
SRC_URI[sha256sum] = "74061f99730fa82c54d9b8ab3c7d6e219da3f30912740ecf0456b20cb3555ebc"

S = "${WORKDIR}/azure-multiapi-storage-0.6.2"

RDEPENDS_${PN} = "python3-azure-common python3-python-dateutil python3-requests python3-azure-core python3-msrest python3-cryptography"

inherit setuptools3
