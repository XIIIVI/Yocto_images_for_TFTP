
SUMMARY = "Microsoft Azure App Configuration Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=abaeb5088824afd4a527af6acdb6b46c"

SRC_URI = "https://files.pythonhosted.org/packages/36/c1/17364b213669823e8c6deb126ad0bf8f5079bd84aef4b4150f90e6388cfd/azure-mgmt-appconfiguration-2.0.0.zip"
SRC_URI[md5sum] = "05c3bf23ad813923dbce8b5a143c4110"
SRC_URI[sha256sum] = "97e990ec6a5a3acafc7fc1add8ff1a160ebb2052792931352fd7cf1d90f1f956"

S = "${WORKDIR}/azure-mgmt-appconfiguration-2.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
