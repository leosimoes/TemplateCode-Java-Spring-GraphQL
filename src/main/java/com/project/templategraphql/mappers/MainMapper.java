package com.project.templategraphql.mappers;

import com.project.templategraphql.dtos.MainPayload;
import com.project.templategraphql.entities.AssociatedEntity;
import com.project.templategraphql.entities.MainEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MainMapper {

    MainMapper INSTANCE = Mappers.getMapper(MainMapper.class);

    MainPayload toMainPayload(MainEntity entity);

    List<MainPayload> toMainPayloadList(List<MainEntity> entities);

    MainEntity toMainEntity(MainPayload payload);

    List<MainEntity> toMainEntityList(List<MainPayload> payloads);

    default AssociatedEntity map(String value){
        return AssociatedEntity.builder().name(value).build();
    }

    default String map(AssociatedEntity value){
        return value.getName();
    }

}