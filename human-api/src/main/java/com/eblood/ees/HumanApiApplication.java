package com.eblood.ees;

import com.eblood.ees.mcp.HumanMcpTools;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HumanApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(HumanApiApplication.class, args);
    }

    @Bean
    public ToolCallbackProvider outboxMcpToolCallbacks(HumanMcpTools humanMcpTools) {
        return MethodToolCallbackProvider.builder().toolObjects(humanMcpTools).build();
    }
}
