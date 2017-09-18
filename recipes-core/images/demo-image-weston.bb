SUMMARY = "Weston demo image"

LICENSE = "MIT"

IMAGE_FEATURES += " ssh-server-openssh "

inherit core-image

set_hostname (){
     #!/bin/sh -e
     echo "Demo" > ${IMAGE_ROOTFS}/etc/hostname;
}

ROOTFS_POSTPROCESS_COMMAND += "set_hostname;"

# Add kernel modules and firmware
IMAGE_INSTALL += "kernel-modules linux-firmware"

# Install tools to configure the NAS
IMAGE_INSTALL += "netconfig"

# Network service
REQUIRED_DISTRO_FEATURES = "wayland"
IMAGE_INSTALL += "weston weston-init weston-examples gtk+3-demo clutter-1.0-examples"

IMAGE_INSTALL += "epiphany evince"
IMAGE_INSTALL += "gtkbrowser gtkplayer"

IMAGE_INSTALL += "gstreamer1.0-meta-video gstreamer1.0-meta-audio gstreamer1.0-plugins-ugly v4l-utils"
IMAGE_INSTALL += "gstreamer1.0-plugins-bad gstreamer1.0-plugins-base gstreamer1.0-plugins-good gstreamer1.0-plugins-bad"
