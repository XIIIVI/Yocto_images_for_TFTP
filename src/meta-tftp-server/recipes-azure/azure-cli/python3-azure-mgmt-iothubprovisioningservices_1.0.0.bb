
SUMMARY = "Microsoft Azure IoTHub Provisioning Services Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=d4753783983ee9fb12b6497eb788a2d4"

SRC_URI = "https://files.pythonhosted.org/packages/e9/09/68a04356e00925cfcaa2928b60cc1757dc609c604d12ce0671f55147f9cf/azure-mgmt-iothubprovisioningservices-1.0.0.zip"
SRC_URI[md5sum] = "9fc85736abb0a1188d52948592abdafa"
SRC_URI[sha256sum] = "e5871b03488b5ae6dfc441cdbda40cb39c000635ee57c513053792b3c15826a9"

S = "${WORKDIR}/azure-mgmt-iothubprovisioningservices-1.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-mgmt-core python3-azure-common"

inherit setuptools3
