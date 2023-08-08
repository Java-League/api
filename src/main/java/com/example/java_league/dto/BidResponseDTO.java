package com.example.java_league.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class BidResponseDTO {

    private Long newPrice;
    private Long priceLimit;
    private Long playerId;
    private ZonedDateTime date;
    private String message;
    private Long teamIdLowest;
    private Long teamIdHighest;
}
