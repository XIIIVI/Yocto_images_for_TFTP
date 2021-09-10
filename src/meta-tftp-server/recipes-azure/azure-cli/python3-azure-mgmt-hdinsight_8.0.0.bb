
SUMMARY = "Microsoft Azure HDInsight Management Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-sdk-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=5418a9a08b8781f9a2b170b2f97f4f4e"

SRC_URI = "https://files.pythonhosted.org/packages/ee/7f/a66f5f9b67959f1f615e1a8d4a9c36af3bd3b3f80ba0a3f164071466f74c/azure-mgmt-hdinsight-8.0.0.zip"
SRC_URI[md5sum] = "45980301e829a78421b6c46850929e6a"
SRC_URI[sha256sum] = "2c43f1a62e5b83304392b0ad7cfdaeef2ef2f47cb3fdfa2577b703b6ea126000"

S = "${WORKDIR}/azure-mgmt-hdinsight-8.0.0"

RDEPENDS_${PN} = "python3-msrest python3-azure-common python3-azure-mgmt-core"

inherit setuptools3
