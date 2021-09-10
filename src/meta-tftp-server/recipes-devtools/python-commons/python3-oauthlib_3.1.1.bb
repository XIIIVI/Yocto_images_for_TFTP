
SUMMARY = "A generic, spec-compliant, thorough implementation of the OAuth request-signing logic"
HOMEPAGE = "https://github.com/oauthlib/oauthlib"
AUTHOR = "The OAuthlib Community <idan@gazit.me>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=abd2675e944a2011aed7e505290ba482"

SRC_URI = "https://files.pythonhosted.org/packages/9e/84/001a3f8d9680f3b26d5e7711e13d5ff92e4b511766a72ac6b4a4e5f06796/oauthlib-3.1.1.tar.gz"
SRC_URI[md5sum] = "9201e30a4eacf3ecfa15503b241ad5e3"
SRC_URI[sha256sum] = "8f0215fcc533dd8dd1bee6f4c412d4f0cd7297307d43ac61666389e3bc3198a3"

S = "${WORKDIR}/oauthlib-3.1.1"

RDEPENDS_${PN} = ""

inherit setuptools3
