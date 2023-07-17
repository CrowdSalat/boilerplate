#!/bin/bash

BASEDIR="$(dirname "$0")"

# start vm
cd "${BASEDIR}/vagrant/" || exit
vagrant up
# create ssh file
vagrant ssh-config > ../host_vars/VAGRANT/vagrant-ssh.cfg
cd - || exit


echo "Run playbook $1"

# start deployment
ansible-playbook -l all -l VAGRANT "$1"