
SUMMARY = "Microsoft Azure Kusto Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=d76f046450751c041e56ce1c039d5e62"

SRC_URI = "https://files.pythonhosted.org/packages/e7/cf/ac298ea46eaf2a65af6afad23f5033b5e27263f4cbc27a3e3348266eae8a/azure-mgmt-kusto-2.0.0.zip"
SRC_URI[md5sum] = "535847d63c0ae06d0a4b169bf973df61"
SRC_URI[sha256sum] = "81601479e2b6da3e69654462674ef1474218c4415ef25c1d9892939721732153"

S = "${WORKDIR}/azure-mgmt-kusto-2.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
