package com.example.java_league.domain.player;

import com.example.java_league.domain.bid.Bid;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

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

    @OneToMany(orphanRemoval = true, fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "bid_id")
    private List<Bid> bid;

    public Player(PlayerRequestDTO data) {
        this.name = data.name();
        this.overall = data.overall();
        this.price = data.price();
        this.imageUrl = data.imageUrl();
        this.isFavorite = data.isFavorite();
    }
}