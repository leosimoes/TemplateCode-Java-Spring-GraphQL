package com.project.templategraphql.services;

import com.project.templategraphql.dtos.MainPayload;
import com.project.templategraphql.mappers.MainMapper;
import com.project.templategraphql.repositories.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {

    private final MainRepository mainRepository;

    private final MainMapper mainMapper;

    @Autowired
    public MainServiceImpl(MainRepository mainRepository){
        this.mainRepository = mainRepository;
        this.mainMapper = MainMapper.INSTANCE;
    }

    public List<MainPayload> getAll() {
        return null;
    }

    public MainPayload getbyName(String name) {
        return null;
    }

    public MainPayload create(MainPayload mainPayload) {
        return null;
    }

    public MainPayload updateByName(String name, MainPayload mainPayload) {
        return null;
    }

    public Boolean deleteByName(String name) {
        return null;
    }
}
