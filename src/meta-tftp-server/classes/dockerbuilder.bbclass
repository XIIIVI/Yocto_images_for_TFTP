SUMMARY = "Docker builder"
DESCRIPTION = "This recipe builds a Docker archive from a valid Docker file"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DOCKER_IMAGE = ""
DIR_INSTALL = "${libexecdir}/docker-archives"
DIR_ARCHIVES = "${WORKDIR}/docker-archives"

RDEPENDS_${PN} += "bash docker"


do_build_and_save_image[nostamp] = "1"


# Pull the container images from the manifest file.
do_pull_image() {
    [ -f "${WORKDIR}/${MANIFEST}" ] || bbfatal "${MANIFEST} does not exist"
    # Specify the PATH env variable allowing Bitbake:
    # - to look for podman binary as /usr/bin is not defined in the originally PATH env
    # variable.
    # - to call /usr/bin/newgidmap and /usr/bin/newuidmap binaries which
    # set uid and gid mapping of a user namespace.
    local name version
    while read -r name version _; do
        if ! PATH=/usr/bin:${PATH} podman pull "${name}:${version}"; then
            bbfatal "Error pulling ${name}:${version}"
        fi
    done < "${WORKDIR}/${MANIFEST}"
}


do_build_and_save_image() {
    bbplain "[PROCESSING] ${DOCKER_IMAGE}"

    if PATH=/usr/bin:${PATH} podman build -f "${WORKDIR}/${DOCKER_IMAGE}.Dockerfile" -t "${DOCKER_IMAGE}"; then
         bbplain "[BUILDING] ${DOCKER_IMAGE}"
    else
         bbfatal "[ERROR] Building ${DOCKER_IMAGE}"
    fi

    # Save the image
    mkdir -p "${DIR_ARCHIVES}"

    if PATH=/usr/bin:${PATH} podman save -o "${DIR_ARCHIVES}/${DOCKER_IMAGE}.tar.gz" --format docker-archive "${DOCKER_IMAGE}"; then
         bbplain "[SAVING] ${DOCKER_IMAGE}"
    else
         bbfatal "[ERROR] Saving ${DOCKER_IMAGE}"
    fi
}


do_install() {
    install -d ${D}/${DIR_INSTALL}
    install -m 0400 -D ${DIR_ARCHIVES}/* ${D}${DIR_INSTALL}/
}


FILES_${PN} = "\
    ${DIR_INSTALL}/ \
    "

addtask do_build_and_save_image before do_install after do_fetch
