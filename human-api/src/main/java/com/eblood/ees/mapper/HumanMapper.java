package com.eblood.ees.mapper;

import com.eblood.ees.model.Human;
import com.eblood.ees.model.entity.HumanEntity;
import com.eblood.ees.model.rest.dto.HumanDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HumanMapper {
    HumanDto map(Human human);
    List<HumanDto> map(List<Human> humans);
    Human mapEntity(HumanEntity humanEntity);
    List<Human> mapEntities(List<HumanEntity> all);
}
