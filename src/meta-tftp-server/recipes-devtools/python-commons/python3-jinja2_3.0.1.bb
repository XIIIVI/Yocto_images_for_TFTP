
SUMMARY = "A very fast and expressive template engine."
HOMEPAGE = "https://palletsprojects.com/p/jinja/"
AUTHOR = "Armin Ronacher <armin.ronacher@active-4.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

SRC_URI = "https://files.pythonhosted.org/packages/39/11/8076571afd97303dfeb6e466f27187ca4970918d4b36d5326725514d3ed3/Jinja2-3.0.1.tar.gz"
SRC_URI[md5sum] = "25ba6ef98c164878acff1036fbd72a1d"
SRC_URI[sha256sum] = "703f484b47a6af502e743c9122595cc812b0271f661722403114f71a79d0f5a4"

S = "${WORKDIR}/Jinja2-3.0.1"

RDEPENDS_${PN} = "python3-markupsafe"

inherit setuptools3
