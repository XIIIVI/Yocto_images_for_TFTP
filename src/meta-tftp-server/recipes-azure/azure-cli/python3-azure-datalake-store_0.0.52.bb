
SUMMARY = "Azure Data Lake Store Filesystem Client Library for Python"
HOMEPAGE = "https://github.com/Azure/azure-data-lake-store-python"
AUTHOR = "Microsoft Corporation <ptvshelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b99c833af293f8a08e1454bdb5205638"

SRC_URI = "https://files.pythonhosted.org/packages/13/8b/2c151c9f4c3f5345d9a32889e15a471d98e426851b9fcf13dc9f134f5b93/azure-datalake-store-0.0.52.tar.gz"
SRC_URI[md5sum] = "3ff16c02dcd34f398d34660bff71a1c4"
SRC_URI[sha256sum] = "4198ddb32614d16d4502b43d5c9739f81432b7e0e4d75d30e05149fe6007fea2"

S = "${WORKDIR}/azure-datalake-store-0.0.52"

RDEPENDS_${PN} = "python3-cffi python3-adal python3-requests"

inherit setuptools3
