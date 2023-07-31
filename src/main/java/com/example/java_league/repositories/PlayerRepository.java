package com.example.java_league.repositories;

import com.example.java_league.domain.player.Player;
import jakarta.persistence.OrderBy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {

    @Override
    @OrderBy("id") // Ordena a lista pelo campo 'id'
    List<Player> findAll();
}
