
SUMMARY = "Human friendly output for text interfaces using Python"
HOMEPAGE = "https://humanfriendly.readthedocs.io"
AUTHOR = "Peter Odding <peter@peterodding.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5d178009f806c2bdd498a19be0013a7a"

SRC_URI = "https://files.pythonhosted.org/packages/24/ca/f3a75b50d978872f6551d72c9c76890d68c84f3ba210cdba5f409587a2fc/humanfriendly-9.2.tar.gz"
SRC_URI[md5sum] = "c0c17b6b702cfbc3038de5c86b065da1"
SRC_URI[sha256sum] = "f7dba53ac7935fd0b4a2fc9a29e316ddd9ea135fb3052d3d0279d10c18ff9c48"

S = "${WORKDIR}/humanfriendly-9.2"

RDEPENDS_${PN} = ""

inherit setuptools3
