do_install_append () {
    echo "#-USER_LOGIN-# ALL=(ALL) ALL" > ${D}${sysconfdir}/sudoers.d/001_#-USER_LOGIN-#
}