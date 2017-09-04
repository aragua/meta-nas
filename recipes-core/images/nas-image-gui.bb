include nas-image-multimedia.bb

SUMMARY = "A NAS image with GUI fromtend"

REQUIRED_DISTRO_FEATURES = "wayland"

IMAGE_INSTALL += "weston weston-init weston-examples gtk+3-demo clutter-1.0-examples"

IMAGE_INSTALL += "evince"