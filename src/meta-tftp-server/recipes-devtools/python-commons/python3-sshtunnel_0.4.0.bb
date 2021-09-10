
SUMMARY = "Pure python SSH tunnels"
HOMEPAGE = "https://github.com/pahaz/sshtunnel"
AUTHOR = "Pahaz White <pahaz.white@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7b91de1feb2631e7bf2d74e8cef84bb6"

SRC_URI = "https://files.pythonhosted.org/packages/8d/ad/4c587adf79865be268ee0b6bd52cfaa7a75d827a23ced072dc5ab554b4af/sshtunnel-0.4.0.tar.gz"
SRC_URI[md5sum] = "4b523e55fa2b2c09acf9dbe2189fb1d1"
SRC_URI[sha256sum] = "e7cb0ea774db81bf91844db22de72a40aae8f7b0f9bb9ba0f666d474ef6bf9fc"

S = "${WORKDIR}/sshtunnel-0.4.0"

RDEPENDS_${PN} = "python3-paramiko"

inherit setuptools3
