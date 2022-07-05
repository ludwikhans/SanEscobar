---
--- ANIMALS
---

INSERT INTO animals (id, name, products1, products2, money_profit1, money_profit2, cost_of_buying, requirement, suistenance1,value_of_suistenance1, suistenance2,value_of_suistenance2, info, special_for)
VALUES (1, 'kury', 'jaja', null, 1.0, 25.0, 1.0 ,'kurnik','zboże', 27.5, null, null,'sprzedaż jaj wymaga składu',null),
       (2, 'kaczki', null, null, 4.5, null, 1.5 ,'staw, tama lub rzeka oraz kurnik',null, null, null, null,null,null),
       (3, 'króliki', null, null, 1.5, null, 1.5 ,'królikarnia','łąka', 9,null, null, null,null),
       (4, 'gęsi', 'pierze', null, 2.5, 2.4, 2.5 ,'staw, tama lub rzeka oraz kurnik','zboże', 22.8,null, null, 'ostzrzeżenie przed bandytami',null),
       (5, 'kozy', null, null, 15.0, null, 15.0 ,'zagroda','łąka', 15, null,null, null, null),
       (6, 'owce', 'wełna', null, 20.0, 7.5, 20.0 ,'zagroda','łąka', 30, null, null, null, null),
       (7, 'świnie', null, null, 75.0, null, 75.0 ,'chlew','zboże', 87.5, null, null, null,null),
       (8, 'krowy', null, null, 90.0, null, 90.0 ,'stajnia','łąka', 30, null, null, '+10 do plonów jeśli jest gnojownik',null),
       (9, 'konie', null, null, 150.0, null, 150.0 ,'stadnina','łąka', 8.0, 'owies', 20.0, '+25% do plonów',null),
       (10, 'ryby', null, null, 10.0, null, 10.0 ,'staw, tama lub rzeka',null, null, null, null, null, null),
       (11, 'pszczoły', null, null, null, null, 4.0 ,'chatka pszczelarza',null, null, null, null,null,null),
       (12, 'jeleń', null, null, 120.0, null, null ,'zagroda leśna','łąka', 30 ,'las', 10.0, null,'północ'),
       (13, 'osioł', null, null, 120.0, null, 120.0 ,'zagroda','łąka', 36.5, null, null,'dodaje 3 miejsca handlowe','zachód'),
       (14, 'zwierzęta futerkowe', 'futra', null, 200.0, null, 60.0 ,'zagroda','kury', 100.0, null, null, null,null),
       (15, 'jedwabniki', 'nić jedwabna', null, 200.0, null, 60 ,'las','las', 10.0, null, null,null,null);


---
--- BUILDINGS
---

INSERT INTO buildings (id, name, product1, product2, money_profit1, money_profit2, cost_of_buildings, requirements1, requirements2,suistenance, value_of_suistenance, info, special_for, number_of_animals, place_for_goods)
VALUES (1, 'kurnik', null, null, null, null, 40.0 ,null, null, null, null,'umożliwia hodowle kur lub kaczek', null, 100, null),
       (2, 'gęsiarnia', null, null, null, null, 40.0 ,null, null, null, null,'umożliwia hodowle kur lub gęsi lub kaczek', null, 50, null),
       (3, 'królikarnia', null, null, null, null, 20.0 ,null, null, null, null,'umożliwia hodowle królików', null, 100, null),
       (4, 'zagroda', null, null, null, null, 60.0 ,'pasterka', null, null, null,'umożliwia hodowle kuz, owiec lub osłów', null, 100, null),
       (5, 'chlew', null, null, null, null, 60.0 ,'dom sołtysa', 'pasterka', null, null,'umożliwia hodowle świń', null, 100, null),
       (6, 'stajnia', null, null, null, null, 200.0 ,'kasztel', 'dwór', null, null,'umożliwia hodowle krów', null, 100, null),
       (7, 'stadnina', null, null, null, null, 300.0 ,'zamek', 'pałac', null, null,'umożliwia hodowle koni', null, 20, null),
       (8, 'staw', null, null, null, null, 400.0 ,null, null, null, null,'umożliwia hodowle ryb', null, null, null),
       (9, 'gnojownik', null, null, null, null, 50.0 ,'stajnia', 'chlew', null, null,'podwojenie plonu wybranej rośliny', null, null, null),
       (10, 'droga', null, null, null, null, 25.0 ,null, null, null, null,'dodaje jedno miejsce handlowe', null, null, 1),
       (11, 'drogowskazy', null, null, null, null, 50.0 ,null, null, null, null,'dodaje jedno miejsce handlowe', null, null, 1),
       (12, 'słupy graniczne', null, null, null, null, 100.0 ,'drogowskazy', null, null, null,'dodaje jedno miejsce handlowe', null, null, 1),
       (13, 'kapliczka', null, null, null, null, 150.0 ,null, null, null, null,'raz na poziom można pominąć wydarzenie', null, null, null),
       (14, 'studnia', null, null, null, null, 30.0 ,null, null, null, null,'zaopatrzenie w wodę podczas suszy', null, null, null),
       (15, 'pasterka', null, null, null, null, 60.0 , null,null, null, null,'umożliwia budowe zagrody lub chlewu', null, null, null),
       (16, 'leśniczówka', 'drewno', null, 150.0, null, 400.0 ,null, null, 'las', 10,'dostarcza drewno', null, null, null),
       (17, 'myśliczówka', 'mięso', null, 125.0, null, 450.0 ,null, null, 'las', 100,'dostarcza dziczyzne', null, null, null),
       (18, 'rybaczówka', 'ryby', null, 10.0, null, 200.0 ,'staw', 'rzeka', null, null,'dostarcza ryby', null, null, null),
       (19, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1),
       (20, 'chatka pszczelarza', 'miód', 'wosk', 10.0, 0.25, 20.0 , null,null, null, null,'umożliwia zbiór produktów pszczelich', null, null, null),
       (21, 'dom sołtysa', null, null, null, null, 200.0 , null,null, 'pole', 162,'umożliwia stawianie budynków folwarcznych', null, null, null),
       (22, 'stragan', null, null, null, null, 200.0 , 'dom sołtysa',null, null, null,'dodaje trzy miejsca handlowe', null, null, 3),
       (23, 'karawana', null, null, null, null, 400.0 , 'stragan',null, null, null,'dodaje trzy miejsca handlowe', null, null, 3),
       (24, 'kasztel', null, null, 125.0, null, 3000.0 , null,null, 'pole', 288,'zostajesz opiekunem mniejszych wiosek, które przynoszą ci zyski', null, null, null),
       (25, 'dwór', null, null, null, null, 2000.0 , null,null, 'pole', 288,'dodaje 5 miejsc handlowych', null, null, 5),
       (26, 'palisada', null, null, null, null, 1000.0 , null,null, null, null,'ochrona przed bandytami', null, null, null),
       (27, 'mleczarnia z krowiego mleka', 'mleko krowie', null, 360.0, null, 600.0 , null,null, 'krowy', 30.0,'umożliwia sprzedaż mleka', null, null, null),
       (28, 'mleczarnia z koziego mleka', 'mleko kozie', null, 240.0, null, 600.0 , null,null, 'kozy', 100.0,'umożliwia sprzedaż mleka', null, null, null),
       (29, 'mleczarnia z owczego mleka', 'mleko owcze', null, 240.0, null, 600.0 , null,null, 'owce', 100.0,'umożliwia sprzedaż mleka', null, null, null),
       (30, 'serownia z krowiego mleka', 'ser', null, 450.0, null, 800.0 ,'mleko krowie', null,null,  null,'umożliwia sprzedaż mleka', null, null, null),
       (31, 'serownia z koziego mleka', 'ser', null, 300.0, null, 800.0 ,'mleko kozie', null,null,  null,'umożliwia sprzedaż serów', null, null, null),
       (32, 'serownia z owczego mleka', 'ser', null, 300.0, null, 800.0 ,'mleko owcze', null,null,  null,'umożliwia sprzedaż serów', null, null, null),
       (33, 'pierwsza rozbudowa serowni z krowiego mleka', 'śmietana', null, 90.0, null, 400.0 ,'serownia z krowiego mleka', null,null,  null,'umożliwia sprzedaż dodatkową sprzedaż śmietany', null, null, null),
       (34, 'pierwsza rozbudowa serowni z koziego mleka', 'śmietana', null, 75.0, null, 400.0 ,'serownia z koziego mleka', null,null,  null,'umożliwia sprzedaż dodatkową sprzedaż śmietany', null, null, null),
       (35, 'pierwsza rozbudowa serowni z owczego mleka', 'śmietana', null, 75.0, null, 400.0 ,'serownia z owczego mleka', null,null,  null,'umożliwia sprzedaż dodatkową sprzedaż śmietany', null, null, null),
       (36, 'druga rozbudowa serowni z krowiego mleka', 'masło', null, 110.0, null, 200.0 ,'pierwsza rozbudowa serowni z krowiego mleka', null,null,  null,'umożliwia sprzedaż dodatkową sprzedaż masła', null, null, null),
       (37, 'druga rozbudowa serowni z koziego mleka', 'masło', null, 90.0, null, 200.0 ,'pierwsza rozbudowa serowni z koziego mleka', null,null,  null,'umożliwia sprzedaż dodatkową sprzedaż masła', null, null, null),
       (38, 'druga rozbudowa serowni z koziego mleka', 'masło', null, 90.0, null, 200.0 ,'pierwsza rozbudowa serowni z koziego mleka', null,null,  null,'umożliwia sprzedaż dodatkową sprzedaż masła', null, null, null),
       (39, 'węglarnia', 'węgiel', null, 160.0, null, 600.0 , 'leśniczówka',null, null, null,'umożliwia produkcję węgla drzewnego z drewna', null, null, null),
       (40, 'tartak', 'deski', null, 200.0, null, 600.0 , 'leśniczówka',null, null, null,'umożliwia produkcję desek z drewna', null, null, null),
       (41, 'stolarnia', 'meble', null, 250.0, null, 800.0 , 'tartak',null, null, null,'umożliwia produkcję mebli z desek', null, null, null);

