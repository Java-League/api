package com.example.java_league.controllers;

import com.example.java_league.dto.BidDTO;
import com.example.java_league.service.BidService;
import com.example.java_league.service.PlayerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class BidController {

    private final BidService bidService;
    private final PlayerService playerService;
    private final SimpMessagingTemplate template;

    @PostMapping("/bid")
    public ResponseEntity postBid(@RequestBody @Valid BidDTO body){
        BidDTO bidDTO = bidService.save(body);
        template.convertAndSend("/topic/bid", bidDTO);
        return ResponseEntity.ok(bidDTO);
    }

    @MessageMapping("/sendBid")
    public void receiveMessage(@Payload BidDTO bidDTO) {
        // receive message from client
    }

    @SendTo("/topic/bid")
    public BidDTO broadcastMessage(@Payload BidDTO bidDTO) {
        return bidDTO;
    }
}
