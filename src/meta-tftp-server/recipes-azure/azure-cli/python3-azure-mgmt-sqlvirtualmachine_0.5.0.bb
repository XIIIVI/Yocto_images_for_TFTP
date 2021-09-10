
SUMMARY = "Microsoft Azure SQL Virtual Machine Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=c9f3cb137a7d51dda83bcc4eb6ff0e6d"

SRC_URI = "https://files.pythonhosted.org/packages/f6/03/efe8f2ea66d51a23d908ab08c6a7b5f55b43c16bafb8d703f69594c635cf/azure-mgmt-sqlvirtualmachine-0.5.0.zip"
SRC_URI[md5sum] = "d27f52e4b6ea15f65418140a48ef7088"
SRC_URI[sha256sum] = "b5a9423512a7b12844ac014366a1d53c81017a14f39676beedf004a532aa2aad"

S = "${WORKDIR}/azure-mgmt-sqlvirtualmachine-0.5.0"

RDEPENDS_${PN} = "python3-msrest python3-msrestazure python3-azure-common"

inherit setuptools3
