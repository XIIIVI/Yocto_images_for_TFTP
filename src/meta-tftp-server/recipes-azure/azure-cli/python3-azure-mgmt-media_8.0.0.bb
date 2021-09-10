
SUMMARY = "Microsoft Azure Media Services Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=f3594d3ec0ac514402cce4dab0c1f2e6"

SRC_URI = "https://files.pythonhosted.org/packages/d2/c1/ddb361de865ff410ff3492eeefbe184ebdeeec32f6199d9e1bf96c66fde7/azure-mgmt-media-8.0.0.zip"
SRC_URI[md5sum] = "3a3004dd90516b0efa9dd3f530bd9f2b"
SRC_URI[sha256sum] = "c08e687c0afa061a3e05acaf29ce81e737480d592b07e0de5f77e9a7f9f00c00"

S = "${WORKDIR}/azure-mgmt-media-8.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
