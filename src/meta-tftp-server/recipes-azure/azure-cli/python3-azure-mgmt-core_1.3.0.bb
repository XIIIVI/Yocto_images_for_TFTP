
SUMMARY = "Microsoft Azure Management Core Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python/tree/main/sdk/core/azure-mgmt-core"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=9714a4db9af8ac45d4777b479c5401ca"

SRC_URI = "https://files.pythonhosted.org/packages/b8/d1/924eed2ee15100f288b2c349e32bceacda1f7783ad07d4e5893b029660b0/azure-mgmt-core-1.3.0.zip"
SRC_URI[md5sum] = "6182b7dafb629b645bce0866a163d547"
SRC_URI[sha256sum] = "3ffb7352b39e5495dccc2d2b47254f4d82747aff4735e8bf3267c335b0c9bb40"

S = "${WORKDIR}/azure-mgmt-core-1.3.0"

RDEPENDS_${PN} = "python3-azure-core"

inherit setuptools3
