
SUMMARY = "Python package for providing Mozilla's CA Bundle."
HOMEPAGE = "https://certifiio.readthedocs.io/en/latest/"
AUTHOR = "Kenneth Reitz <me@kennethreitz.com>"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=67da0714c3f9471067b729eca6c9fbe8"

SRC_URI = "https://files.pythonhosted.org/packages/6d/78/f8db8d57f520a54f0b8a438319c342c61c22759d8f9a1cd2e2180b5e5ea9/certifi-2021.5.30.tar.gz"
SRC_URI[md5sum] = "4b38238b7305fcb3ffbc4368be4e8845"
SRC_URI[sha256sum] = "2bbf76fd432960138b3ef6dda3dde0544f27cbf8546c458e60baf371917ba9ee"

S = "${WORKDIR}/certifi-2021.5.30"

RDEPENDS_${PN} = ""

inherit setuptools3
