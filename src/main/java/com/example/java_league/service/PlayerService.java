package com.example.java_league.service;

import com.example.java_league.domain.Player;
import com.example.java_league.dto.PlayerDTO;
import com.example.java_league.mapper.PlayerMapper;
import com.example.java_league.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PlayerService {

    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;

    public PlayerDTO save(PlayerDTO playerDTO) {
        Player player = playerMapper.toEntity(playerDTO);
        // Implemente a lógica para cadastrar o jogador no banco de dados
        player = playerRepository.save(player);
        return playerMapper.toDto(player);
    }

    public List<PlayerDTO> getAllPlayers() {
        List<Player> player = playerRepository.findAll();
        return player.stream()
                .map(playerMapper::toDto)
                .collect(Collectors.toList());
    }

    public PlayerDTO getPlayerById(Long id) {
        Player player = playerRepository.findById(id).get();
        return playerMapper.toDto(player);
    }
}
