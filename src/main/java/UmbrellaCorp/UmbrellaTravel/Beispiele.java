package UmbrellaCorp.UmbrellaTravel;

import UmbrellaCorp.UmbrellaTravel.entity.Kunde;
import UmbrellaCorp.UmbrellaTravel.entity.Reiseziel;

public class Beispiele 
{
	public static final Reiseziel[] reisen = {
		new Reiseziel("Urlaub auf Abstand", "Genießen sie ihren Urlaub jetzt auf Abstand ohne große Umstände", "Balkonien", 0.0f),
		new Reiseziel("Urlaub auf Abstand 2", "Die Perfekte Alternative, wenn sie keinen Balkon haben", "Terassien", 0.0f),
		new Reiseziel("Besuchen Sie unseren Firmensitz", "Raccoon City wurde im Jahr 1901 gegründet und erhielt den Titel Raccoon City zu Ehren der Waschbären, die die Umgebung füllten. Im Jahr 1962 zog die Abgeschiedenheit der Stadt die Aufmerksamkeit des Britischen Aristokraten Ozwell E. Spencer auf sich, der den Bau des Herrenhauses und des Forschungszentrums in der Wildnis des Raccon-Waldes in Auftrag gab. Im Jahr 1963 elektrifizierte ein Ingenieur und ein hervorragender Elektriker, Michael Warren, die Stadt. Im Jahr 1968 plant Michael, eine Straßenbahnlinie zu errichten, mit der das erste öffentliche Verkehrssystem geschaffen wird. Im Jahr 1969 gründeten die Kite-Brüder ein U-Bahn-System in der Stadt. Zunächst sind es nur ein paar Kilometer und drei Stationen. Die Stadt entwickelt sich mit der Unterstützung der Umbrella Corporation, die die meisten Projekte der Stadt finanziert, erfolgreich und gewinnt so das Vertrauen der meisten Bürger von Raccoon City. Das Unternehmen wurde von Ozwell Spencer gegründet, der Pharma- und Chemiefabriken in der Stadt baute.", "Raccoon City", 19.98f),
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