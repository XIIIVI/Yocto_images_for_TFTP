
SUMMARY = "Microsoft Azure Databoxedge Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=bca2ddf296b05b0d4226d45f52f1e4cc"

SRC_URI = "https://files.pythonhosted.org/packages/bc/97/e6f9041c0e22cdf3fa8f5ccfec70daf0d1c15740bc5f36e8e9694ff98a98/azure-mgmt-databoxedge-1.0.0.zip"
SRC_URI[md5sum] = "92bec9db400f0cfc8769f8d287e6982f"
SRC_URI[sha256sum] = "04090062bc1e8f00c2f45315a3bceb0fb3b3479ec1474d71b88342e13499b087"

S = "${WORKDIR}/azure-mgmt-databoxedge-1.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
