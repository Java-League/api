package com.example.java_league.domain.bid;

import com.example.java_league.domain.player.Player;
import com.example.java_league.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bid implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal bidValue;
    private ZonedDateTime date;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToMany(orphanRemoval = true, fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "player_id", referencedColumnName = "id")
    private List<Player> player;
}


