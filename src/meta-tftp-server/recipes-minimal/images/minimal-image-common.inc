LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL = " \
    packagegroup-core-boot \
    packagegroup-base-extended \
    packagegroup-core-ssh-openssh \
    bash \
    dbus \
    ${CORE_IMAGE_EXTRA_INSTALL} \
"

IMAGE_FEATURES += "splash"

IMAGE_FEATURES += "${EXTRA_IMAGE_FEATURES}"

# Docker
PREFERRED_PROVIDER_virtual/docker = "docker-moby"

# RClone support
IMAGE_INSTALL += "rclone"
# pulls node-red-contrib-azureiothubnode, which takes ages to build: is it really needed?
# IMAGE_INSTALL += "packagegroup-cloud-azure"

IMAGE_INSTALL += "inotify-tools"
IMAGE_INSTALL += "kernel-image"
IMAGE_INSTALL += "kernel-devicetree"

# IMAGE_INSTALL_remove = "python3"

SDIMG_ROOTFS_TYPE = "ext4"

BBMAASK += "libvorbis"

# Common scripts
IMAGE_INSTALL += "common-scripts"
