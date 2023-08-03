package com.example.java_league.dto;

import com.example.java_league.enums.UserRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDTO {

    Long id;
    String login;
    String password;
    UserRole role;
    List<BidDTO> bids;
}
