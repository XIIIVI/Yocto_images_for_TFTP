
SUMMARY = "Microsoft Azure Log Analytics Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=2798b3fd6f9a77c155f5d3cee68459b1"

SRC_URI = "https://files.pythonhosted.org/packages/7a/37/6d296ee71319f49a93ea87698da2c5326105d005267d58fb00cb9ec0c3f8/azure-loganalytics-0.1.0.zip"
SRC_URI[md5sum] = "9df6835e7e4857221bf20f55236f107e"
SRC_URI[sha256sum] = "3ceb350def677a351f34b0a0d1637df6be0c6fe87ff32a5270b17f540f6da06e"

S = "${WORKDIR}/azure-loganalytics-0.1.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common"

inherit setuptools3
