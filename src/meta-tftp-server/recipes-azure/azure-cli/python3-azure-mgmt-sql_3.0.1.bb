
SUMMARY = "Microsoft Azure SQL Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=e184b50d095f14c1f7d2100c66eb34a3"

SRC_URI = "https://files.pythonhosted.org/packages/3f/af/398c57d15064ea23475076cd087b1a143b66d33a029e6e47c4688ca32310/azure-mgmt-sql-3.0.1.zip"
SRC_URI[md5sum] = "6fd361ec4e54f0066dc128f17302dddc"
SRC_URI[sha256sum] = "129042cc011225e27aee6ef2697d585fa5722e5d1aeb0038af6ad2451a285457"

S = "${WORKDIR}/azure-mgmt-sql-3.0.1"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
