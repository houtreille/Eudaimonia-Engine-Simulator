package com.eblood.ees.service;

import com.eblood.ees.mapper.HumanMapper;
import com.eblood.ees.model.Human;
import com.eblood.ees.model.repository.HumanRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class HumanService {

    HumanRepository humanRepository;
    HumanMapper mapper;

    public List<Human> getAllHumans() {

        var humanEntities = humanRepository.findAll();

        return mapper.mapEntities(humanEntities);
    }
}
