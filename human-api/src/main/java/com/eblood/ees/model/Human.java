package com.eblood.ees.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Human {
    private String firstName;
    private String lastName;
}
