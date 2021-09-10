
SUMMARY = "Microsoft Azure Servicefabricmanagedclusters Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=46c02c1ab74bac9df40cb05ccafe0a16"

SRC_URI = "https://files.pythonhosted.org/packages/0c/94/fd20fa0fa04919c015fa7376b16d9f4be04c05b15d0d5137fc0013842687/azure-mgmt-servicefabricmanagedclusters-1.0.0.zip"
SRC_URI[md5sum] = "cbca8d3552a2c60bdacfcbf4eaaaf776"
SRC_URI[sha256sum] = "109ca3a251ebb7ddb35a0f8829614a4daa7065a16bc13b52c8422ee7f9995ce8"

S = "${WORKDIR}/azure-mgmt-servicefabricmanagedclusters-1.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-mgmt-core python3-azure-common"

inherit setuptools3
