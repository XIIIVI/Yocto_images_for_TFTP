
SUMMARY = "Microsoft Azure Container Service Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=53a7d64793e874140a94fdf07c808f73"

SRC_URI = "https://files.pythonhosted.org/packages/52/f2/f123779a2ced801ef58dbc0b2f218b2f7b1cde8f78adeb9c411b23c21eac/azure-mgmt-containerservice-16.1.0.zip"
SRC_URI[md5sum] = "15c2db6dbf5cd12a2c26b96bc9222b1b"
SRC_URI[sha256sum] = "3654c8ace2b8868d0ea9c4c78c74f51e86e23330c7d8a636d132253747e6f3f4"

S = "${WORKDIR}/azure-mgmt-containerservice-16.1.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
