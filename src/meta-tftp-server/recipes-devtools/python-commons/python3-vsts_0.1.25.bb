
SUMMARY = "Python wrapper around the VSTS APIs"
HOMEPAGE = "https://github.com/Microsoft/vsts-python-api"
AUTHOR = "Microsoft Corporation <vstscli@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5b7c0ba85608692ad50bcf6bd50667f8"

SRC_URI = "https://files.pythonhosted.org/packages/ce/fa/4405cdb2a6b0476a94b24254cdfb1df7ff43138a91ccc79cd6fc877177af/vsts-0.1.25.tar.gz"
SRC_URI[md5sum] = "678ea1e059a40703903786dd67b6021f"
SRC_URI[sha256sum] = "da179160121f5b38be061dbff29cd2b60d5d029b2207102454d77a7114e64f97"

S = "${WORKDIR}/vsts-0.1.25"

RDEPENDS_${PN} = "python3-msrest"

inherit setuptools3
