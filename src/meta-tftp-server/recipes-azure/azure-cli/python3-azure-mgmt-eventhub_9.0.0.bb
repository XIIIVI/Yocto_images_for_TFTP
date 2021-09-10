
SUMMARY = "Microsoft Azure EventHub Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=96855018060a4ebea31d4e5bd35056fb"

SRC_URI = "https://files.pythonhosted.org/packages/a2/08/cc881cb05f016bcf0326f71eeefa0a94fa3e37f2f90182428d764c2ef7e2/azure-mgmt-eventhub-9.0.0.zip"
SRC_URI[md5sum] = "7adfb4ccecbc0a9109e59d62f0e67ccb"
SRC_URI[sha256sum] = "181f72adf9287741ded8e386c8934a722d08399d781ce1c452f0482aac1f019b"

S = "${WORKDIR}/azure-mgmt-eventhub-9.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
