
SUMMARY = "The Microsoft Authentication Library (MSAL) for Python library enables your app to access the Microsoft Cloud by supporting authentication of users with Microsoft Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry standard OAuth2 and OpenID Connect."
HOMEPAGE = "https://github.com/AzureAD/microsoft-authentication-library-for-python"
AUTHOR = "Microsoft Corporation <nugetaad@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bbfbc44677c93751d972e8b36751a695"

SRC_URI = "https://files.pythonhosted.org/packages/51/cd/c5f4b03f85b4bc9d5568a62259ace0d2f83a7aa0acd3a264e8bb0093b42f/msal-1.14.0.tar.gz"
SRC_URI[md5sum] = "fec5649a02eecb6cc030a376c1df011d"
SRC_URI[sha256sum] = "0d389ef5db19ca8a30ae88fe05ba633a4623d3202d90f8dfcc81973dc28ee834"

S = "${WORKDIR}/msal-1.14.0"

RDEPENDS_${PN} = "python3-requests python3-pyjwt python3-cryptography"

inherit setuptools3
