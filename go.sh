#!/bin/bash


MISSING_PARAMETER_COUNT=0


#
# log_section
#   - param: message
#
log_section() {
	 if [[ ${DEVOPS} == "true" ]]; then
         echo "##[section]${1}"
	 else	 
         echo -e "\e[34m${1}\e[97m"
     fi
}


#
# log_error
#   - param: message
#
log_error() {
	 if [[ ${DEVOPS} == "true" ]]; then
         echo "##vso[task.logissue type=error] ${1}"
	 else	 
         echo -e "\e[91m${1}\e[97m"
     fi
}


#
# log_warning
#   - param: message
#
log_warning() {
	 if [[ ${DEVOPS} == "true" ]]; then
         echo "##vso[task.logissue type=warning] ${1}"
	 else	 
         echo -e "\e[33m${1}\e[97m"
	 fi
}


#
# log_info
#   - param: message
#
log_info() {
	 if [[ ${DEVOPS} == "true" ]]; then
         echo "##[command]${1}"
	 else	 
         echo -e "\e[92m${1}\e[97m"
	 fi    
}


#
# log_debug
#   - param: message
#
log_debug() {
	 if [[ ${DEVOPS} == "true" ]]; then
         echo "##[debug]${1}"
	 else	 
         echo -e "\e[95m${1}\e[97m"
	 fi    
}


#
# display_help
#
display_help() {
       log_debug "Usage: ${0} [--build|clean] (build (default) the image or clean the repository)"
       log_debug "            [--data-dir <Folder> (Set the folder containing user's data)]"
       log_debug "            [--devops (Make the colored trace work under Azure DevOps)]"
       log_debug "            [--i2c-oled-display (Integrate the management of an I2C OLED display)]"
       log_debug "            --image tftp|iotedge|minimal"
       log_debug "            [--hostname <Hostname prefix>]"
       log_debug "            [--machine raspberrypi-cm | raspberrypi-cm3 | raspberrypi | raspberrypi0-wifi | raspberrypi0 | raspberrypi2 | raspberrypi3-64 | raspberrypi3 | raspberrypi4-64 | raspberrypi4] (default raspberrypi4-64)"
       log_debug "            [--refspec <Version of Yocto to use> (default: hardknott)]"
       log_debug "            [--root-password <Password of the root user>]"
       log_debug "            [--user-login <Login of the user to create> (default tftp)]"
       log_debug "            [--user-password <Password of the user to create>]"
       log_debug "            [--verbose (Display the content of the files where token have been replaced)]"
       log_debug "            [--version <Version of the image>]"
       log_debug "            [--workdir <Folder where cache, temp files, ... are stored AND re-used>]"
       log_debug "            [--x735 (The target uses the Geekworm X735 fan)]"
}

#
# display_settings
#
display_settings() {
     log_debug "S E T T I N G S"
     log_debug "COMMAND              : ${COMMAND}"    
     log_debug "DEVOPS               : ${DEVOPS}"    	   
     log_debug "DIR_DATA             : ${DIR_DATA}"    	   
     log_debug "DIR_WORK             : ${DIR_WORK}"    	   
	 log_debug "DISTRO               : ${DISTRO}"
	 log_debug "DISTRO_VERSION       : ${DISTRO_VERSION}"  	   
     log_debug "CUSTOM_HOSTNAME      : ${CUSTOM_HOSTNAME}"    	   
     log_debug "IMAGE                : ${TARGET_IMAGE}"    	   
     log_debug "MACHINE              : ${MACHINE}"    	   
     log_debug "REF_SPEC             : ${REF_SPEC}"    	   
     log_debug "ROOT_PASSWORD        : ${ROOT_PASSWORD}"    
	 log_debug "USE_I2C_OLED_DISPLAY : ${USE_I2C_OLED_DISPLAY}"	   
	 log_debug "USE_GEEKWORM_X735_HAT: ${USE_GEEKWORM_X735_HAT}"	   
     log_debug "USER_LOGIN           : ${USER_LOGIN}"    	   
     log_debug "USER_PASSWORD        : ${USER_PASSWORD}"  
     log_debug "VERBOSE              : ${VERBOSE}"  
}



#
# check_mandatory_parameter
#	- param1: the variable to check
#
check_mandatory_parameter() {
	 local VARIABLE_NAME="${1}"

	 if [[ -z "${!VARIABLE_NAME}" ]]; then
	 	 MISSING_PARAMETER_COUNT=$((MISSING_PARAMETER_COUNT + 1))
		 log_error "[MISSING] ${1}"
	 fi
}


#
# check_all_mandatory_parameters
#   - param*: All the parameters to check
#
check_all_mandatory_parameters() {
	 log_info "Checking all the mandatory parameters"
	 local MANDATORY_PARAMETER_LIST=("$@")

	 for index in "${MANDATORY_PARAMETER_LIST[@]}";
	 do
	 	 check_mandatory_parameter "${index}"
	 done

	 if [ ${MISSING_PARAMETER_COUNT} -gt 0 ]; then
         display_help
         exit 1
	 else
		 log_info "All the required parameters have been defined"
     fi
}


#
# install_kas
#
install_kas() {
     log_info "[INSTALLING] Kas"

     rm -Rf kas
     git clone https://github.com/siemens/kas

     export PATH=${PWD}/kas/kas-docker:${PATH}
}


#
# display_file_content
#   - param1: file to display
#
display_file_content() {
     local FILE_TO_CAT="${1}"

     if [ -f "${FILE_TO_CAT}" ]; then
         log_debug "___________________________________ Beginning of $(realpath ${FILE_TO_CAT}) ___________________________________"
         cat "${FILE_TO_CAT}"
		 echo
         log_debug "___________________________________ End of $(realpath ${FILE_TO_CAT}) ___________________________________"
     else
         log_error "The file ${FILE_TO_CAT} is missing"
     fi
}


#
# replace_token
#    - param1: token to replace
#    - param2: value of replacement
#
replace_token() {
     local TOKEN="${1}"
     local VALUE="${2}"
     local FILE_TO_PROCESS=($(find . -type f -not -path "./build/**"  -not -path "./pipelines/**" -not -path "./layers/**" -not -path "./.git/**" | xargs grep -e "${TOKEN}" | sed 's/:.*$//g'))
    
     for fileIndex in "${FILE_TO_PROCESS[@]}";		     
     do
         log_info "[${fileIndex}] Replacing the token ${TOKEN} with the value ${VALUE}"

         if [[ "$(basename ${fileIndex})" != "go.sh" ]]; then
             if [ -f "${fileIndex}" ]; then
                 sed -i 's|'${TOKEN}'|'${VALUE}'|g' "${fileIndex}"

    	         if [[ ${VERBOSE} == "true" ]]; then
                     display_file_content  "${fileIndex}"
			     fi
		     fi
		 fi	 
     done
}


#
# replace_all_tokens
#	- param1: distro'name
#   - param2: distro's version
#	- param3: image to generate
#   - param4: folder storing the user's data
#	- param5: targetted machine
#	- param6: ref_spec (Yocto's version)
#	- param7: hostname
#	- param8: root's password
#	- param9: user's login
#	- param10: user's password
#
replace_all_tokens() {
	 local DISTRO_ARG="${1}"
	 shift
	 local DISTRO_VERSION_ARG="${1}"
	 shift
	 local TARGET_IMAGE_ARG="${1}"
	 shift
	 local MACHINE_ARG="${1}"
	 shift
	 local DIR_DATA_ARG="${1}"
	 shift
	 local REF_SPEC_ARG="${1}"
	 shift
	 local CUSTOM_HOSTNAME_ARG="${1}"
	 shift
	 local ROOT_PASSWORD_ARG="${1}"
	 shift
	 local USER_LOGIN_ARG="${1}"
	 shift
	 local USER_PASSWORD_ARG="${1}"
	 shift
	 
     log_info "Replacing the tokens"
     replace_token "#-DISTRO-#" "${DISTRO_ARG}"
     replace_token "#-DISTRO_VERSION-#" "${DISTRO_VERSION_ARG}"
     replace_token "#-WORK_DIR-#" "."
     replace_token "#-MACHINE-#" "${MACHINE_ARG}"
     replace_token "#-DIR_DATA-#" "${DIR_DATA_ARG}"
     replace_token "#-REF_SPEC-#" "${REF_SPEC_ARG}"
     replace_token "#-HOSTNAME-#" "${CUSTOM_HOSTNAME_ARG}"
     # replace_token "#-ROOT_PASSWORD-#" "$(password-encryption/hasher -e -s 512 \"${ROOT_PASSWORD_ARG}\" | sed 's#\$#\\\$#g')"
     replace_token "#-ROOT_PASSWORD-#" "${ROOT_PASSWORD_ARG}"
     replace_token "#-TARGET_IMAGE-#" "${TARGET_IMAGE_ARG}"
     replace_token "#-USER_LOGIN-#" "${USER_LOGIN_ARG}"
     # replace_token "#-USER_PASSWORD-#" "$(password-encryption/hasher -e -s 512 \"${USER_PASSWORD_ARG}\" | sed 's#\$#\\\$#g')"
     replace_token "#-USER_PASSWORD-#" "${USER_PASSWORD_ARG}"
     replace_token "#-BUILD_BRANCH-#" "===BUILD_BRANCH==="
}


#
# append_text_to_file
#      - param1: message to append,
#      - param2: file the message to append to
#
append_text_to_file() {
     local MESSAGE="${1}"
     local FILE_TO_APPEND_TO="${2}"

     echo "${MESSAGE}" | tee -a "${FILE_TO_APPEND_TO}"
}


#
# save_docker_images
# 	- param1: Docker image name
# 	- param2: Docker image version
#	- param3: Target installation directory
#	- param4: Prefix
#
save_docker_images() {
	 local DOCKER_IMAGE_NAME="${1}"
	 local DOCKER_IMAGE_VERSION="${2}"
	 local DOCKER_FOLDER="${3}/docker"
	 local DOCKER_PPREFIX="${4}"
	 local DOCKER_ARCHIVE=${DOCKER_FOLDER}/${DOCKER_PPREFIX}-$(basename ${DOCKER_IMAGE_NAME}).dockerar

     if [ -f "${DOCKER_ARCHIVE}" ]; then
         log_warning "[SKIPPED] Docker archive ${DOCKER_ARCHIVE} already exists"
 	 else
	     local IMAGE_SIZE=$(docker images | grep ${DOCKER_IMAGE_NAME} | grep ${DOCKER_IMAGE_VERSION} | awk '{print $NF}')

		 log_debug "[SAVING] Docker image ${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_VERSION} in file ${DOCKER_ARCHIVE}"
		 mkdir -p "${DOCKER_FOLDER}"
		 docker save "${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_VERSION}" | gzip > "${DOCKER_ARCHIVE}"
	     chmod 666 "${DOCKER_ARCHIVE}"
		 test -e "${DOCKER_ARCHIVE}" || { log_error "[ABORTED] The file ${DOCKER_ARCHIVE} is missing ..."; exit; }
		 log_warning "Size of the file $(ls -alh ${DOCKER_ARCHIVE} | awk '{ print $5 }') / Size of the image ${IMAGE_SIZE}"
     fi
}


#
# pull_and_save_docker_image
# 	- param1: Docker image name
# 	- param2: Docker image version
#	- param3: Target installation directory
#
pull_and_save_docker_image() {
	 local DOCKER_IMAGE_NAME="${1}"
	 local DOCKER_IMAGE_VERSION="${2}"
	 local DOCKER_FOLDER="${3}"
     local DOCKER_INSTANCE_COUNT=$(docker images | grep "${DOCKER_IMAGE_NAME}" | grep "${DOCKER_IMAGE_VERSION}" | wc | awk '{ print $1 }')

     if [ "${DOCKER_INSTANCE_COUNT}" -gt 0 ]; then
	     log_warning "[SKIPPED] Docker image ${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_VERSION} is already installed"
	 else	 
         log_info "[INSTALLING] the Docker image for ${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_VERSION} running on the platform ${DOCKER_PLATFORM} in ${DOCKER_FOLDER}"
         docker pull --platform "${DOCKER_PLATFORM}" "${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_VERSION}"
	 fi

	 DOCKER_CONTAINER_TO_CLEAN_LIST+=("${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_VERSION}")
	 save_docker_images "${DOCKER_IMAGE_NAME}" "${DOCKER_IMAGE_VERSION}" "${DOCKER_FOLDER}" "core"
}



#
# build_and_save_all_docker_images
#
build_and_save_all_docker_images() {
	 log_info "Building and saving all the Docker images"
     log_debug "[INSTALLING] binfmt container"
     docker run --privileged --rm tonistiigi/binfmt --install all

     local DOCKERFILES=($(find ./src -name "*.Dockerfile"))

     for fileIndex in "${DOCKERFILES[@]}"; do
	     build_and_save_docker_image "${fileIndex}"
     done
}

#
# build_and_save_docker_image
#	- param1: Docker file
#
build_and_save_docker_image() {
	 local FILE_DOCKERFILE=$(realpath "${1}")
	 local DIR_DOCKERFILE=$(dirname "${FILE_DOCKERFILE}")
	 local IMAGE_NAME=$(basename "${FILE_DOCKERFILE}" | sed 's#\..*$##')
	 local DOCKER_IMAGE_NAME=${IMAGE_NAME}:latest
	 local DOCKER_ARCHIVE=${DIR_DOCKERFILE}/docker/${IMAGE_NAME}.dockerar
	 local DIR_CURRENT=${PWD}

     log_info "[CONFIGURING] Docker to generate multi-arch images from the Docker file ${FILE_DOCKERFILE}"

     if [ -s "${DOCKER_ARCHIVE}" ]; then
	     log_warning "[SKIPPED] The archive ${DOCKER_ARCHIVE} already exists"
	 else
		 cd "${DIR_DOCKERFILE}" || exit

		 log_debug "[CREATING] Builder ${IMAGE_NAME}"
		 docker buildx create --name "${IMAGE_NAME}"
		 docker buildx use "${IMAGE_NAME}"

		 log_debug "[CREATING] Docker image ${DOCKER_IMAGE_NAME}"
		 docker rmi "${DOCKER_IMAGE_NAME}"
		 cp "${FILE_DOCKERFILE}" Dockerfile
		 docker buildx build --platform "${DOCKER_PLATFORM}" -t "${DOCKER_IMAGE_NAME}" --load .

         save_docker_images "${IMAGE_NAME}" "latest" "${DIR_DOCKERFILE}" "custom"

		 log_debug "[CLEANING] Builder ${IMAGE_NAME} and image"
		 docker rmi "${DOCKER_IMAGE_NAME}"
		 docker buildx rm "${IMAGE_NAME}"
		 rm -Rf Dockerfile

 		 cd "${DIR_CURRENT}" || exit
	 fi	
 
	 FILE_TO_CLEAN_LIST+=("${DOCKER_ARCHIVE}")
}


#
# clean_up_useless_files
#
clean_up_useless_files() {
	 log_info "Cleaning up all the useless files"

     for fileIndex in "${FILE_TO_CLEAN_LIST[@]}"; do
	     log_warning "[DELETING] ${fileIndex}"
		 rm -Rf "${fileIndex}"
     done
}


#
# clean_up_useless_docker_containers
#
clean_up_useless_docker_containers() {
	 log_info "Cleaning up all the useless Docker containers"

     for containerIndex in "${DOCKER_CONTAINER_TO_CLEAN_LIST[@]}"; do
	     log_warning "[DELETING] ${containerIndex}"
		 docker rmi -f "${containerIndex}"
     done
}


#
# main
#
main() {	
    # Parses the parameters
    while (( "$#" )); do
      case "$1" in
    	 --build)
    	     COMMAND="build"
    		 shift # past argument
    		;;
    	 --clean)
    	     COMMAND="clean"
    		 shift # past argument
    		;;
    	 --devops)
    	     DEVOPS="true"
    		 shift # past argument
    		;;
    	 --hostname)
    		 CUSTOM_HOSTNAME="${2,,}"
    		 shift # past argument
    		 shift # past value
    		;;
    	 --i2c-oled-display)
    	     USE_I2C_OLED_DISPLAY="true"
    		 shift # past argument
    		;;
    	 --image)
    		 TARGET_IMAGE="${2,,}"
    		 shift # past argument
    		 shift # past value
    		;;
    	 --machine)
    		 MACHINE="${2,,}"
    		 shift # past argument
    		 shift # past value
    		;;
    	 --refspec)
    		 REF_SPEC="${2,,}"
    		 shift # past argument
    		 shift # past value
    		;;
    	 --root-password)	
    		 ROOT_PASSWORD="${2}"
    		 shift # past argument
    		 shift # past value
    
    		 if [ ${#ROOT_PASSWORD} -gt 8 ]; then 
    		     log_error "The length of the root password cannot exceed 8 characters"
    			 exit
             elif  [ ${#ROOT_PASSWORD} -lt 4 ]; then 
    		     log_error "The root password MUST be greater than 3 characters"
    			 exit
             fi
    		;;
    	 --user-login)	
    		 USER_LOGIN="${2,,}"
    		 shift # past argument
    		 shift # past value
    		;;
    	 --user-password)	
    		 USER_PASSWORD="${2}"
    		 shift # past argument
    		 shift # past value
    
    		 if [ ${#USER_PASSWORD} -gt 8 ]; then 
    		     log_error "The length of the user password cannot exceed 8 characters"
    			 exit
             elif  [ ${#USER_PASSWORD} -lt 4 ]; then 
    		     log_error "The user password MUST be greater than 3 characters"
    			 exit
             fi
    		;;
		 --x735)
    	     USE_GEEKWORM_X735_HAT="true"
    		 shift # past argument		 
		    ;;	
		 --verbose)
    	     VERBOSE="true"
    		 shift # past argument		 
		    ;;	
    	 --version)
    		 DISTRO_VERSION="${2}"
    		 shift # past argument
    		 shift # past value
    		;;
    	 --workdir)
    		 DIR_WORK="${2}"
    		 shift # past argument
    		 shift # past value
    		;;
    	 -h|--help)
    		 display_help
    		 shift # past argument
    		 exit 1
    		;;
    	 --) # end argument parsing
    		 shift
    		 break
    		;;
    	 -*|--*=) # unsupported flags
    		 log_error "Error: Unsupported flag $1" >&2
    		 display_help
    		 exit 1
    		;;
    	 *) # preserve positional arguments
    		 shift
    		;;
       esac
    done
    
    BASEDIR="${PWD}"
    COMMAND=${COMMAND:="build"}
    DEVOPS=${DEVOPS:="false"}
    DIR_DATA=${DIR_DATA:="/datadrive"}
    DIR_WORK=${DIR_WORK:="${BASEDIR}"}
	DIR_DOCKER_RECIPE="meta-tftp-server/recipes-containers/docker/files"
    DISTRO_VERSION=${DISTRO_VERSION:="#-UNKNOWN_VERSION-#"}
    MACHINE=${MACHINE:="raspberrypi4-64"}
    REF_SPEC=${REF_SPEC:="hardknott"}
    VERBOSE=${VERBOSE:="false"}
    KAS_FILES=config/preferred_versions.yml:config/local.yml:config/poky.yml:config/global.yml
    DOCKER_PLATFORM="linux/arm64"  
	DOCKER_CONTAINER_TO_CLEAN_LIST=()
	FILE_TO_CLEAN_LIST=()

    mkdir -p "${DIR_DOCKER_RECIPE}"

    install_kas
    
    log_info "Setting up the environment"
   
    # Create the symlinks
    if [ ! -L "meta-tftp-server" ] ; then
         log_info "[CREATING] Symlink meta-tftp-server referencing src/meta-tftp-server"
	     ln -s src/meta-tftp-server meta-tftp-server
    fi

    if [ ! -L "config" ] ; then
         log_info "[CREATING] Symlink config referencing src/config"
	     ln -s src/config config
    fi

   # Update the KAS file depending on the targetted machine
   case "${MACHINE}" in 
         *raspberry*)
		     KAS_FILES+=":config/raspberry.yml"
         ;;
   esac

   case "${COMMAND}" in
    	 build)
             DIR_DELIVERY="${BASEDIR}/delivery/${TARGET_IMAGE}"
    
    		 mkdir -p "${DIR_DELIVERY}"
    
             check_all_mandatory_parameters "TARGET_IMAGE"

             # Add additional properties
          	 # OLED Display (I2C)
             if [ -n "${USE_I2C_OLED_DISPLAY}" ]; then
                 log_info "[INSTALLING] I2C OLED display support"
          		 KAS_FILES+=":config/i2c.yml:config/i2c-oled-display.yml"
             fi
          
             # Geekworm X735
             if [ -n "${USE_GEEKWORM_X735_HAT}" ]; then
                 log_info "[INSTALLING] Geekworm X735 hat support"
          		 KAS_FILES+=":config/i2c.yml:config/geekworm-x735.yml"
             fi
    
             # Set the image recipe and distro
             case "${TARGET_IMAGE}" in
    	         tftp)
    	             DISTRO="tftpos"
    	             TARGET_IMAGE="tftp-server-image"
    				 CUSTOM_HOSTNAME=${CUSTOM_HOSTNAME:="tftp-server"}
                     ROOT_PASSWORD=${ROOT_PASSWORD:="PhU2018!"}
                     USER_LOGIN=${USER_LOGIN:="tftp"}
                     USER_PASSWORD=${USER_PASSWORD:="Is3r3_38"}
    	          ;;
    
                 iotedge)
    	             DISTRO="iotedgeos"
    	             TARGET_IMAGE="iotedge-image"
    				 CUSTOM_HOSTNAME=${CUSTOM_HOSTNAME:="iotedge"}
                     ROOT_PASSWORD=${ROOT_PASSWORD:="Th3K|ng!"}
                     USER_LOGIN=${USER_LOGIN:="iotedge"}
                     USER_PASSWORD=${USER_PASSWORD:="Sav0i373"}
    				 KAS_FILES+=":config/iotedge.yml"
    
    				 if [ "${REF_SPEC}" != "dunfell" ]; then
    				     log_warning "[WARNING] The latest release of Yocto/IoT Edge runs under \"dunfell\", the refspec definition has been changed"
       				     REF_SPEC="dunfell"
    				 fi 
    	          ;;
    
                 minimal)
    	             DISTRO="minimalos"
    	             TARGET_IMAGE="minimal-image"
    				 CUSTOM_HOSTNAME=${CUSTOM_HOSTNAME:="minimal"}
                     ROOT_PASSWORD=${ROOT_PASSWORD:="Th3B0ss!"}
                     USER_LOGIN=${USER_LOGIN:="raspberry"}
                     USER_PASSWORD=${USER_PASSWORD:="JuR1_39"}
    	          ;;
             esac	 
   
             FILE_GENERATED_IMAGE="${TARGET_IMAGE}-${MACHINE}-${DISTRO_VERSION}.wic.bz2"
    
             log_info "Cleaning previous deliveries for ${FILE_GENERATED_IMAGE}"
    		 rm -Rf "${DIR_DELIVERY:?}/${FILE_GENERATED_IMAGE}"
    
             log_info "Preparing the environment"
    
             replace_all_tokens "${DISTRO}" "${DISTRO_VERSION}" "${TARGET_IMAGE}" "${MACHINE}" "${DIR_DATA}" "${REF_SPEC}" "${CUSTOM_HOSTNAME}" "${ROOT_PASSWORD}" "${USER_LOGIN}" "${USER_PASSWORD}"
             build_and_save_all_docker_images

             display_settings
    
             log_info "Building the image ${TARGET_IMAGE} (${DISTRO}) with the following configuration files ${KAS_FILES}"
    		 kas/kas-docker build "${KAS_FILES}"
    
    		 cp "${DIR_WORK}/build/tmp/deploy/images/${MACHINE}/${TARGET_IMAGE}-${MACHINE}.wic.bz2" "${DIR_DELIVERY}/${FILE_GENERATED_IMAGE}" && \
    		 git reset --hard && \
    		 log_info "The generated image ${FILE_GENERATED_IMAGE} is available in ${DIR_DELIVERY}"
    		 ls -alh "${DIR_DELIVERY}"
    
    		 if [ -f "${DIR_DELIVERY}/${FILE_GENERATED_IMAGE}" ]; then
    		     log_info "Cleaning, please wait ..."
    		     kas/kas-docker clean
				 clean_up_useless_files
				 clean_up_useless_docker_containers
    		 fi	 
    		;;
    
    	 clean)
             log_info "Cleaning the environment"
    		 kas/kas-docker clean
    		;;
    	 *) 
    		 log_error "Missing command (--build, --clean)"
    		;;
    esac
}

time main "$@"