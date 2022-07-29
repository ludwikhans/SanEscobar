INSERT INTO south_building (id, name, product1, product2, money_profit1, money_profit2, cost_of_buildings, requirements1, requirements2,suistenance, value_of_suistenance, info, special_for, number_of_animals, place_for_goods)
VALUES  (1, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1),
        (2, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1),
        (3, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1);

INSERT INTO north_building (id, name, product1, product2, money_profit1, money_profit2, cost_of_buildings, requirements1, requirements2,suistenance, value_of_suistenance, info, special_for, number_of_animals, place_for_goods)
VALUES  (1, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1),
        (2, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1),
        (3, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1);

INSERT INTO east_building (id, name, product1, product2, money_profit1, money_profit2, cost_of_buildings, requirements1, requirements2,suistenance, value_of_suistenance, info, special_for, number_of_animals, place_for_goods)
VALUES  (1, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1),
        (2, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1),
        (3, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1),
        (4, 'Mała stadnina', null, null, null, null, 150.0 ,null, null, null, null,'umożliwia hodowle koni', 'wschód', 10, null);

INSERT INTO west_building (id, name, product1, product2, money_profit1, money_profit2, cost_of_buildings, requirements1, requirements2,suistenance, value_of_suistenance, info, special_for, number_of_animals, place_for_goods)
VALUES  (1, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1),
        (2, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1),
        (3, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1);

INSERT INTO central_building (id, name, product1, product2, money_profit1, money_profit2, cost_of_buildings, requirements1, requirements2,suistenance, value_of_suistenance, info, special_for, number_of_animals, place_for_goods)
VALUES  (1, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1),
        (2, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1),
        (3, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1);


INSERT INTO fields_central (id, name, cost_of_buying, area, info,seed_of_field)
VALUES (1, 'pole', 50*27, 27, 'Można je obsiać roślinami','Pszenica jara'),
       (2, 'łąka', 50*27, 27, 'podstawa do hodowli zwierząt',null);


INSERT INTO fields_east (id, name, cost_of_buying, area, info,seed_of_field)
VALUES (1, 'pole', 50*27, 27, 'Można je obsiać roślinami','Owies'),
       (2, 'łąka', 50*27, 27, 'podstawa do hodowli zwierząt',null);

INSERT INTO fields_north (id, name, cost_of_buying, area, info,seed_of_field)
VALUES (1, 'pole', 50*27, 27, 'Można je obsiać roślinami','Pszenica ozima'),
       (2, 'łąka', 50*27, 27, 'podstawa do hodowli zwierząt',null);

INSERT INTO fields_south (id, name, cost_of_buying, area, info,seed_of_field)
VALUES (1, 'pole', 50*27, 27, 'Można je obsiać roślinami','Jęczmień'),
       (2, 'łąka', 50*27, 27, 'podstawa do hodowli zwierząt',null);

INSERT INTO fields_west (id, name, cost_of_buying, area, info,seed_of_field)
VALUES (1, 'pole', 50*27, 27, 'Można je obsiać roślinami','Żyto'),
       (2, 'łąka', 50*27, 27, 'podstawa do hodowli zwierząt',null);
