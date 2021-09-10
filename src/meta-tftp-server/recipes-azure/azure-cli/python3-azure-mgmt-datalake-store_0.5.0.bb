
SUMMARY = "Microsoft Azure Data Lake Store Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=eb1ef2f32dcffcfb04059ccd3ae1a706"

SRC_URI = "https://files.pythonhosted.org/packages/00/13/037f0128bdfcd47253f69a3b4ca6a7ff7b673b35832bc48f7c74df24a9be/azure-mgmt-datalake-store-0.5.0.zip"
SRC_URI[md5sum] = "c90aafcd3ea5c750c78547b414a78f7b"
SRC_URI[sha256sum] = "9376d35495661d19f8acc5604f67b0bc59493b1835bbc480f9a1952f90017a4c"

S = "${WORKDIR}/azure-mgmt-datalake-store-0.5.0"

RDEPENDS_${PN} = "python3-azure-common python3-azure-mgmt-datalake-nspkg python3-msrestazure"

inherit setuptools3
