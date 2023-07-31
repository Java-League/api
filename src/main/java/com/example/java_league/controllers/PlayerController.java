package com.example.java_league.controllers;

import com.example.java_league.domain.player.Player;
import com.example.java_league.domain.player.PlayerRequestDTO;
import com.example.java_league.domain.player.PlayerResponseDTO;
import com.example.java_league.repositories.PlayerRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("player")
@RequiredArgsConstructor
public class PlayerController {

    private final PlayerRepository repository;

    @PostMapping
    public ResponseEntity postPlayer(@RequestBody @Valid PlayerRequestDTO body) {
        Player newPlayer = new Player(body);
        this.repository.save(newPlayer);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity getAllPlayers() {
        List<PlayerResponseDTO> playerList = this.repository.findAll().stream().map(PlayerResponseDTO::new).toList();

        return ResponseEntity.ok(playerList);
    }
}
