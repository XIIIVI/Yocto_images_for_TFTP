
SUMMARY = "Microsoft Azure DNS Private Zones Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=af562ca4facfe4cf4d804217764e28f2"

SRC_URI = "https://files.pythonhosted.org/packages/72/f0/e8e401da635a72936c7edc32d4fdb7fcc4572400e0d66ed6ff6978b935a9/azure-mgmt-privatedns-1.0.0.zip"
SRC_URI[md5sum] = "d492b3e98197cc86e41345bf27b00b88"
SRC_URI[sha256sum] = "b60f16e43f7b291582c5f57bae1b083096d8303e9d9958e2c29227a55cc27c45"

S = "${WORKDIR}/azure-mgmt-privatedns-1.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-mgmt-core python3-azure-common"

inherit setuptools3
