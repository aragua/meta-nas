SUMMARY = "A basic NAS image to share data"

LICENSE = "MIT"

IMAGE_FEATURES += " ssh-server-openssh nfs-server "

# Uncomment to manage packages
# IMAGE_FEATURES += " package-management "

inherit core-image

set_hostname (){
     #!/bin/sh -e
     echo "NAS" > ${IMAGE_ROOTFS}/etc/hostname;
}

ROOTFS_POSTPROCESS_COMMAND += "set_hostname;"

# Add kernel modules and firmware
IMAGE_INSTALL += "kernel-modules linux-firmware"

# Install utils to manage fs
IMAGE_INSTALL += "e2fsprogs e2fsprogs-e2fsck e2fsprogs-mke2fs e2fsprogs-resize2fs e2fsprogs-tune2fs"

# Install tools to configure the NAS
IMAGE_INSTALL += "server-fsconfig homecheck"
IMAGE_INSTALL += "netconfig"

# Network service
IMAGE_INSTALL += "nfs-utils lighttpd openssh-sftp-server"