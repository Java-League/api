CREATE TABLE player
(
    id         SERIAL  PRIMARY KEY,
    name       TEXT    NOT NULL,
    overall    INTEGER NOT NULL,
    price      INTEGER    NOT NULL,
    image_url   TEXT    NOT NULL,
    is_favorite TEXT    NOT NULL
);