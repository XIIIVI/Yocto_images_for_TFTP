
SUMMARY = "FTDI device driver (pure Python)"
HOMEPAGE = "http://github.com/eblot/pyftdi"
AUTHOR = "Emmanuel Blot <emmanuel.blot@free.fr>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=5b826adbe4f2f6a6c8e9c8ca876d68eb"

SRC_URI = "https://files.pythonhosted.org/packages/22/d7/9398c699e355f0aaab6b5e0a02dab9f15c2c73913647fb74425c89bddbd5/pyftdi-0.53.3.tar.gz"
SRC_URI[md5sum] = "764303aca4daabcadb827a92df8f460e"
SRC_URI[sha256sum] = "4ef20c246bdb0f278d283337d7a6e69cf9bdb0ead525e7ad867d9e46ad26e613"

S = "${WORKDIR}/pyftdi-0.53.3"

RDEPENDS_${PN} = "python3-pyusb python3-pyserial"

inherit setuptools3
