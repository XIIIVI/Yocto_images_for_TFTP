
SUMMARY = "Microsoft Azure Image Builder Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=6c481e3216d1c2ae2d839134f58f9986"

SRC_URI = "https://files.pythonhosted.org/packages/25/37/63e5eca05f58b7d9d9f0525f389f1938afe0f593e4216679fb8af4a5bc6b/azure-mgmt-imagebuilder-0.4.0.zip"
SRC_URI[md5sum] = "4e4e3dfb5cb77bda2d584eb01684c46e"
SRC_URI[sha256sum] = "4c9291bf16b40b043637e5e4f15650f71418ac237393e62219cab478a7951733"

S = "${WORKDIR}/azure-mgmt-imagebuilder-0.4.0"

RDEPENDS_${PN} = "python3-msrest python3-msrestazure python3-azure-common"

inherit setuptools3
