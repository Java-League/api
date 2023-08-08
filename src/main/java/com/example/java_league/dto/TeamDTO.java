package com.example.java_league.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamDTO {
    private Long id;
    private Long javalis;
    private String name;
    private String uniform1;
    private String uniform2;
    private String emblem;
}
