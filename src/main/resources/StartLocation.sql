

INSERT INTO building_central (id, name, product1, product2, money_profit1, money_profit2, cost_of_buildings, requirements1, requirements2,suistenance, value_of_suistenance, info, special_for, number_of_animals, place_for_goods, amaount, animal_in_building)
VALUES  (1, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1, 1, null),
        (2, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1, 1, null),
        (3, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1, 1, null);

INSERT INTO building_east (id, name, product1, product2, money_profit1, money_profit2, cost_of_buildings, requirements1, requirements2,suistenance, value_of_suistenance, info, special_for, number_of_animals, place_for_goods, amaount, animal_in_building)
VALUES  (1, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1, 1, null),
        (2, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1, 1, null),
        (3, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1, 1, null),
        (4, 'Mała stadnina', null, null, null, null, 150.0 ,null, null, null, null,'umożliwia hodowle koni', 'wschód', 10, null, 1, 'Koń');

INSERT INTO building_north (id, name, product1, product2, money_profit1, money_profit2, cost_of_buildings, requirements1, requirements2,suistenance, value_of_suistenance, info, special_for, number_of_animals, place_for_goods, amaount, animal_in_building)
VALUES  (1, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1, 1, null),
        (2, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1, 1, null),
        (3, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1, 1, null);

INSERT INTO building_south (id, name, product1, product2, money_profit1, money_profit2, cost_of_buildings, requirements1, requirements2,suistenance, value_of_suistenance, info, special_for, number_of_animals, place_for_goods, amaount, animal_in_building)
VALUES  (1, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1, 1, null),
        (2, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1, 1, null),
        (3, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1, 1, null);

INSERT INTO building_west (id, name, product1, product2, money_profit1, money_profit2, cost_of_buildings, requirements1, requirements2,suistenance, value_of_suistenance, info, special_for, number_of_animals, place_for_goods, amaount, animal_in_building)
VALUES  (1, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1, 1, null),
        (2, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1, 1, null),
        (3, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1, 1, null);

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

INSERT INTO goods_central (id, name, usingMerchant,typ)
VALUES (1, 'Pszenica jara', 1,1);

INSERT INTO goods_east (id, name, usingMerchant,typ)
VALUES (1, 'Owies', 1,1),
       (2, 'Mustang', 1,2);

INSERT INTO goods_north (id, name, usingMerchant,typ)
VALUES (1, 'Pszenica ozima', 1,1);

INSERT INTO goods_south (id, name, usingMerchant,typ)
VALUES (1, 'Jęczmień', 1,1);

INSERT INTO goods_west (id, name, usingMerchant,typ)
VALUES (1, 'Żyto', 1,1);

