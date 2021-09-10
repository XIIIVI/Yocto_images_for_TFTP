
SUMMARY = "Microsoft Azure Maps Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=c78ea553a33e2775a194f9a6985864f8"

SRC_URI = "https://files.pythonhosted.org/packages/c2/d1/35d471f400b612b38473ffa7747ba5fa2f79f47e410009fb887db19a4e8a/azure-mgmt-maps-2.0.0.zip"
SRC_URI[md5sum] = "d771988049cb07b015d8b5e6b4f4959a"
SRC_URI[sha256sum] = "384e17f76a68b700a4f988478945c3a9721711c0400725afdfcb63cf84e85f0e"

S = "${WORKDIR}/azure-mgmt-maps-2.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
