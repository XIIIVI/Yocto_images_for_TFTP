
SUMMARY = "Userspace Raspberry Pi PWM/PCM/SPI library for SK6812 and WS281X LEDs."
HOMEPAGE = "https://github.com/rpi-ws281x/rpi-ws281x-python/"
AUTHOR = "Jeremy Garff <jer@jers.net>, Phil Howard <phil@pimoroni.com> <jer@jers.net, phil@pimoroni.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9dcf340793a1d73c5211edc8238767dc"

SRC_URI = "https://files.pythonhosted.org/packages/cd/b3/eb7ac93376952f165577707ec756f40c9537ed53c59fcbc3290c357370e0/rpi_ws281x-4.3.0.tar.gz"
SRC_URI[md5sum] = "333dacfc58058d5f485f9af74551c70e"
SRC_URI[sha256sum] = "0b9549687ab7117acbc4bac0e92742fd2c8290fd204514d72fed91c06ba2e805"

S = "${WORKDIR}/rpi_ws281x-4.3.0"

RDEPENDS_${PN} = ""

inherit setuptools3
