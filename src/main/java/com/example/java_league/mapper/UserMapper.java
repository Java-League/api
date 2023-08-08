package com.example.java_league.mapper;

import com.example.java_league.domain.Player;
import com.example.java_league.domain.User;
import com.example.java_league.dto.PlayerDTO;
import com.example.java_league.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<PlayerDTO, Player>{

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO toDto(User user);

    User toEntity(UserDTO userDTO);
}