package com.example.java_league.controllers;

import com.example.java_league.dto.BidDTO;
import com.example.java_league.service.BidService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class BidController {

    private final BidService bidService;

    @PostMapping("/bid")
    public ResponseEntity postBid(@RequestBody @Valid BidDTO body){

        BidDTO bidDTO = bidService.save(body);
        return ResponseEntity.ok(bidDTO);
    }
}
