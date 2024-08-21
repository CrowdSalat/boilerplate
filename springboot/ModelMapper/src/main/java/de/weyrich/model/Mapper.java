package de.weyrich.model;

public interface Mapper<Entity, Dto> {

    Dto mapEntityToDto(Entity entity);

    Entity mapDtoToEntity(Dto dto);
}
