package com.example.java_league.service;

import com.example.java_league.domain.Team;
import com.example.java_league.dto.TeamDTO;
import com.example.java_league.mapper.TeamMapper;
import com.example.java_league.repository.TeamRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;
    private final TeamMapper teamMapper;


    public List<TeamDTO> getAllTeams() {
        List<Team> teams = teamRepository.findAll();
        return teams.stream().map(teamMapper::toDto).collect(Collectors.toList());
    }

    public TeamDTO getCurrentTeam(Long teamId) {
        Team team = teamRepository.findById(teamId).orElse(null);
        return team != null ? TeamMapper.INSTANCE.toDto(team) : null;
    }
}
