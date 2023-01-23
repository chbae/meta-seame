SUMMARY = "Components useful to developers added to -devel images"
LICENSE = "CLOSED"

inherit packagegroup

RDEPENDS:${PN} = "\
    can-utils \
    libopencv-core-dev \
    python3-core \
    python3-dev \
    python3-venv \
    python3-setuptools \
    v4l-utils \
"
