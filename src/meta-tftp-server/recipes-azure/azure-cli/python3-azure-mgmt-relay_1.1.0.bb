
SUMMARY = "Microsoft Azure Relay Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=7874d881b6dde95967e6d3bbdded87ba"

SRC_URI = "https://files.pythonhosted.org/packages/bc/30/dea0afc2876b6afd761bf92776199a6bd066e85d0b4be224f055e810f74e/azure-mgmt-relay-1.1.0.zip"
SRC_URI[md5sum] = "33bc456a5e94c296e3e5a7d17af764f2"
SRC_URI[sha256sum] = "c93b7550e64b6734bf23ce57ca974a3ea929b734c58d1fe3669728c4fd2d2eb3"

S = "${WORKDIR}/azure-mgmt-relay-1.1.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
