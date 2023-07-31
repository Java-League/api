package com.example.java_league.domain.team;

import jakarta.validation.constraints.NotBlank;

public record TeamRequestDTO(
        @NotBlank
        String name,

        @NotBlank
        String uniforme1,

        @NotBlank
        String uniforme2,

        @NotBlank
        String escudo
) {
}
