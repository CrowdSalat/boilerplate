# Suse 15

## run

```shell
# start
vagrant up

# stop
vagrant suspend

# connect
vagrant ssh

# save the config to a file && run ssh with the file.
vagrant ssh-config > vagrant-ssh.cfg
ssh -F vagrant-ssh default
```

## prerequisite

- virtual box installed
- virtualization activated in bios
- run: `vagrant plugin install vagrant-disksize`
