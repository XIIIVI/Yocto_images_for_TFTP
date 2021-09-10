
SUMMARY = "Bash tab completion for argparse"
HOMEPAGE = "https://github.com/kislyuk/argcomplete"
AUTHOR = "Andrey Kislyuk <kislyuk@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI = "https://files.pythonhosted.org/packages/6a/b4/3b1d48b61be122c95f4a770b2f42fc2552857616feba4d51f34611bd1352/argcomplete-1.12.3.tar.gz"
SRC_URI[md5sum] = "ded03f9c5d41c193dfe5869634d78211"
SRC_URI[sha256sum] = "2c7dbffd8c045ea534921e63b0be6fe65e88599990d8dc408ac8c542b72a5445"

S = "${WORKDIR}/argcomplete-1.12.3"

RDEPENDS_${PN} = ""

inherit setuptools3
