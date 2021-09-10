FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# This fixes the obsolete StandardOutput=syslog setting (see https://github.com/jiazhang0/meta-secure-core/blob/master/meta-tpm2/recipes-tpm/tpm2-abrmd/files/0001-Remove-obsolete-setting-regarding-the-Standard-Outpu.patch)

SRC_URI_append = " \
    file://service-stdout.patch \
"

# Normally .so files/symlinks are needed for compile-time linking only, so by default they go to development packages (-dev suffix).
# However, as TPM programs look for libtss2-tcti-tabrmd.so and we do not want to install development packages on the target we want it in the runtime package.

# Prevent the .so from being captured by tpm2-abrmd-dev.
FILES_SOLIBSDEV = ""

# Add the .so symlink to tpm2-abrmd
FILES_${PN}_append = " ${libdir}/libtss2-tcti-tabrmd.so"

# Override the dev-so sanity check.
# (ERROR: tpm2-abrmd-2.3.0-r0 do_package_qa: QA Issue: non -dev/-dbg/nativesdk- package contains symlink .so ...)
INSANE_SKIP_${PN} = "dev-so"

# For Raspberry Pis, make this package depend on the tpm_tis_spi module
# meta-raspberrypi's rpi-base.inc defines SOC_FAMILY as rpi.
# poky's soc-family.inc turns it into a machine override.
RDEPENDS_${PN}_append_rpi = " kernel-module-tpm-tis-spi"
