# test-playbook

## run locally

```shell
ansible-playbook debug_on_local.yml
```

## run on vagrant vm

[Prerequisite](./vagrant/README.md)

```shell
# create and deploy
./vagrant_deploy.sh debug_on_vagrant_vm.yml
# destroy
./vagrant_destroy.sh
```

## run local role on vagrant vm

[Prerequisite](./vagrant/README.md)

```shell
# see path for local role
cat ansible.cfg

# create and deploy
./vagrant_deploy.sh debug_on_vagrant_vm_local_role.yml
# destroy
./vagrant_destroy.sh
```
