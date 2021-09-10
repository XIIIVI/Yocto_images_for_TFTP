
SUMMARY = "Microsoft Azure Deployment Manager Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=ec3716b30480b0788c83abee77b8e68d"

SRC_URI = "https://files.pythonhosted.org/packages/bb/cb/04dab4b3d4822290345ba4388d21617284824e05e3220821c948b4b13f79/azure-mgmt-deploymentmanager-1.0.0.zip"
SRC_URI[md5sum] = "a29a40dd15372b38d0d701869cfd6210"
SRC_URI[sha256sum] = "9badb768617209149c33e68ca2e59c35b1d3d11427e2969872f2e236e14eee78"

S = "${WORKDIR}/azure-mgmt-deploymentmanager-1.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
