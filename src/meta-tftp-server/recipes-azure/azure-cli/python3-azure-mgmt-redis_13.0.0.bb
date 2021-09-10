
SUMMARY = "Microsoft Azure Redis Cache Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=e820fe550f286d5687dd29bf0fb44eb6"

SRC_URI = "https://files.pythonhosted.org/packages/73/86/fdfb93bc1049aae79942ec46125c04ce1e352bf0c0ff80fc77dee9564870/azure-mgmt-redis-13.0.0.zip"
SRC_URI[md5sum] = "f359acc169d5db885be97dcc3c0c2fc0"
SRC_URI[sha256sum] = "283f776afe329472c20490b1f2c21c66895058cb06fb941eccda42cc247217f1"

S = "${WORKDIR}/azure-mgmt-redis-13.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
