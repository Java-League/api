package com.example.auth.controllers;

import com.example.auth.domain.team.Team;
import com.example.auth.domain.team.TeamRequestDTO;
import com.example.auth.domain.team.TeamResponseDTO;
import com.example.auth.repositories.TeamRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("team")
public class TeamController {

    @Autowired
    TeamRepository repository;

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
