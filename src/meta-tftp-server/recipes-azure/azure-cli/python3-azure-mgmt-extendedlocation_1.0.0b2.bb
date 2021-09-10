
SUMMARY = "Microsoft Azure Extendedlocation Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=a6702a6666cdf0d97a5f2208228c96e4"

SRC_URI = "https://files.pythonhosted.org/packages/b7/de/a7b62f053597506e01641c68e1708222f01cd7574e4147d4f645ff6e6aaa/azure-mgmt-extendedlocation-1.0.0b2.zip"
SRC_URI[md5sum] = "5efd26a3d75ad6bc8b664b1af7b503da"
SRC_URI[sha256sum] = "9a37c7df94fcd4943dee35601255a667c3f93305d5c5942ffd024a34b4b74fc0"

S = "${WORKDIR}/azure-mgmt-extendedlocation-1.0.0b2"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
