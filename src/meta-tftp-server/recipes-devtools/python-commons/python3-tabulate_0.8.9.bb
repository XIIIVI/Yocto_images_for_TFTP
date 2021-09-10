
SUMMARY = "Pretty-print tabular data"
HOMEPAGE = "https://github.com/astanin/python-tabulate"
AUTHOR = "Sergey Astanin <s.astanin@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fad5a39bdfe452b13775adda41023ba7"

SRC_URI = "https://files.pythonhosted.org/packages/ae/3d/9d7576d94007eaf3bb685acbaaec66ff4cdeb0b18f1bf1f17edbeebffb0a/tabulate-0.8.9.tar.gz"
SRC_URI[md5sum] = "71e6f214512ceda2892be47767156754"
SRC_URI[sha256sum] = "eb1d13f25760052e8931f2ef80aaf6045a6cceb47514db8beab24cded16f13a7"

S = "${WORKDIR}/tabulate-0.8.9"

RDEPENDS_${PN} = ""

inherit setuptools3
