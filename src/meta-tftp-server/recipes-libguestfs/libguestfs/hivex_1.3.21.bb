DESCRIPTION = "Hivex"

LICENSE = "MIT"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI = "https://download.libguestfs.org/hivex/hivex-${PV}.tar.gz"

SRC_URI[md5sum] = "1b9168c6454ba21c469990d90e4b93b5"

# Make sure our source directory (for the build) matches the directory structure in the tarball
S = "${WORKDIR}/hivex-${PV}"

DEPENDS = " \
"

RDEPENDS_${PN} = " \
"

inherit autotools pkgconfig