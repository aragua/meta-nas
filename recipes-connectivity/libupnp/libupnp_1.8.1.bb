SUMMARY = "Portable SDK for UPnP* Devices"
DESCRIPTION = "The Portable SDK for UPnP Devices is an SDK for development of \
UPnP device and control point applications. It consists of the core UPnP \
protocols along with a UPnP-specific eXtensible Markup Language (XML) parser \
supporting the Document Object Model (DOM) Level 2 API and an optional, \
integrated mini web server for serving UPnP related documents."
HOMEPAGE = "http://pupnp.sourceforge.net/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b3190d5244e08e78e4c8ee78544f4863"

SRC_URI = "https://github.com/mrjimenez/pupnp/archive/release-1.8.1.tar.gz "

SRC_URI[md5sum] = "d18f586ff8afed3f9c402b77d6da6d6b"
SRC_URI[sha256sum] = "0569e6afd979baa4e533312cb682394cea5b2638b8b412623e28943103593ea0"

S="${WORKDIR}/pupnp-release-1.8.1"

inherit autotools

EXTRA_OECONF += "--enable-reuseaddr"