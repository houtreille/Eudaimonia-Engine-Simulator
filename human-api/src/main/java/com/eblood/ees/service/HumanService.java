package com.eblood.ees.service;

import com.eblood.ees.model.Human;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class HumanService {

    public List<Human> getAllHumans() {
        return List.of(
                Human.builder().firstName("John").lastName("Doe").build(),
                Human.builder().firstName("Jane").lastName("Doe").build(),
                Human.builder().firstName("Jim").lastName("Beam").build(),
                Human.builder().firstName("Jack").lastName("Daniels").build()
        );
    }
}
