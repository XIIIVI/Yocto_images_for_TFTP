
SUMMARY = "Microsoft Azure Web Apps Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=28b835d1f99351d6802d2720ecabaa54"

SRC_URI = "https://files.pythonhosted.org/packages/a8/eb/f1d846817c5f5b518c354b1756c04646b0664338eeee40667090ec981d7c/azure-mgmt-web-5.0.0.zip"
SRC_URI[md5sum] = "5886e82a0cc195b9005f3d470531c8af"
SRC_URI[sha256sum] = "0b10542600cd268d6369681c3367373a925eedcda5414eacbd3fbc9a0bdf1f24"

S = "${WORKDIR}/azure-mgmt-web-5.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
