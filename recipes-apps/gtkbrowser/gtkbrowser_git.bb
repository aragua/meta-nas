LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=63e0f4c9b7c0cc28e4cd35adb08b0d8c"

SRC_URI = "git://github.com/aragua/gtkbrowser.git;protocol=https"

PV = "1.0.0+git${SRCPV}"
SRCREV = "ac4eb360df7d64378c5c63dcfe60befad858b440"

S = "${WORKDIR}/git"

DEPENDS = "glib-2.0 gtk+3 webkitgtk"

inherit pkgconfig meson

