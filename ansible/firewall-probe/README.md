# firewall-probe

This playbook allows you to check whether the firewall between two servers (groups) has been enabled on a port. If an error occurs, it means that either a firewall has not been enabled or that no process is listening on the port.

If no process is running, you can start it manually on the server and run the pipeline again:

```shell
# Connect to target host via SSH
ssh <HOST>

# check if port 443 is occupied 
sudo lsof -i :443

# if the port is really not occupied,
# you can output the current server via a web server on port 443
sudo python3 -m http.server 443

# alternatively with destination folder 
# sudo python3 -m http.server 443 --directory /opt/oh/my/content
```

## run locally

```shell
ansible-playbook -l local_test playbooks/firewall-probe.yml 
```

## check inventory

Host in inventory should correspond to firewall groups.

```shell
# to test if the new group works as expected
# list available hosts and vars:
ansible-inventory --list -i ./inventory/
```
