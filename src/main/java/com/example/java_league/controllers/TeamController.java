package com.example.java_league.controllers;

import com.example.java_league.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("team")
@RequiredArgsConstructor
public class TeamController {

    private final TeamRepository teamRepository;

//    @PostMapping
//    public ResponseEntity postTeam(@RequestBody @Valid TeamRequestDTO body){
//        Team newTeam = new Team(body);
//
//        teamRepository.save(newTeam);
//        return ResponseEntity.ok().build();
//    }
//
//    @GetMapping
//    public ResponseEntity getAllTeams(){
//        List<TeamResponseDTO> teamList = teamRepository.findAll().stream().map(TeamResponseDTO::new).toList();
//
//        return ResponseEntity.ok(teamList);
//    }
}
