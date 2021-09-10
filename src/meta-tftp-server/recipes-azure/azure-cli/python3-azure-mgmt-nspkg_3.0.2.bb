
SUMMARY = "Microsoft Azure Resource Management Namespace Package [Internal]"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=8bdedb50a8c53672890b6edd85908e89"

SRC_URI = "https://files.pythonhosted.org/packages/c4/d4/a9a140ee15abd8b0a542c0d31b7212acf173582c10323b09380c79a1178b/azure-mgmt-nspkg-3.0.2.zip"
SRC_URI[md5sum] = "f62b88344ab0728b4d08250aadaf64c0"
SRC_URI[sha256sum] = "8b2287f671529505b296005e6de9150b074344c2c7d1c805b3f053d081d58c52"

S = "${WORKDIR}/azure-mgmt-nspkg-3.0.2"

inherit setuptools3
