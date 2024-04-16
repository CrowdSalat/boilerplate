# Test Property Mechanismn

## prerequisite

```shell
sdk install kotlin
sdk install java 17.0.5-tem
# sdk use java 17.0.5-tem
```

## build

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
