
SUMMARY = ""
HOMEPAGE = ""
AUTHOR = " <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=485ab7aa555584ef0f8936cc644af58a"

SRC_URI = "https://files.pythonhosted.org/packages/8e/76/32e0bc0ab99c439aadf854751601bf9ad8aca01c884cf30fab0a29746c6b/msal-extensions-0.3.0.tar.gz"
SRC_URI[md5sum] = "38cd5cc1de164514ecff2335b09b93a9"
SRC_URI[sha256sum] = "5523dfa15da88297e90d2e73486c8ef875a17f61ea7b7e2953a300432c2e7861"

S = "${WORKDIR}/msal-extensions-0.3.0"

RDEPENDS_${PN} = "python3-msal"

inherit setuptools3
