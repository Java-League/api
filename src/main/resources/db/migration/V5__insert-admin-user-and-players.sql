INSERT INTO public.users (id, login, password, role)
VALUES (1, 'admin', '$2a$10$WJXRtH7GoLMt8RtqmgD95e.3jJy2G.SqbmpG.iGFcLU2H.UDePmrS', '0');

INSERT INTO public.player (id, name, overall, price, image_url)
VALUES (1, 'K. Mbappé', 91, 5000, 'https://cdn.sofifa.net/players/231/747/23_60.png');
INSERT INTO public.player (id, name, overall, price, image_url)
VALUES (2, 'K. De Bruyne', 91, 5000, 'https://cdn.sofifa.net/players/192/985/23_60.png');
INSERT INTO public.player (id, name, overall, price, image_url)
VALUES (3, 'R. Lewandowski', 91, 5000, 'https://cdn.sofifa.net/players/188/545/23_60.png');
INSERT INTO public.player (id, name, overall, price, image_url)
VALUES (4, 'K. Benzema', 91, 5000, 'https://cdn.sofifa.net/players/165/153/23_60.png');
INSERT INTO public.player (id, name, overall, price, image_url)
VALUES (5, 'L. Messi', 91, 5000, 'https://cdn.sofifa.net/players/158/023/23_60.png');
INSERT INTO public.player (id, name, overall, price, image_url)
VALUES (6, 'E. Haaland', 90, 5000, 'https://cdn.sofifa.net/players/239/085/23_60.png');
INSERT INTO public.player (id, name, overall, price, image_url)
VALUES (7, 'T. Courtois', 90, 5000, 'https://cdn.sofifa.net/players/192/119/23_60.png');
INSERT INTO public.player (id, name, overall, price, image_url)
VALUES (8, 'Alisson', 89, 5000, 'https://cdn.sofifa.net/players/212/831/23_60.png');
INSERT INTO public.player (id, name, overall, price, image_url)
VALUES (9, 'J.Kimmich', 89, 5000, 'https://cdn.sofifa.net/players/212/622/23_60.png');
INSERT INTO public.player (id, name, overall, price, image_url)
VALUES (10, 'M. Salah', 89, 5000, 'https://cdn.sofifa.net/players/209/331/23_60.png');

INSERT INTO public.team (id, javalis, name, uniform1, uniform2, emblem)
VALUES (1, 250000, 'Paris Saint Germain',
        'https://cdn.sofifa.net/kits/73/23_0.png',
        'https://cdn.sofifa.net/kits/73/23_1.png',
        'https://cdn.sofifa.net/meta/team/591/120.png');
INSERT INTO public.team (id, javalis, name, uniform1, uniform2, emblem, user_id)
VALUES (2, 250000, 'Manchester City',
        'https://cdn.sofifa.net/kits/10/23_0.png',
        'https://cdn.sofifa.net/kits/10/23_1.png',
        'https://cdn.sofifa.net/meta/team/9/120.png', 1);
INSERT INTO public.team (id, javalis, name, uniform1, uniform2, emblem)
VALUES (3, 250000, 'FC Barcelona',
        'https://cdn.sofifa.net/kits/241/23_0.png',
        'https://cdn.sofifa.net/kits/241/23_1.png',
        'https://cdn.sofifa.net/meta/team/83/120.png');
INSERT INTO public.team (id, javalis, name, uniform1, uniform2, emblem)
VALUES (4, 250000, 'Real Madrid',
        'https://cdn.sofifa.net/kits/243/23_0.png',
        'https://cdn.sofifa.net/kits/243/23_1.png',
        'https://cdn.sofifa.net/meta/team/3468/120.png');
INSERT INTO public.team (id, javalis, name, uniform1, uniform2, emblem)
VALUES (5, 250000, 'Liverpool',
        'https://cdn.sofifa.net/kits/9/23_0.png',
        'https://cdn.sofifa.net/kits/9/23_1.png',
        'https://cdn.sofifa.net/meta/team/8/120.png');
INSERT INTO public.team (id, javalis, name, uniform1, uniform2, emblem)
VALUES (6, 250000, 'FC Bayern München',
        'https://cdn.sofifa.net/kits/21/23_0.png',
        'https://cdn.sofifa.net/kits/21/23_1.png',
        'https://cdn.sofifa.net/meta/team/503/120.png');
INSERT INTO public.team (id, javalis, name, uniform1, uniform2, emblem)
VALUES (7, 250000, 'Tottenham Hotspur',
        'https://cdn.sofifa.net/kits/18/23_0.png',
        'https://cdn.sofifa.net/kits/18/23_1.png',
        'https://cdn.sofifa.net/meta/team/6/120.png');
INSERT INTO public.team (id, javalis, name, uniform1, uniform2, emblem)
VALUES (8, 250000, 'Manchester United',
        'https://cdn.sofifa.net/kits/11/23_0.png',
        'https://cdn.sofifa.net/kits/11/23_1.png',
        'https://cdn.sofifa.net/meta/team/14/120.png');

