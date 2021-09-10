
SUMMARY = "scp module for paramiko"
HOMEPAGE = "https://github.com/jbardin/scp.py"
AUTHOR = "James Bardin <j.bardin@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=fc264c65fb17b7db5237cf7ce1780769"

SRC_URI = "https://files.pythonhosted.org/packages/7f/3c/3bfda15f1387d44721f78d338c004ebca27b1015c275da4d3272654be152/scp-0.14.0.tar.gz"
SRC_URI[md5sum] = "7ade5cad0379f5e1ef5f4f2786be6832"
SRC_URI[sha256sum] = "ddbdb3ef8c068aa1fd37a5fa65a122a80673c9fd73fdc5668a4604f99ccf5943"

S = "${WORKDIR}/scp-0.14.0"

RDEPENDS_${PN} = ""

inherit setuptools3
