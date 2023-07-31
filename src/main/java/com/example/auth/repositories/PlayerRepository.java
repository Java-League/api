package com.example.auth.repositories;

import com.example.auth.domain.player.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, String> {
}
