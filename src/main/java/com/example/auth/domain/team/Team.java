package com.example.auth.domain.team;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "team")
@Entity(name = "team")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String uniforme1;
    private String uniforme2;
    private String escudo;

    public Team(TeamRequestDTO data){
        this.name = data.name();
        this.uniforme1 = data.uniforme1();
        this.uniforme2 = data.uniforme2();
        this.escudo = data.escudo();
    }
}