# The is automatic generated Code by "makePipRecipes.py"
# (build by Robin Sebastian (https://github.com/robseb) (git@robseb.de) Vers.: 1.2)

SUMMARY = "Recipe to embed the Python PiP Package oled_text"
HOMEPAGE ="https://pypi.org/project/oled_text"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MANIFEST.in;md5=5b29c632245f50a2be18f658fedefe12"

RDEPENDS_${PN} += "python3-pillow python3-customized-adafruit-blinka python3-adafruit-circuitpython-ssd"

inherit pypi setuptools3

PYPI_PACKAGE = "oled_text"
SRC_URI[md5sum] = "6f59a5523ee749864e1f81a8b26bf756"
SRC_URI[sha256sum] = "065b7df495661e22dd0df65db97fb845f19d62155dcd061d72ebbc2fe438a595"

RDEPENDS_${PN} += " \
    rpi-gpio \
"