/* Ein paar Kunden einfügen */
INSERT INTO PUBLIC."USER"
(DTYPE, ID, EMAIL, NACHNAME, PASSWORD, VORNAME, GESPERRT)
VALUES('Kunde', 3, 'jannik@umbrella.tours', 'Schmöle', '$2a$10$lwjcGDaVMhfwqP6N9f/.gOchE6KQ/mLkQioYdyZVEEIve0yPlH9Au', 'Jannik', false);
INSERT INTO PUBLIC."USER"
(DTYPE, ID, EMAIL, NACHNAME, PASSWORD, VORNAME, GESPERRT)
VALUES('Kunde', 4, 'felix@umbrella.tours', 'Schorlemer', '$2a$10$tayt64izRcq9T2Glydr6j.APX4GXlXcEuWi8VP7e818EsVrU.wgv6', 'Felix', false);
INSERT INTO PUBLIC."USER"
(DTYPE, ID, EMAIL, NACHNAME, PASSWORD, VORNAME, GESPERRT)
VALUES('Kunde', 5, 'jendrik@umbrella.tours', 'Schulze', '$2a$10$UNufene1gZEPYkpp/0mk7.954LY1/XFXRvc21/apRMnujt1PwQuS.', 'Jendrik', false);
INSERT INTO PUBLIC."USER"
(DTYPE, ID, EMAIL, NACHNAME, PASSWORD, VORNAME, GESPERRT)
VALUES('Kunde', 6, 'niklas@umbrella.tours', 'Heuke', '$2a$10$CyzQgPzQNuKtNzO48ebJ8.vxNtgz6LNHaBk12XmstCtHhrqsxoyLi', 'Niklas', false);

/* Ein paar Reisen einfügen */
INSERT INTO PUBLIC.REISEV2
(ID, BESCHREIBUNG, BEWERTUNG, ORT, PREIS, TITEL)
VALUES(1, 'Genießen sie ihren Urlaub jetzt auf Abstand ohne große Umstände', 10, 'Balkonien', 0.0, 'Urlaub auf Abstand');
INSERT INTO PUBLIC.REISEV2
(ID, BESCHREIBUNG, BEWERTUNG, ORT, PREIS, TITEL)
VALUES(2, 'Die Perfekte Alternative, wenn sie keinen Balkon haben', 10, 'Terassien', 0.0, 'Urlaub auf Abstand 2');
INSERT INTO PUBLIC.REISEV2
(ID, BESCHREIBUNG, BEWERTUNG, ORT, PREIS, TITEL)
VALUES(3, 'Wollen sie sich mit Corona infizieren, aber Naziparolen auf der Straße brüllen ohne Mindestabstand ist Ihnen zu doof, 
buchen sie diesen Trip', 1, 'Tönnies', 10.5, 'UmbrellaCorp Exclusiv');
INSERT INTO PUBLIC.REISEV2
(ID, BESCHREIBUNG, BEWERTUNG, ORT, PREIS, TITEL)
VALUES(4, 'Haben Sie eine ganze Insel im Nordatlantik nur für sich. (Lebensversicherung nicht inklusive)', 9, 'Irgendwo im Nordatlantik', 9999.990234375, 'Rockall');
INSERT INTO PUBLIC.REISEV2
(ID, BESCHREIBUNG, BEWERTUNG, ORT, PREIS, TITEL)
VALUES(5, 'Exotische Tiere erwarten Sie in diesem gewaltigen Freiluftgehege.', 8, '90° 0′ 0″ S', 123.44999694824219, 'Safari');
INSERT INTO PUBLIC.REISEV2
(ID, BESCHREIBUNG, BEWERTUNG, ORT, PREIS, TITEL)
VALUES(6, 'Erfahren Sie selbst wie es ist, von der Sahelzone bis nach Europa zu reisen. (Erlebnis kann variieren. Wir übernehmen keine Haftung für Verletzungen, Versklavung und/oder Tod)', 3, 'Irgendwo im Nirgendwo', 45.45000076293945, 'Erlebnisurlaub');
INSERT INTO PUBLIC.REISEV2
(ID, BESCHREIBUNG, BEWERTUNG, ORT, PREIS, TITEL)
VALUES(7, 'Erleben Sie die wunderschöne Küste am Horn von Afrika, während Sie von Einheimischen auf die Fischerei mitgenommen werden. Der Kreuzfahrtteil dieser Reise beginnt ab einem zufälligen Zeitpunkt und findet auf einem unbekanntem Handelsschiff statt.', 4, 'Mogadischu/Somalia', 32.22999954223633, 'Kreuzfahrt');
INSERT INTO PUBLIC.REISEV2
(ID, BESCHREIBUNG, BEWERTUNG, ORT, PREIS, TITEL)
VALUES(8, 'Sie wollen etwas erleben, sind aber knapp bei Kasse? Work and Travel ist die Lösung für Sie. Erleben Sie die norwegische Kultur hautnah, während Sie zusammen mit Kollegen auf der Bohrinsel Troll A, auch als Sea Troll bekannt, vor der Küste Norwegens Erdgas fördern.', 6, 'Ausschließliche Wirtschaftszone Norwegens der Nordsee', 60.0099983215332, 'Work and Travel');
INSERT INTO PUBLIC.REISEV2
(ID, BESCHREIBUNG, BEWERTUNG, ORT, PREIS, TITEL)
VALUES(9, '--Beschreibung-- 
 Fancy wa?', 10, '--Ort--', 0.0, '--Titel--');
