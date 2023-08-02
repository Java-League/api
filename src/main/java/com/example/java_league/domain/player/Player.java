package com.example.java_league.domain.player;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long overall;
    private Double price;
    private String imageUrl;
    private Boolean isFavorite;

    public Player(PlayerRequestDTO data) {
        this.name = data.name();
        this.overall = data.overall();
        this.price = data.price();
        this.imageUrl = data.imageUrl();
        this.isFavorite = data.isFavorite();
    }
}