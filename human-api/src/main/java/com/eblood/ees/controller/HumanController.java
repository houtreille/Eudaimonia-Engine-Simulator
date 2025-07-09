package com.eblood.ees.controller;

import com.eblood.ees.mapper.HumanMapper;
import com.eblood.ees.model.rest.dto.HumanDto;
import com.eblood.ees.rest.api.HumanApi;
import com.eblood.ees.service.HumanService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@AllArgsConstructor
@Controller
public class HumanController implements HumanApi {

    HumanMapper humanMapper;
    HumanService humanService;

    @Override
    public ResponseEntity<List<HumanDto>> getAllHumans() {
        var humanList = humanService.getAllHumans();
        return ResponseEntity.ok(humanMapper.map(humanList));
    }

    @Override
    public ResponseEntity<Void> addHuman(HumanDto humanDto) {
        var humanData = humanMapper.map(humanDto);
        humanService.addHuman(humanData);
        return ResponseEntity.ok().build();
    }
}
