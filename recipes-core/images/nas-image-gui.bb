include nas-image-multimedia.bb

SUMMARY = "A NAS image with GUI fromtend"

REQUIRED_DISTRO_FEATURES = "wayland"

IMAGE_INSTALL += "weston weston-init weston-examples gtk+3-demo clutter-1.0-examples"

IMAGE_INSTALL += "evince gtkplayer"

IMAGE_INSTALL += "gstreamer1.0-meta-video gstreamer1.0-meta-audio gstreamer1.0-plugins-ugly v4l-utils"

IMAGE_INSTALL += "gstreamer1.0-plugins-bad gstreamer1.0-plugins-base gstreamer1.0-plugins-good "
