
SUMMARY = "Microsoft Azure DevTestLabs Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=183f9c1d20ff9bb3ceb58241bf4af94a"

SRC_URI = "https://files.pythonhosted.org/packages/cc/13/ff268e12b886d130bdfad8c5894f7dc90affd2b681057301463c219986d5/azure-mgmt-devtestlabs-9.0.0.zip"
SRC_URI[md5sum] = "169cda1133622d61318cd3d1c3dfc531"
SRC_URI[sha256sum] = "d8160d93fd3d947e5613c6919176b0edf72c94ac69679ea3b92cf27ff7398e64"

S = "${WORKDIR}/azure-mgmt-devtestlabs-9.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
