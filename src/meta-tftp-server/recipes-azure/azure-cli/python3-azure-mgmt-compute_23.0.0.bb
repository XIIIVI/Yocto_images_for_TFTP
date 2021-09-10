
SUMMARY = "Microsoft Azure Compute Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=d8f1c0172173301284fff3fd47c9ec49"

SRC_URI = "https://files.pythonhosted.org/packages/1b/69/881387160e6b70e8241e80550a88477492e613164ec1e3c6a6d047ad9c55/azure-mgmt-compute-23.0.0.zip"
SRC_URI[md5sum] = "527fc4c2960aeacf8b9d6e512e70edf2"
SRC_URI[sha256sum] = "1eb26b965ba4049ddcf10d4f25818725fc03c491c3be76537d0d74ceb1146b04"

S = "${WORKDIR}/azure-mgmt-compute-23.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
