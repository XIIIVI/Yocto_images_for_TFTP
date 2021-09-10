#!/bin/bash

#
# install_saved_images
#     - param1: image prefix
#
install_saved_images() {
     local PREFIX="${1}"
     local INSTALLED_IMAGES=($(find "DIR_ARCHIVES" -name "${PREFIX}-*.*"))

     echo "[INITIALIZING] The ${PREFIX} images"

     for fileIndex in "${INSTALLED_IMAGES[@]}"; do
          echo "[LOADING] ${fileIndex}"
          docker load --input "${fileIndex}"

          if [ $? -eq 0 ]; then
              echo "[DELETING] ${fileIndex}"
              # rm -Rf "${fileIndex}"
     fi
done
}

install_saved_images "core"
install_saved_images "custom"
