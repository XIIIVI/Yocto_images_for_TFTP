
SUMMARY = "Python package for integrating Azure Functions with Azure DevOps. Specifically made for the Azure CLI"
HOMEPAGE = "https://github.com/Azure/azure-functions-devops-build"
AUTHOR = "Oliver Dolk, Hanzhang Zeng <t-oldolk@microsoft.com, hazeng@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b98fddd052bb2f5ddbcdbd417ffb26a8"

SRC_URI = "https://files.pythonhosted.org/packages/d5/96/59ca26c8d9985df8a092cf5974e54b6c3e11208833ea1c0163d7fb763c94/azure-functions-devops-build-0.0.22.tar.gz"
SRC_URI[md5sum] = "a76c85de8cd66b35d25d382de515feaa"
SRC_URI[sha256sum] = "c6341abda6098813f8fa625acd1e925410a17a8a1c7aaabdf975bb7cecb14edf"

S = "${WORKDIR}/azure-functions-devops-build-0.0.22"

RDEPENDS_${PN} = "python3-msrest python3-vsts python3-jinja2"

inherit setuptools3
