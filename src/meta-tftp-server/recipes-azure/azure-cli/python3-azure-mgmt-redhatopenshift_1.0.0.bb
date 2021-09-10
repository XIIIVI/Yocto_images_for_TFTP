
SUMMARY = "Microsoft Azure Red Hat Openshift Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=81d13a9524f7381970f72d733b05b769"

SRC_URI = "https://files.pythonhosted.org/packages/a5/16/ff6b3e2aa6b13348b60b52c164d4bd2aa3da65a95793f964474ea75e26fa/azure-mgmt-redhatopenshift-1.0.0.zip"
SRC_URI[md5sum] = "4010cf791b8726486194e03995c16ce3"
SRC_URI[sha256sum] = "94cd41f1ebd82e40620fd3e6d88f666b5c19ac7cf8b4e8edadb9721bd7c80980"

S = "${WORKDIR}/azure-mgmt-redhatopenshift-1.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
