package com.example.java_league.service;

import com.example.java_league.domain.Bid;
import com.example.java_league.dto.BidDTO;
import com.example.java_league.mapper.BidMapper;
import com.example.java_league.repository.BidRepository;
import lombok.AllArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

@Service
@AllArgsConstructor
public class BidService {

    private final BidRepository bidRepository;
    private final BidMapper bidMapper;
    private final SimpMessagingTemplate simpMessagingTemplate;

    public BidDTO save(BidDTO bidDTO) {
        Bid bid = bidMapper.toEntity(bidDTO);
        bid.setDate(ZonedDateTime.now());
        bid = bidRepository.save(bid);
        simpMessagingTemplate.convertAndSend("/topic/bids", bid);
        return bidMapper.toDto(bid);
    }
}
