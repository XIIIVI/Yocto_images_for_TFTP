
SUMMARY = "Platform detection for use by libraries like Adafruit-Blinka."
HOMEPAGE = "https://github.com/adafruit/Adafruit_Python_PlatformDetect"
AUTHOR = "Adafruit Industries <circuitpython@adafruit.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fccd531dce4b989c05173925f0bbb76c"

SRC_URI = "https://files.pythonhosted.org/packages/58/31/a53cc50f6b3344530c3165ebd3521314b5acf07c6172f2193599ba683b41/Adafruit-PlatformDetect-3.15.3.tar.gz"
SRC_URI[md5sum] = "be3aedf7badb1216c1a2b108cb18e3df"
SRC_URI[sha256sum] = "726782879e1dc18c1b2f50301ab3f04c3a7817a54e35c955ee2bb64a6d60df74"

S = "${WORKDIR}/Adafruit-PlatformDetect-3.15.3"

RDEPENDS_${PN} = ""
DEPENDS += "python3-setuptools-scm-native"

inherit setuptools3
