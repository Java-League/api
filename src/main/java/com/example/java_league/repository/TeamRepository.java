package com.example.java_league.repository;

import com.example.java_league.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

    Team findFirstByUserId(Long userId);

    List<Team> findAllByUserIdIsNull();
}
