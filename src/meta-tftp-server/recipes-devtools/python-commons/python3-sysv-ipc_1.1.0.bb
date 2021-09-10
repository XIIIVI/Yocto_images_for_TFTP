
SUMMARY = "System V IPC primitives (semaphores, shared memory and message queues) for Python"
HOMEPAGE = "http://semanchuk.com/philip/sysv_ipc/"
AUTHOR = "Philip Semanchuk <philip@semanchuk.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=995a5916b0af2a480d5df258a5e64bfb"

SRC_URI = "https://files.pythonhosted.org/packages/0c/d7/5d2f861155e9749f981e6c58f2a482d3ab458bf8c35ae24d4b4d5899ebf9/sysv_ipc-1.1.0.tar.gz"
SRC_URI[md5sum] = "6a33df3ab82dd975340379d928d5aa40"
SRC_URI[sha256sum] = "0f063cbd36ec232032e425769ebc871f195a7d183b9af32f9901589ea7129ac3"

S = "${WORKDIR}/sysv_ipc-1.1.0"

RDEPENDS_${PN} = ""

inherit setuptools3
