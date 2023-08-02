CREATE TABLE bid
(
    id         SERIAL  PRIMARY KEY,
    user_id       INTEGER NOT NULL,
    player_id    INTEGER NOT NULL,
    bid_value DECIMAL NOT NULL,
    date TIMESTAMP NOT NULL,

    CONSTRAINT fk_user_player_user FOREIGN KEY (user_id) REFERENCES users(id),
    CONSTRAINT fk_user_player_player FOREIGN KEY (player_id) REFERENCES player(id)
);
