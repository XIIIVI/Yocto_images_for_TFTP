
SUMMARY = "Distro - an OS platform information API"
HOMEPAGE = "https://github.com/python-distro/distro"
AUTHOR = "Nir Cohen <nir36g@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d2794c0df5b907fdace235a619d80314"

SRC_URI = "https://files.pythonhosted.org/packages/a5/26/256fa167fe1bf8b97130b4609464be20331af8a3af190fb636a8a7efd7a2/distro-1.6.0.tar.gz"
SRC_URI[md5sum] = "50a8d9a435e48a50fb338e80fa8307b9"
SRC_URI[sha256sum] = "83f5e5a09f9c5f68f60173de572930effbcc0287bb84fdc4426cb4168c088424"

S = "${WORKDIR}/distro-1.6.0"

RDEPENDS_${PN} = ""

inherit setuptools3
