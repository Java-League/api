package com.example.java_league.domain.team;

import jakarta.validation.constraints.NotBlank;

public record TeamRequestDTO(
        @NotBlank
        String name,

        @NotBlank
        String uniform1,

        @NotBlank
        String uniform2,

        @NotBlank
        String emblem
) {
}
