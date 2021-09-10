
SUMMARY = "Microsoft Azure Consumption Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=325f7c167369cb1f57da615612f94d19"

SRC_URI = "https://files.pythonhosted.org/packages/2b/e7/13f6d8ce194a7749f0baca34ee4ddbba7e2f1fe1532d88607f8e617fc13a/azure-mgmt-consumption-8.0.0.zip"
SRC_URI[md5sum] = "c670e743f77e9f326a33bde44380df43"
SRC_URI[sha256sum] = "b4cc167648634f864394066d5621afc137c1be795ee76f7539125f9538a2bf37"

S = "${WORKDIR}/azure-mgmt-consumption-8.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
