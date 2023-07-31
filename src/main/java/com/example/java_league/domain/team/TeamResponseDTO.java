package com.example.java_league.domain.team;

public record TeamResponseDTO(Long id, String name, String uniforme1, String uniforme2, String escudo) {
    public TeamResponseDTO(Team team) {
        this(team.getId(), team.getName(), team.getUniforme1(), team.getUniforme2(), team.getEscudo());
    }
}
