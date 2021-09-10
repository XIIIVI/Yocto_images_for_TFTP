
SUMMARY = "AutoRest swagger generator Python client runtime."
HOMEPAGE = "https://github.com/Azure/msrest-for-python"
AUTHOR = "Microsoft Corporation <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=698500bd81f7f13e58a7e83c2963a993"

SRC_URI = "https://files.pythonhosted.org/packages/bb/2c/e8ac4f491efd412d097d42c9eaf79bcaad698ba17ab6572fd756eb6bd8f8/msrest-0.6.21.tar.gz"
SRC_URI[md5sum] = "553f2d0c54f4a550c05c76ce92639e3c"
SRC_URI[sha256sum] = "72661bc7bedc2dc2040e8f170b6e9ef226ee6d3892e01affd4d26b06474d68d8"

S = "${WORKDIR}/msrest-0.6.21"

RDEPENDS_${PN} = "python3-requests python3-requests-oauthlib python3-isodate python3-certifi"

inherit setuptools3
