
SUMMARY = "Microsoft Azure Synapse Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=953dfb2473c06f513cec4c2192abd2fa"

SRC_URI = "https://files.pythonhosted.org/packages/af/fa/5a7c375d305ec0ec06978db07ac34c4894d2b8a00087ff3dd9e1435e397f/azure-mgmt-synapse-2.0.0.zip"
SRC_URI[md5sum] = "56eb7889ae585af923d5fff30afae0e5"
SRC_URI[sha256sum] = "bec6bdfaeb55b4fdd159f2055e8875bf50a720bb0fce80a816e92a2359b898c8"

S = "${WORKDIR}/azure-mgmt-synapse-2.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
