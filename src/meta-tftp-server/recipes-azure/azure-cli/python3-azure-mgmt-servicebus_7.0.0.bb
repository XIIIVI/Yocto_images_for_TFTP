
SUMMARY = "Microsoft Azure Service Bus Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=c000522135353eba8337c59ae07fab65"

SRC_URI = "https://files.pythonhosted.org/packages/7c/1c/708acad1827fab6de5dad4651f7969ebe67b685f30c07ebbbb4685d9a3fa/azure-mgmt-servicebus-7.0.0.zip"
SRC_URI[md5sum] = "e1f75e90b04e101074fd80c8c1a42516"
SRC_URI[sha256sum] = "ee859efec2ec9fc8d059811967b1cb17836f4f5786e7406494a42f51f0667822"

S = "${WORKDIR}/azure-mgmt-servicebus-7.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
