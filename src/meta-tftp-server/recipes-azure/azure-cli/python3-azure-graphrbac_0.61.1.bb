
SUMMARY = "Microsoft Azure Graph RBAC Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=1f0a12561dba67d716e24692b00086cc"

SRC_URI = "https://files.pythonhosted.org/packages/52/31/87dd867c239b5b2c5bccade8a0fd81c28b9b380ece3db47b58ae05270842/azure-graphrbac-0.61.1.zip"
SRC_URI[md5sum] = "9ec2c4483510c27776ef501f35f336ea"
SRC_URI[sha256sum] = "53e98ae2ca7c19b349e9e9bb1b6a824aeae8dcfcbe17190d20fe69c0f185b2e2"

S = "${WORKDIR}/azure-graphrbac-0.61.1"

RDEPENDS_${PN} = "python3-msrest python3-msrestazure python3-azure-common"

inherit setuptools3
