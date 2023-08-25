# Test Restendpoint in Springboot (Kotlin)

- How to use MockMvc to test a Rest Endpoint
- Test @Valid annotation in Request Object in Spring Boot 3.X (jarkata instead of javax) with kotlin (@field:)
- Deactivate Security for test (addFilters = false)

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
```

## sources

- https://reflectoring.io/bean-validation-with-spring-boot/
- https://stackoverflow.com/questions/38081086/how-to-test-if-valid-annotation-is-working
- https://stackoverflow.com/questions/13745848/how-to-test-valid
- https://mkyong.com/spring-boot/spring-boot-test-unable-to-autowired-mockmvc/
