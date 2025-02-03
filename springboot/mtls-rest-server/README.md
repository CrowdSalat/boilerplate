# Code für mTLS Server

```properties
server.ssl.client-auth=NEED
```

```shell
openssl genrsa -out ca.key 2048
openssl req -x509 -new -nodes -key ca.key -sha256 -days 365 -out ca.pem
openssl genrsa -out server.key 2048
openssl genrsa -out client.key 2048
openssl req -new -key server.key -out server.csr
openssl req -new -key client.key -out client.csr
openssl x509 -req -in server.csr -CA ca.pem -CAkey ca.key -CAcreateserial -out server.crt -days 365
openssl x509 -req -in client.csr -CA ca.pem -CAkey ca.key -CAcreateserial -out client.crt -days 365
openssl pkcs12 -export -out server.p12 -name "server" -inkey server.key -in server.crt -certfile ca.pem
openssl pkcs12 -export -out client.p12 -name "client" -inkey client.key -in client.crt -certfile ca.pem

# pw changeit
keytool -import -file ca.pem -alias "ca" -keystore truststore.p12 -storetype PKCS12
```
