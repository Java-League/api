package com.example.java_league.controllers;

import com.example.java_league.domain.Team;
import com.example.java_league.dto.BidResponseDTO;
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


    @PostMapping("team/current")
    public ResponseEntity saveCurrentTeam(@PathVariable("teamId") Long teamId){
        Long userId = tokenService.getCurrentUserId().orElse(null);
        TeamDTO teamDTO = teamService.saveCurrentTeam(teamId, userId);
        return ResponseEntity.ok(teamDTO);
    }

    @GetMapping("team")
    public ResponseEntity getAllTeam(){
        List<TeamDTO> teamDTO = teamService.getAllTeams();
        return ResponseEntity.ok(teamDTO);
    }

    @GetMapping("team/available")
    public ResponseEntity getAllTeamsAavailable(){
        List<TeamDTO> teamDTO = teamService.getAllTeamsAavailable();
        return ResponseEntity.ok(teamDTO);
    }


    @PostMapping("/team/{playerId}/player")
    public ResponseEntity<Void> updateValue(@PathVariable("playerId") Long playerId, @RequestParam("position") Long position) {
        Long teamId = tokenService.getCurrentTeamId().orElse(null);
        teamService.saveTeamPlayer(teamId, playerId, position);
        return ResponseEntity.ok().build();
    }
}
