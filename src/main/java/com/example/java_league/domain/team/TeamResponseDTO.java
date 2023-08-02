package com.example.java_league.domain.team;

public record TeamResponseDTO(Long id, String name, String uniform1, String uniform2, String emblem) {
    public TeamResponseDTO(Team team) {
        this(team.getId(), team.getName(), team.getUniform1(), team.getUniform2(), team.getEmblem());
    }
}
