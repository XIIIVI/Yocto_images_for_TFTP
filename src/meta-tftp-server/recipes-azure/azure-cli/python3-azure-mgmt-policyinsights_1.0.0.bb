
SUMMARY = "Microsoft Azure Policy Insights Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=0f812cebbbbddff3610b0c9c2e252912"

SRC_URI = "https://files.pythonhosted.org/packages/d3/02/9353c3f24f92c424ce0ee05f7defa373f6c4db1a396154f2c15a2603737c/azure-mgmt-policyinsights-1.0.0.zip"
SRC_URI[md5sum] = "030fc07ccd65a5df7d93f8fd445e4bb6"
SRC_URI[sha256sum] = "75103fb4541aeae30bb687dee1fedd9ca65530e6b97b2d9ea87f74816905202a"

S = "${WORKDIR}/azure-mgmt-policyinsights-1.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
