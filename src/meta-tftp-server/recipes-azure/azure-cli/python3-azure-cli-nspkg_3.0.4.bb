
SUMMARY = "Microsoft Azure CLI Namespace Package"
HOMEPAGE = "https://github.com/Azure/azure-cli"
AUTHOR = "Microsoft Corporation <azpycli@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=8beb13089a7d41da73a5dc5f34d8e9e8"

SRC_URI = "https://files.pythonhosted.org/packages/ff/4c/f4042805fe07ee2196c903bdd2dcae152b21d3a1404bb6033dec23e883c1/azure-cli-nspkg-3.0.4.tar.gz"
SRC_URI[md5sum] = "c6668b8a309955e8da36a2ff69adaa68"
SRC_URI[sha256sum] = "1bde56090f548c6435bd3093995cf88e4c445fb040604df8b5b5f70780d79181"

S = "${WORKDIR}/azure-cli-nspkg-3.0.4"

inherit setuptools3
