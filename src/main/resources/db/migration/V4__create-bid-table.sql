CREATE TABLE bid
(
    id        SERIAL PRIMARY KEY,
    user_id   INTEGER NOT NULL,
    player_id INTEGER NOT NULL,
    bid_value DECIMAL NOT NULL,
    date      TIMESTAMP,

    CONSTRAINT fk_bid_user FOREIGN KEY (user_id) REFERENCES users (id),
    CONSTRAINT fk_bid_player FOREIGN KEY (player_id) REFERENCES player (id)
);
