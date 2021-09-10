
SUMMARY = "Note: This library is already replaced by MSAL Python, available here: https://pypi.org/project/msal/ .ADAL Python remains available here as a legacy. The ADAL for Python library makes it easy for python application to authenticate to Azure Active Directory (AAD) in order to access AAD protected web resources."
HOMEPAGE = "https://github.com/AzureAD/azure-activedirectory-library-for-python"
AUTHOR = "Microsoft Corporation <nugetaad@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=a777e128b67d90fab78e47a02d866e8b"

SRC_URI = "https://files.pythonhosted.org/packages/90/d7/a829bc5e8ff28f82f9e2dc9b363f3b7b9c1194766d5a75105e3885bfa9a8/adal-1.2.7.tar.gz"
SRC_URI[md5sum] = "710b6969efbc3b6be9f71eebefa700ee"
SRC_URI[sha256sum] = "d74f45b81317454d96e982fd1c50e6fb5c99ac2223728aea8764433a39f566f1"

S = "${WORKDIR}/adal-1.2.7"

RDEPENDS_${PN} = "python3-pyjwt python3-requests python3-python-dateutil python3-cryptography"

inherit setuptools3
