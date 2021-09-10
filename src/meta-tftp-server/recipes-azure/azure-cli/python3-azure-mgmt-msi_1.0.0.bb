
SUMMARY = "Microsoft Azure MSI Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=849f24417c3816945349a193792e9bca"

SRC_URI = "https://files.pythonhosted.org/packages/a2/5c/6317ac7f7c19dbdc094efb516ebbc85acaad5a149f0dfc95c892b31d9411/azure-mgmt-msi-1.0.0.zip"
SRC_URI[md5sum] = "44ab2304ed9021f465b752fd3fca4286"
SRC_URI[sha256sum] = "d46f3aab25db3dad520e4055c1d67afe4fcc6d66335c762134e60f82265f8f58"

S = "${WORKDIR}/azure-mgmt-msi-1.0.0"

RDEPENDS_${PN} = "python3-msrest python3-msrestazure python3-azure-common"

inherit setuptools3
