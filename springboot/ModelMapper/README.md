# ModelMapper

DTOs allow to decouple your domain model from your API.

This Repository shows how to use [ModelMapper](https://www.baeldung.com/java-modelmapper) to map from entity to DTO and the other way around.

You need to add modelmapper dependency:

```xml
<dependency>
    <groupId>org.modelmapper</groupId>
    <artifactId>modelmapper</artifactId>
    <version>3.2.0</version>
</dependency>
```


## Errors

When this error happens while mapping JPA/Hibernate entitys to POJOs/DTOs `Hibernate could not initialize proxy – no Session`, you might be missing a @Transactional at the Service level.

## Alternative

[MapStruct](https://mapstruct.org/) is alternative which generates mapping logic.
