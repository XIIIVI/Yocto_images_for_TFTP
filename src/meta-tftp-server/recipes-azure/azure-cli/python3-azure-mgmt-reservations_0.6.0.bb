
SUMMARY = "Microsoft Azure Reservations Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=bbd6ea5bdd3c4170f0c15fa61c7f6902"

SRC_URI = "https://files.pythonhosted.org/packages/97/0a/eb194a08fd35bda1e6b27ef227241ac36c8abb3bf3a201772c2777a74caf/azure-mgmt-reservations-0.6.0.zip"
SRC_URI[md5sum] = "15b5410d19a12808186eff328aa65c2a"
SRC_URI[sha256sum] = "83a9a70d6fd78b8b3e92ca64bbc1fde8d1bc5e2efea54076052c51c946b4cc9b"

S = "${WORKDIR}/azure-mgmt-reservations-0.6.0"

RDEPENDS_${PN} = "python3-msrest python3-msrestazure python3-azure-common"

inherit setuptools3
