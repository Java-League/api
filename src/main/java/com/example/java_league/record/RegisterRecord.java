package com.example.java_league.record;

import com.example.java_league.enums.UserRole;

public record RegisterRecord(String login, String password, UserRole role) {
}
