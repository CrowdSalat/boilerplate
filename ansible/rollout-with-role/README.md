# leben-rollout-with-role

## run locally

```shell
ansible-playbook -l local_test playbooks/rollout-with-role.yml 
```

## add new host

To add a new host to this playbook do the following:

1. Add group with new host to [inventory/server](./inventory/server). Groupname should be like `[<application/server>_<stage>]`.
2. If custom configuration is needed create a `<application/server>_<stage>.yml` file in [inventory/group_vars](./inventory/group_vars)
3. Add a pipeline which runs something like
   `ansible-playbook --user="USER" --key-file="./user_keyfile" --limit ${ANSIBLE_GROUP} ./playbooks/rollout-with-role.yml --vault-password-file=${ANSIBLE_VAULT_PASSWORD}``

## check inventory

```shell
# to test if the new group works as expected
# list available hosts and vars:
ansible-inventory --list -i ./inventory/
```
