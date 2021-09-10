
SUMMARY = "Microsoft Azure NetApp Files Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=2dac05c969467daa11ff26567f37c4e5"

SRC_URI = "https://files.pythonhosted.org/packages/7e/dc/c0d3b02a3a3177b941bfe7aca5f559513fc746f109665e3d19c30d8b9f71/azure-mgmt-netapp-5.0.0.zip"
SRC_URI[md5sum] = "65e2a0a7cc39cf03a6ae93dbe7d2ddb4"
SRC_URI[sha256sum] = "2d5163c49f91636809ef1cacd48d91130803594855f43afe0f2b31fc5f02d53c"

S = "${WORKDIR}/azure-mgmt-netapp-5.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
