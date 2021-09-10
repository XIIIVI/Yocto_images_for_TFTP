
SUMMARY = "Microsoft Azure SignalR Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=3242505f20489ed3cb3f274f507a1e36"

SRC_URI = "https://files.pythonhosted.org/packages/84/9e/3dfd91f786df6fdfe9938a201695793484782ea412234b24392b232e500c/azure-mgmt-signalr-0.4.0.zip"
SRC_URI[md5sum] = "0eff52a73ad353d2a0461b960c4a74e5"
SRC_URI[sha256sum] = "6503ddda9d6f4b634dfeb8eb4bcd14ede5e0900585f6c83bf9010cf82215c126"

S = "${WORKDIR}/azure-mgmt-signalr-0.4.0"

RDEPENDS_${PN} = "python3-msrest python3-msrestazure python3-azure-common"

inherit setuptools3
