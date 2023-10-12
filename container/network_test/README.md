# container network test setup

Containers need to be on the same network to access each other by name.

## docker run setup

```shell
# create network
docker network create my_boilerplate_network

# start server
docker run --name containerA --rm  -p 8080:80 --network=my_boilerplate_network traefik/whoami 

# works
curl http://localhost:8080

# works
docker run --name containerB --rm -it --network=my_boilerplate_network curlimages/curl http://containerA:80

# does not work
docker run --name containerC --rm -it curlimages/curl http://containerA:80
```
