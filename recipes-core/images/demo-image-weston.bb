SUMMARY = "Weston demo image"

LICENSE = "MIT"

IMAGE_FEATURES += " ssh-server-openssh "

inherit core-image

set_hostname (){
     #!/bin/sh -e
     echo "Collabora" > ${IMAGE_ROOTFS}/etc/hostname;
}

ROOTFS_POSTPROCESS_COMMAND += "set_hostname;"

# Add kernel modules and firmware
IMAGE_INSTALL += "kernel-modules linux-firmware"

# Install utils to manage fs
# IMAGE_INSTALL += "e2fsprogs e2fsprogs-e2fsck e2fsprogs-mke2fs e2fsprogs-resize2fs e2fsprogs-tune2fs"

# Install tools to configure the NAS
# IMAGE_INSTALL += "server-fsconfig homecheck"
IMAGE_INSTALL += "netconfig"

# Network service
# IMAGE_INSTALL += "nfs-utils lighttpd openssh-sftp-server"

REQUIRED_DISTRO_FEATURES = "wayland"

IMAGE_INSTALL += "weston weston-init weston-examples gtk+3-demo clutter-1.0-examples"

IMAGE_INSTALL += "evince gtkplayer"

IMAGE_INSTALL += "gstreamer1.0-meta-video gstreamer1.0-meta-audio gstreamer1.0-plugins-ugly v4l-utils"

IMAGE_INSTALL += "gstreamer1.0-plugins-bad gstreamer1.0-plugins-base gstreamer1.0-plugins-good "
