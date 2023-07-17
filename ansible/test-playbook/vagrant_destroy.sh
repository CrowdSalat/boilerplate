#!/bin/bash

BASEDIR="$(dirname "$0")"

# start vm
cd "${BASEDIR}/vagrant/" || exit
vagrant destroy -f
# create ssh file
rm ../host_vars/VAGRANT/vagrant-ssh.cfg
cd - || exit
