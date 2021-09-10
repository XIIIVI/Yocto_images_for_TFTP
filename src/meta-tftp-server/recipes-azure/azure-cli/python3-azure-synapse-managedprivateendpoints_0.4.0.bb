
SUMMARY = "Microsoft Azure Synapse Managed Private Endpoints Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=3b44190cd6b0d2313867097b146ce19f"

SRC_URI = "https://files.pythonhosted.org/packages/14/85/3f7224fb15155be1acd9d5cb2a5ac0575b617cade72a890f09d35b175ad7/azure-synapse-managedprivateendpoints-0.4.0.zip"
SRC_URI[md5sum] = "82dbb2d2f8685a99011d273215b599b0"
SRC_URI[sha256sum] = "900eaeaccffdcd01012b248a7d049008c92807b749edd1c9074ca9248554c17e"

S = "${WORKDIR}/azure-synapse-managedprivateendpoints-0.4.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-core"

inherit setuptools3
