
SUMMARY = "Internationalized Domain Names in Applications (IDNA)"
HOMEPAGE = "https://github.com/kjd/idna"
AUTHOR = "Kim Davies <kim@cynosure.com.au>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=239668a7c6066d9e0c5382e9c8c6c0e1"

SRC_URI = "https://files.pythonhosted.org/packages/cb/38/4c4d00ddfa48abe616d7e572e02a04273603db446975ab46bbcd36552005/idna-3.2.tar.gz"
SRC_URI[md5sum] = "08ea8e2ce09e522424e872409c221138"
SRC_URI[sha256sum] = "467fbad99067910785144ce333826c71fb0e63a425657295239737f7ecd125f3"

S = "${WORKDIR}/idna-3.2"

RDEPENDS_${PN} = ""

inherit setuptools3
