package com.example.java_league.controllers;

import com.example.java_league.domain.team.Team;
import com.example.java_league.domain.team.TeamRequestDTO;
import com.example.java_league.domain.team.TeamResponseDTO;
import com.example.java_league.repositories.TeamRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("team")
@RequiredArgsConstructor
public class TeamController {

    private final TeamRepository repository;

    @PostMapping
    public ResponseEntity postTeam(@RequestBody @Valid TeamRequestDTO body){
        Team newTeam = new Team(body);

        this.repository.save(newTeam);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity getAllTeams(){
        List<TeamResponseDTO> teamList = this.repository.findAll().stream().map(TeamResponseDTO::new).toList();

        return ResponseEntity.ok(teamList);
    }
}
