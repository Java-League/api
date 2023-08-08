package com.example.java_league.repository;

import com.example.java_league.domain.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BidRepository extends JpaRepository<Bid, Long> {

    @Query("SELECT MAX(b.value) FROM Bid b WHERE b.playerId = :playerId")
    Long findMaxBidValueForPlayer(@Param("playerId") Long playerId);

    @Query("SELECT CASE WHEN COUNT(b) > 0 THEN TRUE ELSE FALSE END " +
            "FROM Bid b WHERE b.playerId = :playerId AND b.teamId = :teamId")
    boolean existsBidForPlayerAndTeam(
            @Param("playerId") Long playerId,
            @Param("teamId") Long teamId);

    Bid findFirstByPlayerIdOrderByValueDesc(Long playerId);
}
