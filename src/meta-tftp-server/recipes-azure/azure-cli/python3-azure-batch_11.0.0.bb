
SUMMARY = "Microsoft Azure Batch Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=03c39beaf873d8ef0f47447892cdd555"

SRC_URI = "https://files.pythonhosted.org/packages/25/f6/e4a2dca7aa85d62f85f28d84ee509b4524012cdf3ea3d879cdfbacbee6bd/azure-batch-11.0.0.zip"
SRC_URI[md5sum] = "721f0a12de3960db144dda6309aa5b3f"
SRC_URI[sha256sum] = "ce5fdb0ec962eddfe85cd82205e9177cb0bbdb445265746e38b3bbbf1f16dc73"

S = "${WORKDIR}/azure-batch-11.0.0"

RDEPENDS_${PN} = "python3-msrest python3-msrestazure python3-azure-common"

inherit setuptools3
