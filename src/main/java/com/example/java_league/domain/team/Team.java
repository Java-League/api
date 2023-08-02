package com.example.java_league.domain.team;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String uniform1;
    private String uniform2;
    private String emblem;

    public Team(TeamRequestDTO data) {
        this.name = data.name();
        this.uniform1 = data.uniform1();
        this.uniform2 = data.uniform2();
        this.emblem = data.emblem();
    }
}