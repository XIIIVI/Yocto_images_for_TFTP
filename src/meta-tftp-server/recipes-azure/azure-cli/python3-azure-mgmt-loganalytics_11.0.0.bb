
SUMMARY = "Microsoft Azure Log Analytics Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=1399b306548c8af50553004e9adeccbe"

SRC_URI = "https://files.pythonhosted.org/packages/3c/ec/1a3ee18d07c90600a5b6dace260b0d03e3967c5535bb2d157ef0a900e28c/azure-mgmt-loganalytics-11.0.0.zip"
SRC_URI[md5sum] = "792783a27fb4de79f1c7aced2a5ff44e"
SRC_URI[sha256sum] = "41671fc6e95180fb6147cb40567410c34b85fb69bb0a9b3e09feae1ff370ee9d"

S = "${WORKDIR}/azure-mgmt-loganalytics-11.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
