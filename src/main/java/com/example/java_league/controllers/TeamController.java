package com.example.java_league.controllers;

import com.example.java_league.domain.Team;
import com.example.java_league.dto.PlayerDTO;
import com.example.java_league.dto.TeamDTO;
import com.example.java_league.mapper.TeamMapper;
import com.example.java_league.repository.TeamRepository;
import com.example.java_league.security.TokenService;
import com.example.java_league.service.TeamService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class TeamController {

    private final TeamRepository teamRepository;
    private final TeamService teamService;
    private final TokenService tokenService;

    @GetMapping("team/current")
    public ResponseEntity getCurrentTeam(){
        Long teamId = tokenService.getCurrentTeamId().orElse(null);
        TeamDTO teamDTO = teamService.getCurrentTeam(teamId);
        return ResponseEntity.ok(teamDTO);
    }

    @GetMapping("team")
    public ResponseEntity getAllTeam(){
        List<TeamDTO> teamDTO = teamService.getAllTeams();
        return ResponseEntity.ok(teamDTO);
    }
}
