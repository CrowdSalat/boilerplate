# apache

```shell
# start
docker-compose up

curl http://localhost:80/test/
#user: bla
# pw: bla


# reload config 
docker exec -it my-apache-server /etc/init.d/apache2 reload
# accesss container
docker exec -it my-apache-server bash

# recreate password file
htpasswd -c ./apache_passwd bla

# default copied with
docker cp my-apache-server:/etc/apache2/apache2.conf ./default//apache2.conf
```
