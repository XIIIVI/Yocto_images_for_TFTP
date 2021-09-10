
SUMMARY = "Microsoft Azure Synapse Spark Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=c80e5891165732d50e4a587e7dcfd101"

SRC_URI = "https://files.pythonhosted.org/packages/ae/61/97e0fb7d82341cf48d951de75a6f146aa705c27de9a9720896522a735420/azure-synapse-spark-0.6.0.zip"
SRC_URI[md5sum] = "a09b8aa82dc4b5697b4bced6fe106fe0"
SRC_URI[sha256sum] = "ac7564a61ba314e0a9406c0f73c3cede04091a131a0c58971bcba0c158b7455d"

S = "${WORKDIR}/azure-synapse-spark-0.6.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-core"

inherit setuptools3
