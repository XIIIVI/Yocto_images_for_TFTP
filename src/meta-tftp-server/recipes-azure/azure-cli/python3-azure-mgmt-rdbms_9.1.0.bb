
SUMMARY = "Microsoft Azure RDBMS Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=ffbc4f2e5004012ab05d73e1071e7af7"

SRC_URI = "https://files.pythonhosted.org/packages/d2/9c/3cecd80eed47ceaa0dfd13b1ff30aba2a6d7e0c1d25093ea2502f72bf991/azure-mgmt-rdbms-9.1.0.zip"
SRC_URI[md5sum] = "3965d2377f9194a47b513ee9ae549ca7"
SRC_URI[sha256sum] = "f738d9e6db8f6da6bb4e84e59dd0548c8adef948357a447337e78d1035ac960a"

S = "${WORKDIR}/azure-mgmt-rdbms-9.1.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
