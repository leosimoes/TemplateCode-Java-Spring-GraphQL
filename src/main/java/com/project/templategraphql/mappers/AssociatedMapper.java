package com.project.templategraphql.mappers;

import com.project.templategraphql.dtos.AssociatedPayload;
import com.project.templategraphql.entities.AssociatedEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AssociatedMapper {

    AssociatedMapper INSTANCE = Mappers.getMapper(AssociatedMapper.class);

    AssociatedPayload toAssociatedPayload(AssociatedEntity entity);

    List<AssociatedPayload> toAssociatedPayloadList(List<AssociatedEntity> entities);

    @Mapping(target = "id", ignore = true)
    AssociatedEntity toAssociatedEntity(AssociatedPayload payload);

    List<AssociatedEntity> toAssociatedEntityList(List<AssociatedPayload> payloads);

}