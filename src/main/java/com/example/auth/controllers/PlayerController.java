package com.example.auth.controllers;

import com.example.auth.domain.player.Player;
import com.example.auth.domain.player.PlayerRequestDTO;
import com.example.auth.domain.player.PlayerResponseDTO;
import com.example.auth.repositories.PlayerRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("player")
public class PlayerController {

    @Autowired
    PlayerRepository repository;

    @PostMapping
    public ResponseEntity postPlayer(@RequestBody @Valid PlayerRequestDTO body){
        Player newPlayer = new Player(body);

        this.repository.save(newPlayer);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity getAllPlayers(){
        List<PlayerResponseDTO> playerList = this.repository.findAll().stream().map(PlayerResponseDTO::new).toList();

        return ResponseEntity.ok(playerList);
    }
}
