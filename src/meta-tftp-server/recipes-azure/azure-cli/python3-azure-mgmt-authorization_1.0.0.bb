
SUMMARY = "Microsoft Azure Authorization Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=7948d9c3d6e103a1a66c9b3196558d7a"

SRC_URI = "https://files.pythonhosted.org/packages/3a/26/ba81fe1ad5934ab67711939d6680f9937057b5563522f0cdc5bb44ed3620/azure-mgmt-authorization-1.0.0.zip"
SRC_URI[md5sum] = "152c2ff91318510c10182e2a64588337"
SRC_URI[sha256sum] = "9a9fc16866b46387853381ab4fa0f84c1765e0afea5b0124709ea9fae10ee752"

S = "${WORKDIR}/azure-mgmt-authorization-1.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
