
SUMMARY = "Microsoft Azure Storage Client Library for Python with multi API version support."
HOMEPAGE = "https://github.com/Azure/azure-multiapi-storage-python"
AUTHOR = "Microsoft Corporation <azpycli@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=1ed01dff871f0700ca3a3021935407b6"

SRC_URI = "https://files.pythonhosted.org/packages/98/e5/a0387cb84cf4726bbed347124d9bab2be6e181804b889dee35f8f65223b9/azure-multiapi-storage-0.2.3.tar.gz"
SRC_URI[md5sum] = "844d30a4bf3d6a34393129b197ad7214"
SRC_URI[sha256sum] = "ab3dbf0c422e53161b5ba0b2e8be5f4a144d15a5c082cfa1f2ef6b7e83b7a414"

S = "${WORKDIR}/azure-multiapi-storage-0.2.3"

RDEPENDS_${PN} = "python3-azure-common python3-cryptography python3-python-dateutil python3-requests"

inherit setuptools3
