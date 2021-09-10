
SUMMARY = "A Command-Line Interface framework"
HOMEPAGE = "https://github.com/microsoft/knack"
AUTHOR = "Microsoft Corporation <azpycli@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=261d8686a7cf1ce9570cdc99746659f8"

SRC_URI = "https://files.pythonhosted.org/packages/b2/4f/4c6fc2ee28055b961ebbbbed5e7f645c70e25b774b564ae152e3aa62ce9e/knack-0.8.2.tar.gz"
SRC_URI[md5sum] = "6bb8c813f3181ecb8bbd249ce4381514"
SRC_URI[sha256sum] = "4eaa50a1c5e79d1c5c8e5e1705b661721b0b83a089695e59e229cc26c64963b9"

S = "${WORKDIR}/knack-0.8.2"

RDEPENDS_${PN} = "python3-argcomplete python3-colorama python3-jmespath python3-pygments python3-pyyaml python3-tabulate"

inherit setuptools3
