package com.project.templategraphql.services;

import com.project.templategraphql.dtos.AssociatedPayload;
import com.project.templategraphql.entities.AssociatedEntity;
import com.project.templategraphql.mappers.AssociatedMapper;
import com.project.templategraphql.repositories.AssociatedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssociatedServiceImpl implements AssociatedService {

    private final AssociatedRepository associatedRepository;
    private final AssociatedMapper associatedMapper;

    @Autowired
    public AssociatedServiceImpl(AssociatedRepository associatedRepository){
        this.associatedRepository = associatedRepository;
        this.associatedMapper = AssociatedMapper.INSTANCE;
    }

    public AssociatedPayload create(AssociatedPayload associatedPayload) {
        String name = associatedPayload.getName();
        if(this.associatedRepository.existsByNameEqualsIgnoreCase(name)){
            throw new RuntimeException("Exception in associatedService.create() - Name Already Registered");
        }

        AssociatedEntity associatedEntity = this.associatedMapper.toAssociatedEntity(associatedPayload);
        AssociatedEntity associatedEntitySaved = this.associatedRepository.save(associatedEntity);

        return this.associatedMapper.toAssociatedPayload(associatedEntitySaved);
    }

    public AssociatedPayload getByName(String name) {
        Optional<AssociatedEntity> associatedEntityOpt = this.associatedRepository.findByNameEqualsIgnoreCase(name);
        if(associatedEntityOpt.isEmpty()){
            throw new RuntimeException("Exception in associatedService.getByName() - AssociatedEntity Not Found");
        }

        return this.associatedMapper.toAssociatedPayload(associatedEntityOpt.get());
    }

    public List<AssociatedPayload> getAll() {
        List<AssociatedEntity> associatedEntityList = this.associatedRepository.findAll();

        return this.associatedMapper.toAssociatedPayloadList(associatedEntityList);
    }

    public AssociatedPayload updateByName(String name, AssociatedPayload associatedPayload) {
        Optional<AssociatedEntity> associatedEntityOpt = this.associatedRepository.findByNameEqualsIgnoreCase(name);
        if(associatedEntityOpt.isEmpty()){
            throw new RuntimeException("Exception in associatedService.update() - AssociatedEntity Not Found");
        }

        AssociatedEntity associatedEntity = this.associatedMapper.toAssociatedEntity(associatedPayload);
        associatedEntity.setId(associatedEntityOpt.get().getId());
        AssociatedEntity associatedEntitySaved = this.associatedRepository.save(associatedEntity);

        return this.associatedMapper.toAssociatedPayload(associatedEntitySaved);
    }

    public Boolean deleteByName(String name) {
        Optional<AssociatedEntity> associatedEntityOpt = this.associatedRepository.findByNameEqualsIgnoreCase(name);
        if(associatedEntityOpt.isEmpty()){
            //throw new RuntimeException("Exception in associatedService.deleteByName() - AssociatedEntity Not Found");
            return false;
        }
        this.associatedRepository.delete(associatedEntityOpt.get());
        return true;
    }
}