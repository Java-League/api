package com.example.java_league.controllers;

import com.example.java_league.dto.PlayerDTO;
import com.example.java_league.service.PlayerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class PlayerController {

    private final PlayerService playerService;

    @PostMapping("/player")
    public ResponseEntity postPlayer(@RequestBody @Valid PlayerDTO body) {
        PlayerDTO playerDTO = playerService.save(body);
        return ResponseEntity.ok(playerDTO);
    }

    @GetMapping("/player")
    public ResponseEntity getAllPlayers() {
        List<PlayerDTO> playerDTOS = playerService.getAllPlayers();
        return ResponseEntity.ok(playerDTOS);
    }

    @MessageMapping("/news")
    @SendTo("/topic/news")
    public String broadcastNews(@Payload String message) {
        return message;
    }
}
