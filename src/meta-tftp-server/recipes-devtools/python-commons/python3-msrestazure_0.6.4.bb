
SUMMARY = "AutoRest swagger generator Python client runtime. Azure-specific module."
HOMEPAGE = "https://github.com/Azure/msrestazure-for-python"
AUTHOR = "Microsoft Corporation <azpysdkhelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=97d4f3e780474307b88b9efd79d58e5e"

SRC_URI = "https://files.pythonhosted.org/packages/48/fc/5c2940301a83f18884a8e3aead2b2ff177a1a373f75c7b17e2e404199b2a/msrestazure-0.6.4.tar.gz"
SRC_URI[md5sum] = "91e568e53b9d0f79809e675467bbb7cc"
SRC_URI[sha256sum] = "a06f0dabc9a6f5efe3b6add4bd8fb623aeadacf816b7a35b0f89107e0544d189"

S = "${WORKDIR}/msrestazure-0.6.4"

RDEPENDS_${PN} = "python3-msrest python3-adal python3-six"

inherit setuptools3
