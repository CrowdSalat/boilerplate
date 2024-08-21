package de.weyrich.model;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ExampleMapper implements Mapper<ExampleEntity, ExampleDTO> {

    @Autowired
    ModelMapper modelMapper;

    @Override
    public ExampleDTO mapEntityToDto(ExampleEntity exampleEntity) {
        return modelMapper.map(exampleEntity, ExampleDTO.class);
    }

    @Override
    public ExampleEntity mapDtoToEntity(ExampleDTO exampleDTO) {
        return modelMapper.map(exampleDTO, ExampleEntity.class);
    }
}
