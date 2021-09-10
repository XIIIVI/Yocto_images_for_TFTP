
SUMMARY = "Diff JSON and JSON-like structures in Python"
HOMEPAGE = "https://github.com/ZoomerAnalytics/jsondiff"
AUTHOR = "Zoomer Analytics LLC <eric.reynolds@zoomeranalytics.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=792c1f2e813587ebc2e046ff8dff59ae"

SRC_URI = "https://files.pythonhosted.org/packages/64/5c/2b4b0ae4d42cb1b0b1a89ab1c4d9fe02c72461e33a5d02009aa700574943/jsondiff-1.2.0.tar.gz"
SRC_URI[md5sum] = "d48297d9253356b7f71e38268e7e0d10"
SRC_URI[sha256sum] = "34941bc431d10aa15828afe1cbb644977a114e75eef6cc74fb58951312326303"

S = "${WORKDIR}/jsondiff-1.2.0"

RDEPENDS_${PN} = ""

inherit setuptools3
