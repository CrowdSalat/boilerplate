package de.weyrich;

import de.weyrich.model.ExampleDTO;
import de.weyrich.model.ExampleEntity;
import de.weyrich.model.ExampleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {


    public static final String NAME = "Name";
    public static final String SURNAME = "Surname";
    @Autowired
    ExampleMapper exampleMapper;


    @Test
    void testDtoToEntityMapper() {
        ExampleDTO exampleDTO = new ExampleDTO();
        exampleDTO.setName(NAME);
        exampleDTO.setSurname(SURNAME);

        ExampleEntity exampleEntity = exampleMapper.mapDtoToEntity(exampleDTO);

        assertAll("person",
                () -> assertEquals(NAME, exampleEntity.getName()),
                () -> assertEquals(SURNAME, exampleEntity.getSurname())
        );
    }

    @Test
    void testEntityToDTOMapper() {
        ExampleEntity exampleEntity = new ExampleEntity();
        exampleEntity.setName(NAME);
        exampleEntity.setSurname(SURNAME);

        ExampleDTO exampleDTO1 = exampleMapper.mapEntityToDto(exampleEntity);

        assertAll("person",
                () -> assertEquals(NAME, exampleDTO1.getName()),
                () -> assertEquals(SURNAME, exampleDTO1.getSurname())
        );

    }

}
