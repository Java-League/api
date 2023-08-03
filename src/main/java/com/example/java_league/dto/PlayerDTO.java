package com.example.java_league.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDTO {

    private Long id;
    private String name;
    private Long overall;
    private BigDecimal price;
    private String imageUrl;
    private Boolean isFavorite;
}
