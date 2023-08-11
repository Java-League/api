package com.example.java_league.dto;

import lombok.*;

import java.io.Serializable;
import java.time.ZonedDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class TeamPlayersDTO implements Serializable {
    private Long playerId;
    private Long teamId;
    private Long position;
    private String name;
    private String imageUrl;

    public TeamPlayersDTO(Long playerId, Long teamId, Long position) {
        this.playerId = playerId;
        this.teamId = teamId;
        this.position = position;
    }
}
