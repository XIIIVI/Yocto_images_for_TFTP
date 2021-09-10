
SUMMARY = "Microsoft Azure Batch AI Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=64dde11689366ce2099a0e40f8b9167e"

SRC_URI = "https://files.pythonhosted.org/packages/fa/7f/0a9e5aa22ea91db0771c267c4815396516177702a4a4eea389eed7af47dd/azure-mgmt-batchai-2.0.0.zip"
SRC_URI[md5sum] = "6235495fa4c83bac95d7c84699b02a3f"
SRC_URI[sha256sum] = "f1870b0f97d5001cdb66208e5a236c9717a0ed18b34dbfdb238a828f3ca2a683"

S = "${WORKDIR}/azure-mgmt-batchai-2.0.0"

RDEPENDS_${PN} = "python3-msrestazure python3-azure-common python3-azure-mgmt-nspkg"

inherit setuptools3
