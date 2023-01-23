This README file contains information on the contents of the meta-seame layer.

Please see the corresponding sections below for details.

Dependencies
============
  
  URI: https://git.yoctoproject.org/poky  
  branch: kirkstone
  
  URI: https://git.openembedded.org/meta-openembedded  
  branch: kirkstone
  
  URL: https://github.com/agherzan/meta-raspberrypi  
  branch: kirkstone

Patches
=======

Please submit any patches against the meta-seame layer to https://github.com/chbae/meta-seame

Maintainer: Changhyeok Bae <changhyeok.bae@gmail.com>

Table of Contents
=================

  I. Download poky (4.0 - Kirkstone)
```
$ git clone git://git.yoctoproject.org/poky -b kirkstone
```

 II. Download the meta-seame, meta-oe, meta-raspberrypi layers
```
$ git clone git://git.openembedded.org/meta-openembedded -b kirkstone
$ git clone https://github.com/agherzan/meta-raspberrypi.git -b kirkstone
$ git clone https://github.com/chbae/meta-seame
```

III. Set yocto environment
```
$ cd poky
$ source oe-init-build-env
```

IV. Adding the meta-seame, meta-oe, meta-raspberrypi layers to your build
```
$ bitbake-layers add-layer ../../meta-openembedded/meta-oe
$ bitbake-layers add-layer ../../meta-raspberrypi
$ bitbake-layers add-layer ../../meta-seame
```

 V. Configure local.conf to set DISTRO and MACHINE

```
$ echo "DISTRO = \"seame\"" >> conf/local.conf
$ echo "MACHINE = \"raspberrypi4-64\"" >> conf/local.conf
```

VI. Build seame image
```
$ bitbake seame-image
```
