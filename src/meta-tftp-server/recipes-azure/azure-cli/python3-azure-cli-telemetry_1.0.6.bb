
SUMMARY = "Microsoft Azure CLI Telemetry Package"
HOMEPAGE = "https://github.com/Azure/azure-cli"
AUTHOR = "Microsoft Corporation <azpycli@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=40d316ddf9d06c61eb536b7831031c75"

SRC_URI = "https://files.pythonhosted.org/packages/2e/b6/a28fb77132e29f50e185b24825c6ff925b37e9974d212273bda8eb5d13f6/azure-cli-telemetry-1.0.6.tar.gz"
SRC_URI[md5sum] = "ddbddb182e59cf2479d8598cbecdf490"
SRC_URI[sha256sum] = "fc6cadf59f14f3bbd6c01d1b4d6ad54cfc1456303510d8bdb6206db08c40e661"

S = "${WORKDIR}/azure-cli-telemetry-1.0.6"

RDEPENDS_${PN} = "python3-applicationinsights python3-portalocker"

inherit setuptools3
