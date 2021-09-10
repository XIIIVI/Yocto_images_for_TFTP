
SUMMARY = "Read & write Java .properties files"
HOMEPAGE = "https://github.com/jwodder/javaproperties"
AUTHOR = "John Thorvald Wodder II <javaproperties@varonathe.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=56e10e025f991269451c8df073056f86"

SRC_URI = "https://files.pythonhosted.org/packages/db/43/58b89453727acdcf07298fe0f037e45b3988e5dcc78af5dce6881d0d2c5e/javaproperties-0.5.1.tar.gz"
SRC_URI[md5sum] = "842f34fa854d2196707d6edd5772b76d"
SRC_URI[sha256sum] = "2b0237b054af4d24c74f54734b7d997ca040209a1820e96fb4a82625f7bd40cf"

S = "${WORKDIR}/javaproperties-0.5.1"

RDEPENDS_${PN} = "python3-six"

inherit setuptools3
