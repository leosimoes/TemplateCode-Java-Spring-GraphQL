package com.project.templategraphql.services;

import com.project.templategraphql.dtos.MainPayload;

import java.util.List;

public interface MainService {

    List<MainPayload> getAll();

    MainPayload getbyName(String name);

    MainPayload create(MainPayload mainPayload);

    MainPayload updateByName(String name, MainPayload mainPayload);

    Boolean deleteByName(String name);

}
