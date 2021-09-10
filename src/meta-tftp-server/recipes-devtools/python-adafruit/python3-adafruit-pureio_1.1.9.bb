
SUMMARY = "Pure python (i.e. no native extensions) access to Linux IO    including I2C and SPI. Drop in replacement for smbus and spidev modules."
HOMEPAGE = "https://github.com/adafruit/Adafruit_Python_PureIO"
AUTHOR = "Adafruit Industries <circuitpython@adafruit.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a21fcca821a506d4c36f7bbecc0d009"

SRC_URI = "https://files.pythonhosted.org/packages/df/ca/9162d4648669d12af16d5a66d808bdef6967eb684cbed9b1a3ebc19b361a/Adafruit_PureIO-1.1.9.tar.gz"
SRC_URI[md5sum] = "f7d2f93db567333321b4097b4858bea5"
SRC_URI[sha256sum] = "2caf22fb07c7f771d83267f331a76cde314723f884a9570ea6f768730c87a879"

S = "${WORKDIR}/Adafruit_PureIO-1.1.9"

RDEPENDS_${PN} = ""
DEPENDS += "python3-setuptools-scm-native"

inherit setuptools3
