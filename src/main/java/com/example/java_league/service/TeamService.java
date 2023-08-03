package com.example.java_league.service;

import com.example.java_league.domain.Team;
import com.example.java_league.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;

    public Team cadastrarTime(Team team) {
        return teamRepository.save(team);
    }

    public List<Team> listarTimes() {
        return teamRepository.findAll();
    }
}
