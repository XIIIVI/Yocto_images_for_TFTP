
SUMMARY = "Python Libraries for Binho Multi-Protocol USB Host Adapters"
HOMEPAGE = "https://binho.io"
AUTHOR = "Binho LLC <support@binho.io>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=b661e6f6b3347668d0441cdee06d2b2d"

SRC_URI = "https://files.pythonhosted.org/packages/68/36/29b7b896e83e195fac6d64ccff95c0f24a18ee86e7437a22e60e0331d90a/binho-host-adapter-0.1.6.tar.gz"
SRC_URI[md5sum] = "c4e2bf1a92c53fa7c743fecac7dfd9d6"
SRC_URI[sha256sum] = "1e6da7a84e208c13b5f489066f05774bff1d593d0f5bf1ca149c2b8e83eae856"

S = "${WORKDIR}/binho-host-adapter-0.1.6"

RDEPENDS_${PN} = "python3-pyserial"

inherit setuptools3
