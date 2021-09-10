
SUMMARY = "Microsoft Azure Core Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python/tree/main/sdk/core/azure-core"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=6698c544ce87ecbc81e5227d233f3e22"

SRC_URI = "https://files.pythonhosted.org/packages/35/2a/f634aec17ac3344fac2593fbb099380839111d5967783695ab6fbe7484bd/azure-core-1.18.0.zip"
SRC_URI[md5sum] = "26ef7b33dea9696ab9360b0f6b77bc1a"
SRC_URI[sha256sum] = "7f17db829c926ab3b922d63b6f0b86ef3c597487fbb264defa8eb4ccb761e8a0"

S = "${WORKDIR}/azure-core-1.18.0"

RDEPENDS_${PN} = "python3-requests python3-six"

inherit setuptools3
