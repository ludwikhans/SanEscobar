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
       (12, 'jeleń', null, null, 120.0, null, null ,'zagroda leśna','łąka', 30 ,null, null, null,'północ'),
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
       (18, 'rybaczówka na rzece', 'ryby', null, 10.0, null, 200.0 ,'rzeka', null, null, null,'dostarcza ryby', null, null, null),
       (19, 'rybaczówka na stawie', 'ryby', null, 10.0, null, 200.0 ,'staw', null, null, null,'dostarcza ryby', null, null, null),
       (20, 'rybaczówka na jeziorze', 'ryby', null, 10.0, null, 200.0 ,'jezioro', 'tama', null, null,'dostarcza ryby', null, null, null),
       (21, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1),
       (22, 'chatka pszczelarza', 'miód', 'wosk', 10.0, 0.25, 20.0 , null,null, null, null,'umożliwia zbiór produktów pszczelich', null, null, null),
       (23, 'dom sołtysa', null, null, null, null, 200.0 , null,null, 'pole', 162,'umożliwia stawianie budynków folwarcznych', null, null, null),
       (24, 'stragan', null, null, null, null, 200.0 , 'dom sołtysa',null, null, null,'dodaje trzy miejsca handlowe', null, null, 3),
       (25, 'karawana', null, null, null, null, 400.0 , 'stragan',null, null, null,'dodaje trzy miejsca handlowe', null, null, 3),
       (26, 'kasztel', null, null, 125.0, null, 3000.0 , null,null, 'pole', 288,'zostajesz opiekunem mniejszych wiosek, które przynoszą ci zyski', null, null, null),
       (27, 'dwór', null, null, null, null, 2000.0 , null,null, 'pole', 288,'dodaje 5 miejsc handlowych', null, null, 5),
       (28, 'palisada', null, null, null, null, 1000.0 , null,null, null, null,'ochrona przed bandytami', null, null, null),
       (29, 'mleczarnia z krowiego mleka', 'mleko krowie', null, 360.0, null, 600.0 , null,null, 'krowy', 30.0,'umożliwia sprzedaż mleka', null, null, null),
       (30, 'mleczarnia z koziego mleka', 'mleko kozie', null, 240.0, null, 600.0 , null,null, 'kozy', 100.0,'umożliwia sprzedaż mleka', null, null, null),
       (31, 'mleczarnia z owczego mleka', 'mleko owcze', null, 240.0, null, 600.0 , null,null, 'owce', 100.0,'umożliwia sprzedaż mleka', null, null, null),
       (32, 'serownia z krowiego mleka', 'ser', null, 450.0, null, 800.0 ,'mleko krowie', null,null,  null,'umożliwia sprzedaż mleka', null, null, null),
       (33, 'serownia z koziego mleka', 'ser', null, 300.0, null, 800.0 ,'mleko kozie', null,null,  null,'umożliwia sprzedaż serów', null, null, null),
       (34, 'serownia z owczego mleka', 'ser', null, 300.0, null, 800.0 ,'mleko owcze', null,null,  null,'umożliwia sprzedaż serów', null, null, null),
       (35, 'pierwsza rozbudowa serowni z krowiego mleka', 'śmietana', null, 90.0, null, 400.0 ,'serownia z krowiego mleka', null,null,  null,'umożliwia sprzedaż dodatkową sprzedaż śmietany', null, null, null),
       (36, 'pierwsza rozbudowa serowni z koziego mleka', 'śmietana', null, 75.0, null, 400.0 ,'serownia z koziego mleka', null,null,  null,'umożliwia sprzedaż dodatkową sprzedaż śmietany', null, null, null),
       (37, 'pierwsza rozbudowa serowni z owczego mleka', 'śmietana', null, 75.0, null, 400.0 ,'serownia z owczego mleka', null,null,  null,'umożliwia sprzedaż dodatkową sprzedaż śmietany', null, null, null),
       (38, 'druga rozbudowa serowni z krowiego mleka', 'masło', null, 110.0, null, 200.0 ,'pierwsza rozbudowa serowni z krowiego mleka', null,null,  null,'umożliwia sprzedaż dodatkową sprzedaż masła', null, null, null),
       (39, 'druga rozbudowa serowni z koziego mleka', 'masło', null, 90.0, null, 200.0 ,'pierwsza rozbudowa serowni z koziego mleka', null,null,  null,'umożliwia sprzedaż dodatkową sprzedaż masła', null, null, null),
       (40, 'druga rozbudowa serowni z koziego mleka', 'masło', null, 90.0, null, 200.0 ,'pierwsza rozbudowa serowni z koziego mleka', null,null,  null,'umożliwia sprzedaż dodatkową sprzedaż masła', null, null, null),
       (41, 'węglarnia', 'węgiel', null, 160.0, null, 600.0 , 'leśniczówka',null, null, null,'umożliwia produkcję węgla drzewnego z drewna', null, null, null),
       (42, 'tartak', 'deski', null, 200.0, null, 600.0 , 'leśniczówka',null, null, null,'umożliwia produkcję desek z drewna', null, null, null),
       (43, 'stolarnia', 'meble', null, 250.0, null, 800.0 , 'tartak',null, null, null,'umożliwia produkcję mebli z desek', null, null, null),
       (44, 'garbarnia', 'skóry', null, 25.0, null, 200.0 , 'mała rzeźnia','duża rzeźnia', null, null,'umożliwia produkcję skór oprócz samego mięsa', null, null, null),
       (45, 'warsztat szewca', 'buty', null, 80.0, null, 400.0 , 'garbarnia',null, null, null,'umożliwia produkcję butów', null, null, null),
       (46, 'warsztat skórzanago krawca', 'skórzane ubrania', null, 150.0, null, 600.0 , 'garbarnia',null, null, null,'umożliwia produkcję skórzanych ubrań', null, null, null),
       (47, 'ubojnia drobiu', 'mięso', null, 2.5, null, 40.0 , 'kurnik','gęsiarnia', null, null,'umożliwia produkcję mięsa z kur, kaczek lub gęsi', null, null, null),
       (48, 'ubojnia królików', 'mięso', null, 2.5, null, 40.0 , 'królikarnia',null, null, null,'umożliwia produkcję mięsa z królików', null, null, null),
       (49, 'mała rzeźnia', 'mięso', null, 35.0, null, 140.0 , 'zagroda','chlew', null, null,'umożliwia produkcję mięsa z kuz, owiec, osłów lub świń', null, null, null),
       (50, 'duża rzeźnia', 'mięso', null, 180.0, null, 700.0 , 'stajnia','stadnina', null, null,'umożliwia produkcję mięsa z krów lub koni', null, null, null),
       (51, 'rzeźnia jeleni', 'mięso', null, 180.0, null, 700.0 , 'zagroda leśna',null, null, null,'umożliwia produkcję mięsa z jeleni', null, null, null),
       (52, 'rymarz', 'siodła', null, 40.0, null, 350. , 'garbarnia',null, null, null,'umożliwia produkcję siodeł', null, null, null),
       (53, 'zagroda leśna', null, null, null, null, 60.0 ,null, null, 'las', 10,'umożliwia hodowle jeleni','północ',  100, null ),
       (54, 'las', null, null, null, null, 1000.0 ,null, null, null, null,'zakup 10 ha lasu ', 'północ', null, null),
       (55, 'papiernia', 'papier', null, 250.0, null, 600.0 ,'leśniczówka', null, null, null,'umożliwia produkcje papieru ',  'północ', null, null),
       (56, 'lichwiarz', null, null, 40.0, null, 120.0 ,null, null, null, null,'pożyczanie pięniędzy na procent',  'południe', null, null),
       (57, 'bednarka', 'beczki', null, 250.0, null, 800.0 ,'tartak', null, null, null,'umożliwia produkcje beczek',  'południe', null, null),
       (58, 'winnica', 'wino', null, 625.0, null, 4000.0 ,'bednarka', null, 'winorośl', 5,'umożliwia produkcje win', 'południe', null, null),
       (59, 'rancho', 'konie', null, 120.0, null, 500.0 ,null, null, null, null,'umożliwia łapanie dziko żyjących koni a następnie ich sprzedaż',  'wschód', null, null),
       (60, 'kopalnia rud żelaza', 'ruda żelaza', null, 150.0, null, 1000.0 ,null, null, null, null,'umożliwia łwydobycie rud żelaza',  'wschód', null, null),
       (61, 'huta stali', 'stal', null, 1500.0, null, 4000.0 ,null, null, 'węglarnia', 6,'umożliwia produkcje stali',  'wschód', null, null),
       (62, 'poborca podatkowy', null, null, 50.0, null, 120.0 ,'droga', null, null, null,'pubiera opłatę od kupców',  'zachód', null, null),
       (63, 'dom gońca', null, null, 50.0, null, 150.0 ,null, null, null, null,'przenosi wiadomości pomiędzy miastami',  'centrum', null, null),
       (64, 'melioracja', null, null, null, null, 600.0 ,null, null, null, null,'odporność upraw na suszę',  'centrum', null, null),
       (65, 'cukrownia', 'cukier', null, 200.0, null, 600.0 ,null, null, 'trzcina cukrowa', 10,'umożliwia produkcje cukru',  'centrum', null, null),
       (66, 'kopalnia gliny', 'glina', null, 10.0, null, 60.0 ,'złoże gliny', null, null, null,'umożliwia wydobycie gliny', null, null, null),
       (67, 'garncaria', 'garnki', null, 40.0, null, 300.0 ,null, null, null, null,'umożliwia produkcje garnków', null, null, null),
       (68, 'cegielnia', 'cegły', null, 60.0, null, 400.0 ,null, null, null, null,'umożliwia produkcje cegieł', null, null, null),
       (69, 'kamieniołom marmuru', 'marmur', null, 150.0, null, 350.0 ,'złoże marmuru', null, null, null,'umożliwia wydobycie marmuru', null, null, null),
       (70, 'kamieniołom wapienia', 'wapień', null, 100.0, null, 350.0 ,'złoże wapienia', null, null, null,'umożliwia wydobycie wapienia', null, null, null),
       (71, 'kamieniołom granitu', 'granit', null, 100.0, null, 350.0 ,'złoże granitu', null, null, null,'umożliwia wydobycie granitu', null, null, null),
       (72, 'kopalnia złota', 'złoto', null, 1000.0, null, 4000.0 ,'złoże złota', null, null, null,'umożliwia wydobycie złota', null, null, null),
       (73, 'kopalnia diamentów', 'diamenty', null, 1000.0, null, 4000.0 ,'złoże diamentów', null, null, null,'umożliwia wydobycie diamentów', null, null, null),
       (74, 'sklep z przyprawami', null, null, 1000.0, null, 4000.0 ,'przyprawy', null, null, null,'umożliwia sprzedaż przypraw', null, null, null),
       (75, 'mennica', 'złote monety', null, 2000.0, null, 6000.0 ,'zkopalnia złota', null, null, null,'umożliwia wybijanie monet', null, null, null),
       (76, 'jubiler', 'biżuteria', null, 3000.0, null, 10000.0 ,'kopalnia złota', 'kopalnia diamentów', null, null,'umożliwia produkcje biżuterii', null, null, null);

---
--- PLANTS
---

INSERT INTO plants (id, name, products, money_profit, harvest, sowing_cost, requirements, info, special_for,years_old, category)
VALUES (1, 'owies', 'owies', 0.125, 3.4, 0.1, null ,'Zboże służące jako pasza dla koni',null, null, 'zboże'),
       (2, 'jęczmień', 'jęczmień', 0.57, 4, 0.1, null ,'odporne na zarazy',null, null, 'zboże'),
       (3, 'żyto', 'żyto', 0.54, 6.25, 0.1, null ,'służy do produkcji piwa i mąki',null, null, 'zboże'),
       (4, 'pszenica jara', 'pszenica jara', 0.64, 5, 0.1, null ,'Do produkcji mąki',null, null, 'zboże'),
       (5, 'pszenica ozima', 'pszenica ozima', 0.58, 4.5, 0.1, null ,'Odporna na zimno',null, null, 'zboże'),
       (6, 'las', 'drewno', null, null, 25.0, null ,'Zasadzenie lasu',null, 0, 'las'),
       (7, 'las dębowy', 'drewno', null, null, null, null ,'Las dębowy',null, 300, 'las'),
       (8, 'las bukowy', 'drewno', null, null, null, null ,'las bukowy',null, 200, 'las'),
       (9, 'las świerkowy', 'drewno', null, null, null, null ,'las świerkowy',null, 100, 'las'),
       (10, 'las sosnowy', 'drewno', null, null, null, null ,'las sosnowy',null, 50, 'las'),
       (11, 'las brzozowy', 'drewno', null, null, null, null ,'las brzozowyu',null, 20, 'las'),
       (12, 'las iglasty', 'drewno', null, null, null, null ,'las iglasty',null, 75, 'las'),
       (13, 'las liściasty', 'drewno', null, null, null, null ,'las liściasty',null, 135, 'las');



---
--- FIELD
---

INSERT INTO fields (id, name, cost_of_buying, area, info)
VALUES (1, 'pole', 50, 1, 'Można je obsiać roślinami'),
        (2, 'łąka', 50, 1, 'podstawa do hodowli zwierząt');

---
--- EVENT
---

INSERT INTO event (id, name, info)
VALUES (1, 'przymrozki', 'Tego roku były niepodziewane długie przymrozki, twoje plony są o 50% mniejsze'),
       (2, 'Złoże marmuru', 'w okolicy odnajdujesz złożę marmuru'),
       (3, 'Pechowa podkowa', 'wasze konie zgobiły podkowy. Musieliście je podkuć. Wydaliści na to 1000 sztuk złota'),
       (4, 'Dobre łowy', 'Udało wam się upolować rekordową liczbę zwierząt. Dwa razy więcej niż zazwyczaj'),
       (5, 'Wilki', 'W okolicy grasują wilki. Zjadły wszystkie twoje owce'),
       (6, 'Złoże wapienia', 'w okolicy odnajdujesz złożę wapienia'),
       (7, 'Urażony kupiec', 'Kupiec, który do tej pory był stalym bywalcem obraził się na jednego mieszkańca i więcej się już nie pojawił'),
       (8, 'Złapani bandyci', 'Udało wam się pojmać okolicznych bandytów. Dostajecie 100 sztuk złota'),
       (9, 'Złoże gliny', 'odnajdujesz złoże gliny'),
       (10, 'Fałszerz', 'W wiosce znaleziono pasera przez to spadła cena ubrań o 50%'),
       (11, 'mały nieurodzaj', 'zbiory zbóż są mniejsze o 10%'),
       (12, 'Złoże granitu', 'w okolicy odnajdujesz złożę granitu'),
       (13, 'Atak bandytów', 'Na twoją wioskę napadają bandyci i kradną 500 sztuk złota'),
       (15, 'Spadek z sąsiedniej wioski', 'Ktoś z sąsiedniej wioski przypisał wam spadek i dostajecie 2 ha Pola'),
       (16, 'Zła reputacja', 'W wyniku złej reputacji wasze przychody spadły o 10%'),
       (17, 'Drewno dobrej jakości', 'Ścięte drzewo okazuje siębyć bardzo dobrej jakości jego cena wzrasta o 25%'),
       (18, 'Zaraza', 'W wyniku zarazy umiera co czwarty mieszkaniec. PRzychody spadają o 25%'),
       (19, 'Nowa odmiana zbóż', 'Wyhodowałeś nową odmianę zboża. Jego plony wzrastają o 10%'),
       (20, 'Dary od Króla', 'Król przejeżdząjąc przez wioskę daje 250 sztuk złota na rozbudowe wsi');


---
--- BUILDINGS FOR ANIMAL
---

INSERT INTO buildings_for_animals (animals_id,buildings_id)
VALUES (1,1),
       (2,1),
       (4,2),
       (3,3),
       (5,4),
       (6,4),
       (13,4),
       (7,5),
       (8,6),
       (9,7),
       (10,8),
       (11,22),
       (12,53);

INSERT INTO south_building (id, name, product1, product2, money_profit1, money_profit2, cost_of_buildings, requirements1, requirements2,suistenance, value_of_suistenance, info, special_for, number_of_animals, place_for_goods)
VALUES  (1, 'skład', null, null, null, null, 50.0 , null,null, null, null,'dodaje jedno miejsce handlowe', null, null, 1);


INSERT INTO fields_start (id, name, cost_of_buying, area, info)
VALUES (1, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (2, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (3, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (4, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (5, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (6, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (7, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (8, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (9, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (10, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (11, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (12, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (13, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (14, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (15, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (16, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (17, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (18, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (19, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (20, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (21, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (22, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (23, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (24, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (25, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (26, 'pole', 50, 1, 'Można je obsiać roślinami'),
       (27, 'pole', 50, 1, 'Można je obsiać roślinami'),
        (28, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (29, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (30, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (31, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (32, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (33, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (34, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (35, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (36, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (37, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (38, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (39, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (40, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (41, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (42, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (43, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (44, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (45, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (46, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (47, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (48, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (49, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (50, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (51, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (52, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (53, 'łąka', 50, 1, 'podstawa do hodowli zwierząt'),
       (54, 'łąka', 50, 1, 'podstawa do hodowli zwierząt');

commit ;