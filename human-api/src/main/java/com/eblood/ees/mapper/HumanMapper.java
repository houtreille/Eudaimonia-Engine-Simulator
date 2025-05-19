package com.eblood.ees.mapper;

import com.eblood.ees.model.Human;
import com.eblood.ees.model.rest.dto.HumanDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HumanMapper {

    HumanDto map(Human human);

    List<HumanDto> map(List<Human> humans);
}
