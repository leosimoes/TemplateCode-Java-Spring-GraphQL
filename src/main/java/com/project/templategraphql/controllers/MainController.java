package com.project.templategraphql.controllers;

import com.project.templategraphql.dtos.AssociatedPayload;
import com.project.templategraphql.dtos.MainPayload;
import com.project.templategraphql.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MainController {

    private final MainService mainService;

    @Autowired
    public MainController(MainService mainService){
        this.mainService = mainService;
    }

    @QueryMapping
    public List<MainPayload> getAllMain(){
        return this.mainService.getAll();
    }

    @QueryMapping
    public MainPayload getMainbyName(@Argument String name){
        return this.mainService.getbyName(name);
    }

    @MutationMapping
    public MainPayload createMain(@Argument MainPayload mainInput){
        return this.mainService.create(mainInput);
    }

    @MutationMapping
    public MainPayload updateMain(@Argument String name, @Argument MainPayload mainInput){
        return this.mainService.updateByName(name, mainInput);
    }

    @MutationMapping
    public Boolean deleteMain(@Argument String name){
        return this.mainService.deleteByName(name);
    }

    @SchemaMapping
    public AssociatedPayload associatedPayload(MainPayload mainPayload){
        return mainPayload.getAssociated();
    }

}
