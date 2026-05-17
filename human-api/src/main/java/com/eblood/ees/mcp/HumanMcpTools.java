package com.eblood.ees.mcp;

import com.eblood.ees.mapper.HumanMapper;
import com.eblood.ees.model.domain.HumanData;
import com.eblood.ees.model.rest.dto.HumanDto;
import com.eblood.ees.service.HumanService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@RequiredArgsConstructor
public class HumanMcpTools {

    private final HumanService humanService;
    private final HumanMapper humanMapper;

    @Tool(description = "List all humans in the system")
    public List<HumanDto> listHumans() {
        return humanMapper.map(humanService.getAllHumans());
    }

    @Tool(description = "Create a new human with the given details")
    public HumanDto createHuman(
            @ToolParam(description = "First name of the human") String firstName,
            @ToolParam(description = "Last name of the human") String lastName,
            @ToolParam(description = "Birth date in YYYY-MM-DD format (optional)") String birthDate) {
        LocalDate date = null;
        if (birthDate != null && !birthDate.isEmpty()) {
            date = LocalDate.parse(birthDate);
        }
        HumanData human = new HumanData(firstName, lastName, date);
        var createdHuman = humanService.addHuman(human);
        return humanMapper.map(createdHuman);
    }
}
