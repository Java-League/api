package com.example.java_league.mapper;

import com.example.java_league.domain.Team;
import com.example.java_league.dto.TeamDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TeamMapper extends EntityMapper<TeamDTO, Team> {

    TeamMapper INSTANCE = Mappers.getMapper(TeamMapper.class);

    TeamDTO toDto(Team player);

    Team toEntity(TeamDTO playerDTO);
}