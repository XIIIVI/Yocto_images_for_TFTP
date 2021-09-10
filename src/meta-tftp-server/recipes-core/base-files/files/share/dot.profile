# ~/.profile: executed by Bourne-compatible login shells.

GREEN="\e[92m"

if [ -f ~/.bashrc ]; then
  . ~/.bashrc
fi

# path set by /etc/profile
export PATH=${PATH}:/usr/local/sbin:/usr/sbin:/sbin

mesg n


#
# log_section
#   - param: message
#
log_section() {
     echo -e "\e[34m${1}\e[97m"
}


#
# log_error
#   - param: message
#
log_error() {
    echo -e "\e[91m${1}\e[97m"
}


#
# log_warning
#   - param: message
#
log_warning() {
    echo -e "\e[33m${1}\e[97m"
}


#
# log_info
#   - param: message
#
log_info() {
    echo -e "\e[92m${1}\e[97m"
}


#
# log_debug
#   - param: message
#
log_debug() {
    echo -e "\e[95m${1}\e[97m"
}

printf "${GREEN}"
figlet "#-DISTRO-#"
log_info "      v#-DISTRO_VERSION-#"
echo
log_warning "Build:"
log_warning "   - Date  : #-BUILD_DATE-#"
log_warning "   - Branch: #-BUILD_BRANCH-#"
echo
echo "   - IP address: $(ip route get 8.8.8.8 | sed -n '/src/{s/.*src *\([^ ]*\).*/\1/p;q}')"
echo "   - Docker    :" $(systemctl status docker.socket | grep Active | awk '{ print $2 " " $3 }')