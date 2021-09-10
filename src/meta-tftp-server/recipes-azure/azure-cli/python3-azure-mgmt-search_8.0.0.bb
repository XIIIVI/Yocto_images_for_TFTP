
SUMMARY = "Microsoft Azure Search Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=d409973364f797b1e38e1e0c25883a57"

SRC_URI = "https://files.pythonhosted.org/packages/fe/ad/39e9f7c32b6656c3e76a9b7a097678ed7dee0ecd19dee1e661c8270a39c0/azure-mgmt-search-8.0.0.zip"
SRC_URI[md5sum] = "bdd2bbff26ea553f05aee581cad031c8"
SRC_URI[sha256sum] = "a96d50c88507233a293e757202deead980c67808f432b8e897c4df1ca088da7e"

S = "${WORKDIR}/azure-mgmt-search-8.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
