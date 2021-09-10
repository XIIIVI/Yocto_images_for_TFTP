
SUMMARY = "Microsoft Azure Storage Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=96a1b0b0ec546d60c3e236d4253451d4"

SRC_URI = "https://files.pythonhosted.org/packages/d1/95/eb5efd39682b1e761323668c282bb1c4071fb4dd057cab9d11015de7ebe7/azure-mgmt-storage-3.3.0.zip"
SRC_URI[md5sum] = "f37e6124ef320edc8626d6102dabf652"
SRC_URI[sha256sum] = "06faa7033a17ecd5127cab476a7cd79d5fe7b68e332c8e8e8303a20c9157cecd"

S = "${WORKDIR}/azure-mgmt-storage-3.3.0"

RDEPENDS_${PN} = "python3-msrest python3-msrestazure python3-azure-common"

inherit setuptools3
