
SUMMARY = "Query metadatdata from sdists / bdists / installed packages."
HOMEPAGE = "https://code.launchpad.net/~tseaver/pkginfo/trunk"
AUTHOR = "Tres Seaver, Agendaless Consulting <tseaver@agendaless.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6fc86b61c6077306ca1f5edc8edcc490"

SRC_URI = "https://files.pythonhosted.org/packages/23/3f/f2251c754073cda0f00043a707cba7db103654722a9afed965240a0b2b43/pkginfo-1.7.1.tar.gz"
SRC_URI[md5sum] = "9f437b69c1f0dd8333968dce61e64e49"
SRC_URI[sha256sum] = "e7432f81d08adec7297633191bbf0bd47faf13cd8724c3a13250e51d542635bd"

S = "${WORKDIR}/pkginfo-1.7.1"

RDEPENDS_${PN} = ""

inherit setuptools3
