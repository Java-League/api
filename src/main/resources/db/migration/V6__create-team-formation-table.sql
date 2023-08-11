CREATE TABLE team_players
(
    id        SERIAL PRIMARY KEY,
    team_id   INTEGER NOT NULL,
    player_id INTEGER NOT NULL,
    position  INTEGER NOT NULL,

    CONSTRAINT fk_bid_user FOREIGN KEY (team_id) REFERENCES team (id),
    CONSTRAINT fk_bid_player FOREIGN KEY (player_id) REFERENCES player (id)
);
