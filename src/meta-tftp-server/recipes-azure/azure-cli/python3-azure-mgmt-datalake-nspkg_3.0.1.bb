
SUMMARY = "Microsoft Azure Data Lake Management Namespace Package [Internal]"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=d814dc08a61a0a4e63329653023b9cff"

SRC_URI = "https://files.pythonhosted.org/packages/8e/0c/7b705f7c4a41bfeb0b6f3557f227c71aa3fa71555ed76ae934aa7db4b13e/azure-mgmt-datalake-nspkg-3.0.1.zip"
SRC_URI[md5sum] = "72efb79ff939b7a137e67569e8278b87"
SRC_URI[sha256sum] = "deb192ba422f8b3ec272ce4e88736796f216f28ea5b03f28331d784b7a3f4880"

S = "${WORKDIR}/azure-mgmt-datalake-nspkg-3.0.1"

RDEPENDS_${PN} = "python3-azure-mgmt-nspkg"

inherit setuptools3
