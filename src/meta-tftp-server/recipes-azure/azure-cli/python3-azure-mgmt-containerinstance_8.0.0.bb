
SUMMARY = "Microsoft Azure Container Instance Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=10405029de483e016331dc4089b0202d"

SRC_URI = "https://files.pythonhosted.org/packages/1c/f7/647472eeb1af26ed4348d2c0927af1edbecf4f1c39861fbba26e7b788287/azure-mgmt-containerinstance-8.0.0.zip"
SRC_URI[md5sum] = "0cea187f2902346559799bca4f27ca11"
SRC_URI[sha256sum] = "7aeb380af71fc35a71d6752fa25eb5b95fdb2a0027fa32e6f50bce87e2622916"

S = "${WORKDIR}/azure-mgmt-containerinstance-8.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
