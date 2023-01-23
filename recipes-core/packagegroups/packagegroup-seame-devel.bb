SUMMARY = "Components useful to developers added to -devel images"
LICENSE = "CLOSED"

inherit packagegroup

RDEPENDS:${PN} = "\
    python3-core \
    python3-dev \
    python3-venv \
    python3-setuptools \
    v4l-utils \
"
