SUMMARY = "Image recipe used for IoT Edge"
DESCRIPTION = "Directly assign IMAGE_INSTALL and IMAGE_FEATURES for \
               for direct control over image contents."

require iotedge-image-common.inc
require iotedge-user.inc

RDEPENDS_${PN} += " \
    tpm-device-provision \
    tpm2-abrmd \
"

IMAGE_INSTALL += "strace"
                   
IMAGE_FEATURES_append = " package-management"
