
SUMMARY = "Microsoft Azure Recovery Services Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=8d050ab5d20c25d26fac58a12ad4cd2f"

SRC_URI = "https://files.pythonhosted.org/packages/1c/e6/e36d27dcfe788e426cd9a4828b3e49f75a755d3fca6b5e9f78a2b407c4a1/azure-mgmt-recoveryservices-2.0.0.zip"
SRC_URI[md5sum] = "d104f0863004d588affad005cd50d944"
SRC_URI[sha256sum] = "a7d3137d5c460f50ac2d44061d60a70b4f2779d4ca844b77419b5725e65e09be"

S = "${WORKDIR}/azure-mgmt-recoveryservices-2.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
