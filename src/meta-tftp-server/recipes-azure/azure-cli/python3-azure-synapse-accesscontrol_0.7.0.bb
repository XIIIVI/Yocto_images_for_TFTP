
SUMMARY = "Microsoft Azure Synapse AccessControl Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=446cfdee5891743ed33ff9717f75d3f3"

SRC_URI = "https://files.pythonhosted.org/packages/97/8d/2f500e6be6fa200e656e09f83b1627ba6302fee7a1743b394c7a6ca4fd94/azure-synapse-accesscontrol-0.7.0.zip"
SRC_URI[md5sum] = "b9ea0a287c1fa76d6fb01187cc7072d1"
SRC_URI[sha256sum] = "565aa26336d560c028775e8ae50d0691aa7089e96170e78342371b773da3137c"

S = "${WORKDIR}/azure-synapse-accesscontrol-0.7.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-core"

inherit setuptools3
