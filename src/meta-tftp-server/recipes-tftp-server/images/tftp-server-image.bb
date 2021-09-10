SUMMARY = "Core image recipe used as a base image"
DESCRIPTION = "Directly assign IMAGE_INSTALL and IMAGE_FEATURES for \
               for direct control over image contents."

require tftp-server-image-common.inc
require tftp-server-user.inc

IMAGE_INSTALL += "strace"

IMAGE_FEATURES_append = " package-management"
