
SUMMARY = "Microsoft Azure Recoveryservicesbackup Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=474260026741df39f2970c1e3f2cede7"

SRC_URI = "https://files.pythonhosted.org/packages/f4/8f/26e2829be414c90c6bc50aa812f74cd274a116cd415808c63d7cb1cbc470/azure-mgmt-recoveryservicesbackup-2.0.0.zip"
SRC_URI[md5sum] = "f44b1bbc41dfa209839b13e520d38a65"
SRC_URI[sha256sum] = "d3e60daefbc20a7fa381c7ad1498f4bf4bb5a1414c1c64188cc9d5c98c4e12ac"

S = "${WORKDIR}/azure-mgmt-recoveryservicesbackup-2.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
