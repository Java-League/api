CREATE TABLE bid
(
    id        SERIAL PRIMARY KEY,
    team_id   INTEGER NOT NULL,
    player_id INTEGER NOT NULL,
    value     INTEGER NOT NULL,
    date      TIMESTAMP,

    CONSTRAINT fk_bid_user FOREIGN KEY (team_id) REFERENCES team (id),
    CONSTRAINT fk_bid_player FOREIGN KEY (player_id) REFERENCES player (id)
);
