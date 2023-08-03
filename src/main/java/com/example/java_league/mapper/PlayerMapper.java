package com.example.java_league.mapper;

import com.example.java_league.domain.Player;
import com.example.java_league.dto.PlayerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PlayerMapper extends EntityMapper<PlayerDTO, Player> {

    PlayerMapper INSTANCE = Mappers.getMapper(PlayerMapper.class);

    PlayerDTO toDto(Player player);

    Player toEntity(PlayerDTO playerDTO);
}