package com.eblood.ees.controller;

import com.eblood.ees.mapper.HumanMapper;
import com.eblood.ees.model.rest.dto.HumanDto;
import com.eblood.ees.rest.api.DefaultApi;
import com.eblood.ees.service.HumanService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@AllArgsConstructor
@Controller
public class HumanController implements DefaultApi {

    HumanMapper humanMapper;
    HumanService humanService;

    @Override
    public ResponseEntity<List<HumanDto>> getAllHumans() {
        var humanList = humanService.getAllHumans();
        return ResponseEntity.ok(humanMapper.map(humanList));
    }
}
