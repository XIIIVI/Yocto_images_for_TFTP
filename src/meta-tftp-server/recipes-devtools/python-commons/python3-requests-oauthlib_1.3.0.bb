
SUMMARY = "OAuthlib authentication support for Requests."
HOMEPAGE = "https://github.com/requests/requests-oauthlib"
AUTHOR = "Kenneth Reitz <me@kennethreitz.com>"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=22d117a849df10d047ed9b792838e863"

SRC_URI = "https://files.pythonhosted.org/packages/23/eb/68fc8fa86e0f5789832f275c8289257d8dc44dbe93fce7ff819112b9df8f/requests-oauthlib-1.3.0.tar.gz"
SRC_URI[md5sum] = "1ebcd55f1b1b9281940b4bc33010e2ba"
SRC_URI[sha256sum] = "b4261601a71fd721a8bd6d7aa1cc1d6a8a93b4a9f5e96626f8e4d91e8beeaa6a"

S = "${WORKDIR}/requests-oauthlib-1.3.0"

RDEPENDS_${PN} = ""

inherit setuptools3
