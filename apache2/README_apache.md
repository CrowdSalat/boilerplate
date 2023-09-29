# apache

```shell
# start
docker-compose up

# fileserver vhost (user: bla pw: bla)
curl http://localhost:80/
curl http://bla:bla@localhost:80/


# reload config 
docker exec -it my-apache-server /etc/init.d/apache2 reload

# check config
docker exec -it my-apache-server apache2ctl -S 

# accesss container
docker exec -it my-apache-server bash

# recreate password file
htpasswd -c ./apache_passwd bla

# default copied with
docker cp my-apache-server:/etc/apache2/apache2.conf ./default//apache2.conf
```
