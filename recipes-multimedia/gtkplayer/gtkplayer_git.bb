LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=63e0f4c9b7c0cc28e4cd35adb08b0d8c"

SRC_URI = "git://git@github.com/aragua/libgtkplayer.git;protocol=ssh \
	file://fixgtkplayerforyocto.patch \
	file://fixchangelog.patch"

# Modify these as desired
PV = "0.1.0+git${SRCPV}"
SRCREV = "3c76a113e07067077e6f83e7f729944649a68386"

S = "${WORKDIR}/git"

# NOTE: the following prog dependencies are unknown, ignoring: glib-genmarshal glib-mkenums glib-compile-resources
# NOTE: unable to map the following pkg-config dependencies: gstreamer-plugins-base-1.0 gstreamer-audio-1.0 gstreamer-1.0 gstreamer-video-1.0 gstreamer-base-1.0
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "glib-2.0 gtk+3 glib-2.0-native gstreamer1.0 gstreamer1.0-plugins-base"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit pkgconfig gettext autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

RDEPENDS_${PN} += "gstreamer1.0 gstreamer1.0-meta-base gstreamer1.0-plugins-base"
