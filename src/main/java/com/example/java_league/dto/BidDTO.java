package com.example.java_league.dto;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BidDTO implements Serializable {

    private Long id;
    private BigDecimal bidValue;
    private ZonedDateTime date;
    private Long userId;
    private Long playerId;
}
