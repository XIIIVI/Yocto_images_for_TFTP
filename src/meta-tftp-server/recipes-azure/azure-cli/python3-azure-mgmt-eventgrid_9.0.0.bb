
SUMMARY = "Microsoft Azure EventGrid Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=97dd96f1001444aeac6b48d342ac4d47"

SRC_URI = "https://files.pythonhosted.org/packages/c4/d4/081833d711a1e7e5159febc0351ff4b72800d3a6fe4c1961ceeecb9b29f9/azure-mgmt-eventgrid-9.0.0.zip"
SRC_URI[md5sum] = "c70d4f80b5961ce496d6a31c821bcbb3"
SRC_URI[sha256sum] = "aecbb69ecb010126c03668ca7c9a2be8e965568f5b560f0e7b5bc152b157b510"

S = "${WORKDIR}/azure-mgmt-eventgrid-9.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
