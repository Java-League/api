package com.example.java_league.repository;

import com.example.java_league.domain.TeamPlayers;
import com.example.java_league.dto.TeamPlayersDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamPlayersRepository extends JpaRepository<TeamPlayers, Long> {

    List<TeamPlayers> findAllByTeamId(Long id);
}
