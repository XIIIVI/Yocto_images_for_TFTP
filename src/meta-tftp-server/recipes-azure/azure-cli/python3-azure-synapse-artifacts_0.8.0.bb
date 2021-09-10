
SUMMARY = "Microsoft Azure Synapse Artifacts Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=12e034ccd52682d4c66bf22b034576e9"

SRC_URI = "https://files.pythonhosted.org/packages/c2/e3/f56c3e76d9a0e2323871db73f31c7b9e2941f267a01bf18611bf9502ae5d/azure-synapse-artifacts-0.8.0.zip"
SRC_URI[md5sum] = "2c84798c0dfe436b7a0f37ee6e7fb1f5"
SRC_URI[sha256sum] = "3d4fdfd0bd666984f7bdc7bc0c7a6018c35a5d46a81a32dd193b07c03b528b72"

S = "${WORKDIR}/azure-synapse-artifacts-0.8.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-core"

inherit setuptools3
