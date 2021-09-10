
SUMMARY = "This project extends the Application Insights API surface to support Python."
HOMEPAGE = "https://github.com/Microsoft/ApplicationInsights-Python"
AUTHOR = "Microsoft <appinsightssdk@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d3695bec042dc65fa26d63828a27f0cd"

SRC_URI = "https://files.pythonhosted.org/packages/d3/f2/46a75ac6096d60da0e71a068015b610206e697de01fa2fb5bba8564b0798/applicationinsights-0.11.10.tar.gz"
SRC_URI[md5sum] = "69cef2621222ca6b664fd80eca948b7e"
SRC_URI[sha256sum] = "0b761f3ef0680acf4731906dfc1807faa6f2a57168ae74592db0084a6099f7b3"

S = "${WORKDIR}/applicationinsights-0.11.10"

RDEPENDS_${PN} = ""

inherit setuptools3
