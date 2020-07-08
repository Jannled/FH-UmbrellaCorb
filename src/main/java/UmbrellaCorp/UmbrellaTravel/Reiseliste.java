package UmbrellaCorp.UmbrellaTravel;

import UmbrellaCorp.UmbrellaTravel.entity.Kunde;
import UmbrellaCorp.UmbrellaTravel.entity.Reiseziel;

public class Reiseliste 
{
	public static final Reiseziel[] reisen = {
		new Reiseziel("Urlaub auf Abstand", "Genießen sie ihren Urlaub jetzt auf Abstand ohne große Umstände", "Balkonien", 0.0f),
		new Reiseziel("Urlaub auf Abstand 2", "Die Perfekte Alternative, wenn sie keinen Balkon haben", "Terassien", 0.0f),
		new Reiseziel("UmbrellaCorp Exclusiv", "Wollen sie sich mit Corona infizieren, aber Naziparolen auf der Straße brüllen ohne Mindestabstand ist Ihnen zu doof, \nbuchen sie diesen Trip", "Tönnies", 10.5f),
		//Reise von Independent Contractor erstellt
		new Reiseziel("Privatinsel Irgendwo im Nordatlantik", "Haben Sie eine ganze Insel im Nordatlantik nur für sich. (Lebensversicherung nicht inklusive)", "Rockall", 9999.99f),
		new Reiseziel("Safari", "Exotische Tiere erwarten Sie in diesem gewaltigen Freiluftgehege.", "90° 0′ 0″ S", 123.45f),
		new Reiseziel("Erlebnisurlaub", "Erfahren Sie selbst wie es ist, von der Sahelzone bis nach Europa zu reisen. (Erlebnis kann variieren. Wir übernehmen keine Haftung für Verletzungen, Versklavung und/oder Tod)", "Irgendwo im Nirgendwo", 45.45f),
		new Reiseziel("Kreuzfahrt", "Erleben Sie die wunderschöne Küste am Horn von Afrika, während Sie von Einheimischen auf die Fischerei mitgenommen werden. Der Kreuzfahrtteil dieser Reise beginnt ab einem zufälligen Zeitpunkt und findet auf einem unbekanntem Handelsschiff statt.", "Mogadischu/Somalia", 32.23f),
		new Reiseziel("Work and Travel", "Sie wollen etwas erleben, sind aber knapp bei Kasse? Work and Travel ist die Lösung für Sie. Erleben Sie die norwegische Kultur hautnah, während Sie zusammen mit Kollegen auf der Bohrinsel Troll A, auch als Sea Troll bekannt, vor der Küste Norwegens Erdgas fördern.", "Ausschließliche Wirtschaftszone Norwegens der Nordsee", 60.01f),
		new Reiseziel(),
	};

	public static final Kunde[] kunden = {
		new Kunde("Niklas", "Heuke", "niklas@umbrella.tours", "niklas", false),
		new Kunde("Jannik", "Schmöle", "jannik@umbrella.tours", "jannik", false),
		new Kunde("Felix", "Schorlemer", "felix@umbrella.tours", "felix", false),
		new Kunde("Jendrik", "Schulze", "jendrik@umbrella.tours", "jendrik", false)
	};
}