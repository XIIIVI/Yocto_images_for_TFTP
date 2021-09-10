
SUMMARY = "Microsoft Azure IoTHub Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=68cdff9a9cfcb28130ef5abc5f344416"

SRC_URI = "https://files.pythonhosted.org/packages/16/89/fda1663a6caa121bbefe88a40804691b0063abc2205d14d0d390d8127fb5/azure-mgmt-iothub-2.1.0.zip"
SRC_URI[md5sum] = "f3e0c93d5d2fe3d29a4e118ef1fa2543"
SRC_URI[sha256sum] = "2724f48cadb1be7ee96fc26c7bfa178f82cea5d325e785e91d9f26965fa8e46f"

S = "${WORKDIR}/azure-mgmt-iothub-2.1.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
