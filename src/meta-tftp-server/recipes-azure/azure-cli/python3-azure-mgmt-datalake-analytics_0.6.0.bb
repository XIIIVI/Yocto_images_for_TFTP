
SUMMARY = "Microsoft Azure Data Lake Analytics Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=8f6b112753c943b25e344b8ac99e04b8"

SRC_URI = "https://files.pythonhosted.org/packages/6f/e9/91da6cea4cccb268237e7f16bddefb2dbb1507f75b78c13a79eae16eb1cc/azure-mgmt-datalake-analytics-0.6.0.zip"
SRC_URI[md5sum] = "9292c387c1745bc13c3a43ab2bac608b"
SRC_URI[sha256sum] = "0d64c4689a67d6138eb9ffbaff2eda2bace7d30b846401673183dcb42714de8f"

S = "${WORKDIR}/azure-mgmt-datalake-analytics-0.6.0"

RDEPENDS_${PN} = "python3-msrestazure python3-azure-common python3-azure-mgmt-datalake-nspkg"

inherit setuptools3
