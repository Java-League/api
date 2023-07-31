package com.example.auth.domain.player;

public record PlayerResponseDTO(Long id, String name, Long overall, Double price, String imageUrl, Boolean isFavorite) {
    public PlayerResponseDTO(Player team) {
        this(team.getId(), team.getName(), team.getOverall(), team.getPrice(), team.getImageUrl(), team.getIsFavorite());
    }
}
