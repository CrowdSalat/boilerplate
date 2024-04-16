# Test Property Mechanismn

## prerequisite

```shell
sdk install kotlin
sdk install java 17.0.5-tem
# sdk use java 17.0.5-tem

# install buildpacks or just use `docker build`
# brew install buildpacks/tap/pack
#pack config default-builder paketobuildpacks/builder-jammy-tiny
```

## build container and deploy to k3d

```shell
# create local cluster
k3d cluster create local

# build image
docker build -t propertylogger:local . 
# or build with buildpack
# pack build propertylogger


# add image to k3d cluster
k3d image import propertylogger:local --cluster local

# TEST properties
k apply -f ./k8s
k logs deployments/propertylogger 

k exec deployments/propertylogger -it -- /bin/bash
k exec deployments/propertylogger -- ls /app/secrets
// 

# stop local cluster
k3d cluster stop local
```

## build gradle

```shell
# build
./gradlew assemble

# run application
./gradlew bootRun

# run test
./gradlew test

# when facing IDLE and errors in gradle
gradle --stop
#or when this occurs "Timeout waiting to lock journal cache (/Users/wej/.gradle/caches/journal-1). It is currently in use by another Gradle instance."
find ~/.gradle -type f -name "*.lock" -delete
```
