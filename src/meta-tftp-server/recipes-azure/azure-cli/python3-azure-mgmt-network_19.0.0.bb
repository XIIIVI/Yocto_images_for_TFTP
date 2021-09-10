
SUMMARY = "Microsoft Azure Network Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=bc09d76df21b91103bebcce93f2596c4"

SRC_URI = "https://files.pythonhosted.org/packages/19/85/68b683e7e0a4d3228fb7f9c5b33b7662eaac0aa32be620b866c197b3041a/azure-mgmt-network-19.0.0.zip"
SRC_URI[md5sum] = "7c5097f4fd1c52e7c5aeda81119d4a69"
SRC_URI[sha256sum] = "5e39a26ae81fa58c13c02029700f8c7b22c3fd832a294c543e3156a91b9459e8"

S = "${WORKDIR}/azure-mgmt-network-19.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
