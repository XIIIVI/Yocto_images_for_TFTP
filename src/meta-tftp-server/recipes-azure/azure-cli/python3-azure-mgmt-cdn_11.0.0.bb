
SUMMARY = "Microsoft Azure CDN Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=378f3df7de1ca678d0813226f141f31d"

SRC_URI = "https://files.pythonhosted.org/packages/e5/65/fdba478260260b7e430924823adfb83a49277dbbfe1b53e5298df5a4cafa/azure-mgmt-cdn-11.0.0.zip"
SRC_URI[md5sum] = "2d603564138a086bce05373c199bc981"
SRC_URI[sha256sum] = "28e7070001e7208cdb6c2ad253ec78851abdd73be482230d2c0874eed5bc0907"

S = "${WORKDIR}/azure-mgmt-cdn-11.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
