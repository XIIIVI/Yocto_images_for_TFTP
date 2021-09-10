
SUMMARY = "Wraps the portalocker recipe for easy usage"
HOMEPAGE = "https://github.com/WoLpH/portalocker"
AUTHOR = "Rick van Hattem <wolph@wol.ph>"
LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f9273424c73af966635d66eb53487e14"

SRC_URI = "https://files.pythonhosted.org/packages/38/2e/32172e8418f2ba284cee4fd67cb547d39a7debb3eed37d514da173786112/portalocker-2.3.2.tar.gz"
SRC_URI[md5sum] = "bd4908d035464aa440dd7f262ef78345"
SRC_URI[sha256sum] = "75cfe02f702737f1726d83e04eedfa0bda2cc5b974b1ceafb8d6b42377efbd5f"

S = "${WORKDIR}/portalocker-2.3.2"

RDEPENDS_${PN} = ""

inherit setuptools3
