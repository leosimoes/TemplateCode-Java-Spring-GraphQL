package com.project.templategraphql.controllers;

import com.project.templategraphql.dtos.AssociatedPayload;
import com.project.templategraphql.services.AssociatedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AssociatedController {

    private final AssociatedService associatedService;

    @Autowired
    public AssociatedController(AssociatedService associatedService){
        this.associatedService = associatedService;
    }

    @QueryMapping
    public List<AssociatedPayload> getAllAssociated(){
        return this.associatedService.getAll();
    }

    @QueryMapping
    public AssociatedPayload getAssociatedbyName(@Argument String name){
        return this.associatedService.getByName(name);
    }

    @MutationMapping
    public AssociatedPayload createAssociated(@Argument AssociatedPayload associatedInput){
        return this.associatedService.create(associatedInput);
    }

    @MutationMapping
    public AssociatedPayload updateAssociated(@Argument String name, @Argument AssociatedPayload associatedInput){
        return this.associatedService.updateByName(name, associatedInput);
    }

    @MutationMapping
    public Boolean deleteAssociated(@Argument String name){
        return this.associatedService.deleteByName(name);
    }

}
