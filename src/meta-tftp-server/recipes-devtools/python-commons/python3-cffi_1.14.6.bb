
SUMMARY = "Foreign Function Interface for Python calling C code."
HOMEPAGE = "http://cffi.readthedocs.org"
AUTHOR = "Armin Rigo, Maciej Fijalkowski <python-cffi@googlegroups.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5677e2fdbf7cdda61d6dd2b57df547bf"

SRC_URI = "https://files.pythonhosted.org/packages/2e/92/87bb61538d7e60da8a7ec247dc048f7671afe17016cd0008b3b710012804/cffi-1.14.6.tar.gz"
SRC_URI[md5sum] = "5c118a18ea897df164dbff67a32876fc"
SRC_URI[sha256sum] = "c9a875ce9d7fe32887784274dd533c57909b7b1dcadcc128a2ac21331a9765dd"

S = "${WORKDIR}/cffi-1.14.6"

RDEPENDS_${PN} = "python3-pycparser"

inherit setuptools3
