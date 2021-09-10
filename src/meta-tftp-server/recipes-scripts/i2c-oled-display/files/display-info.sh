#!/bin/bash

main () {
     case "$1" in
         start) 
             MAC_ADDRESS="$(ip address show eth0 | grep "link/ether" | awk '{ print $2 }')"
             IP_ADDRESS="$(ip address show eth0 | grep "inet " | awk '{ print $2 }' | sed 's#\/.*##')"
             DOCKER_STATUS="$(systemctl status docker | grep Active | awk '{ print $2 }')"
             OPENVPN_STATUS="$(systemctl status openvpn | grep Active | awk '{ print $2 }')"

             /usr/bin/python3 DIR_INSTALL/display-info.py --ip "${IP_ADDRESS}" --mac "${MAC_ADDRESS}" --docker "${DOCKER_STATUS:=inactive}" --openvpn "${OPENVPN_STATUS:=inactive}"
         ;;
     esac
}

main "$@"
