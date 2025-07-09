package com.eblood.ees.mapper;

import com.eblood.ees.model.domain.HumanData;
import com.eblood.ees.model.entity.HumanEntity;
import com.eblood.ees.model.rest.dto.HumanDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HumanMapper {


    /**
     * Record <-> Dto
     */
    List<HumanDto> map(List<HumanData> humans);

    HumanData map(HumanDto dto);
    HumanDto map(HumanData data);

    /**
     * Record <-> Entity
     */
    HumanData mapEntity(HumanEntity humanEntity);
    List<HumanData> mapEntities(List<HumanEntity> all);
    HumanEntity mapData(HumanData humanData);
}
