package com.example.java_league.domain.player;

import jakarta.validation.constraints.NotBlank;

public record PlayerRequestDTO(
        @NotBlank
        String name,
        @NotBlank
        Long overall,
        @NotBlank
        Double price,
        @NotBlank
        String imageUrl,
        @NotBlank
        Boolean isFavorite
) {
}