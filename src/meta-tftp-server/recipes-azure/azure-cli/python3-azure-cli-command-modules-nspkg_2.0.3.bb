
SUMMARY = "Microsoft Azure CLI Command Modules Namespace Package"
HOMEPAGE = "https://github.com/Azure/azure-cli"
AUTHOR = "Microsoft Corporation <azpycli@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=d99f1cb9c996aa320bbbc3aebe372b4d"

SRC_URI = "https://files.pythonhosted.org/packages/f9/e4/88d5ac135701d4debaad95f4e421392621152ef2491d3e2cd67ec98353d5/azure-cli-command-modules-nspkg-2.0.3.tar.gz"
SRC_URI[md5sum] = "b5547ce916c59998cda188845f805775"
SRC_URI[sha256sum] = "4bd62bf5facb92dd4f89080e75eaee2ea1d3dd4e57a3d2a760ce501cf53f4e7d"

S = "${WORKDIR}/azure-cli-command-modules-nspkg-2.0.3"

RDEPENDS_${PN} = "python3-azure-cli-nspkg"

inherit setuptools3
