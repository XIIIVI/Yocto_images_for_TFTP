
SUMMARY = "A module to control Raspberry Pi GPIO channels"
HOMEPAGE = "http://sourceforge.net/projects/raspberry-gpio-python/"
AUTHOR = "Ben Croston <ben@croston.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=42e81ca9bba7236644a26d48df85d091"

SRC_URI = "https://files.pythonhosted.org/packages/cb/88/d3817eb11fc77a8d9a63abeab8fe303266b1e3b85e2952238f0da43fed4e/RPi.GPIO-0.7.0.tar.gz"
SRC_URI[md5sum] = "777617f9dea9a1680f9af43db0cf150e"
SRC_URI[sha256sum] = "7424bc6c205466764f30f666c18187a0824077daf20b295c42f08aea2cb87d3f"

S = "${WORKDIR}/RPi.GPIO-0.7.0"

RDEPENDS_${PN} = ""

inherit setuptools3
