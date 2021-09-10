
SUMMARY = "Microsoft Azure IoTCentral Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=f755a36a3bb8e0f36422c2e8b340cb9f"

SRC_URI = "https://files.pythonhosted.org/packages/1a/46/477222d36523dac138a68a76ea929a24bce7ca7b79959cc3fff81bb6d0d1/azure-mgmt-iotcentral-4.1.0.zip"
SRC_URI[md5sum] = "affd0bfd430864c9bf1c13b5e3d6d1ad"
SRC_URI[sha256sum] = "e6d4810f454c0d63a5e816eaa7e54a073a3f70b2256162ff1c234cfe91783ae6"

S = "${WORKDIR}/azure-mgmt-iotcentral-4.1.0"

RDEPENDS_${PN} = "python3-msrest python3-msrestazure python3-azure-common"

inherit setuptools3
