package com.example.java_league.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
