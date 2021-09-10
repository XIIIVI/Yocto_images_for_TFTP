
SUMMARY = "Microsoft Azure Bot Service Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=b082ed26cc5f60cfa07b6edcaebeff46"

SRC_URI = "https://files.pythonhosted.org/packages/3f/93/1dd04ef5489d699378a539d665e0aa00b90c7147b810dd78564a85299619/azure-mgmt-botservice-1.0.0.zip"
SRC_URI[md5sum] = "e8c9a8f1546ae0d967b4f0fbb6c5fe2e"
SRC_URI[sha256sum] = "9dae4d749a2a072e22703318ea36e379aec20876c553b2889037c7bdec4b9546"

S = "${WORKDIR}/azure-mgmt-botservice-1.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
