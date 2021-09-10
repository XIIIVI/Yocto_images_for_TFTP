
SUMMARY = "Microsoft Azure Container Registry Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=35f713220e6ea2153b88c826676e87b1"

SRC_URI = "https://files.pythonhosted.org/packages/d6/c8/1a1ba7ec5049c4a42daaa03e3454f8725d454b928bd9fb10d6c529771150/azure-mgmt-containerregistry-8.1.0.zip"
SRC_URI[md5sum] = "a6ffc41fee07f865631ed4daffd9e0d8"
SRC_URI[sha256sum] = "62efbb03275d920894d79879ad0ed59605163abd32177dcf24e90c1862ebccbd"

S = "${WORKDIR}/azure-mgmt-containerregistry-8.1.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
