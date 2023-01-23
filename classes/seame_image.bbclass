inherit core-image

SEAME_IMAGE_BASE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-seame-devel \
"

IMAGE_INSTALL = "${SEAME_IMAGE_BASE_INSTALL}"
