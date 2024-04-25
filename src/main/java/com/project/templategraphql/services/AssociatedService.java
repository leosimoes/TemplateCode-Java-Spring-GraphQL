package com.project.templategraphql.services;

import com.project.templategraphql.dtos.AssociatedPayload;

import java.util.List;

public interface AssociatedService {

    List<AssociatedPayload> getAll();

    AssociatedPayload getByName(String name);

    AssociatedPayload create(AssociatedPayload associatedPayload);

    AssociatedPayload updateByName(String name, AssociatedPayload associatedPayload);

    Boolean deleteByName(String name);

}
