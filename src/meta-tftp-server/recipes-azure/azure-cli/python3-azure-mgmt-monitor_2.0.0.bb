
SUMMARY = "Microsoft Azure Monitor Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=a7e2acd5e79504440eb056393fbc396e"

SRC_URI = "https://files.pythonhosted.org/packages/d1/07/6109120151e9bb768a581fccea4adfc1016bcf3cfe7a167431d400b277ac/azure-mgmt-monitor-2.0.0.zip"
SRC_URI[md5sum] = "cfadb9a6304ea634645779d541c883c0"
SRC_URI[sha256sum] = "e7f7943fe8f0efe98b3b1996cdec47c709765257a6e09e7940f7838a0f829e82"

S = "${WORKDIR}/azure-mgmt-monitor-2.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
