# apache

```shell
# start
docker-compose up

curl http://localhost:80/test/

# accesss container
docker exec -it my-apache-server bash

# default copied with
docker cp my-apache-server:/etc/apache2/apache2.conf ./default//apache2.conf
```
