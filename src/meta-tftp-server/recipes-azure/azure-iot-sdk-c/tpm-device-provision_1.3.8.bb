DESCRIPTION = "tpm_device_provision from Microsoft Azure IoT SDKs and libraries for C"
AUTHOR = "Microsoft Corporation"
HOMEPAGE = "https://github.com/Azure/azure-iot-sdk-c"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4283671594edec4c13aeb073c219237a"

# See https://docs.microsoft.com/en-us/azure/iot-dps/quick-create-simulated-device

# "gitsm" to fetch the submodules as well.
# See https://www.yoctoproject.org/docs/3.1/bitbake-user-manual/bitbake-user-manual.html#gitsm-fetcher
SRC_URI = "gitsm://github.com/Azure/azure-iot-sdk-c.git;protocol=https"

# git tag: 1.3.8
SRCREV = "a8a71c2d120c571a2d2ab6149863c2b075e7bea9"

S = "${WORKDIR}/git"

# util-linux: For libuuid
# The build fails without libcurl even though tpm_device_provision doesn't really use it.
DEPENDS = "util-linux openssl curl"

inherit cmake

# See poky/meta/classes/cmake.bbclass for details about EXTRA_OECMAKE and OECMAKE_TARGET_COMPILE.

# The documentation also adds -Duse_tpm_simulator:BOOL=ON but we are using a real TPM here.
EXTRA_OECMAKE = "-Duse_prov_client:BOOL=ON"

# Narrow the scope of the build to tpm_device_provision.
# Without this the recipe would attempt to build the whole SDK.
OECMAKE_TARGET_COMPILE = "tpm_device_provision"

do_install () {
    install -d ${D}${bindir}
    cp ${B}/provisioning_client/tools/tpm_device_provision/tpm_device_provision ${D}${bindir}
}
