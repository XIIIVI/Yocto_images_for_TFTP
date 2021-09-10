
SUMMARY = "Microsoft Azure Command-Line Tools Storage Command Module"
HOMEPAGE = "https://github.com/Azure/azure-cli"
AUTHOR = "Microsoft Corporation <azpycli@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=76b950ec1f21a6cd2ddb263c85bcc6c4"

SRC_URI = "https://files.pythonhosted.org/packages/7c/d6/bb62828baf88ef0cfe66d23f59d63a171f8b902937557e4e3130cf5e4166/azure-cli-storage-2.4.3.tar.gz"
SRC_URI[md5sum] = "f87a898699bb6ce5cd3cfb26c8ce9040"
SRC_URI[sha256sum] = "e18ce6134d39c5a7335b60e573534e476d81df2dbae85bd15bf2cf7a7de10ae6"

S = "${WORKDIR}/azure-cli-storage-2.4.3"

RDEPENDS_${PN} = "python3-azure-multiapi-storage python3-azure-mgmt-storage python3-azure-cli-core python3-azure-cli-command-modules-nspkg"

inherit setuptools3
