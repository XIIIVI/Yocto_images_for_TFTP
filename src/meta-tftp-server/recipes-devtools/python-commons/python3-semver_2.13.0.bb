
SUMMARY = "Python helper for Semantic Versioning (http://semver.org/)"
HOMEPAGE = "https://github.com/python-semver/python-semver"
AUTHOR = "Kostiantyn Rybnikov <k-bx@k-bx.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d9da679db3bdce30a1b4328d5c474f98"

SRC_URI = "https://files.pythonhosted.org/packages/31/a9/b61190916030ee9af83de342e101f192bbb436c59be20a4cb0cdb7256ece/semver-2.13.0.tar.gz"
SRC_URI[md5sum] = "e98b5fb283ea84daa5195087de83ebf1"
SRC_URI[sha256sum] = "fa0fe2722ee1c3f57eac478820c3a5ae2f624af8264cbdf9000c980ff7f75e3f"

S = "${WORKDIR}/semver-2.13.0"

RDEPENDS_${PN} = ""

inherit setuptools3
