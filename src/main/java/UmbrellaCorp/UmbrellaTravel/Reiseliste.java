package UmbrellaCorp.UmbrellaTravel;

import UmbrellaCorp.UmbrellaTravel.Entity.ReiseV2;

public class Reiseliste 
{
	public static final ReiseV2[] reisen = {
		new ReiseV2("Urlaub auf Abstand", "Genießen sie ihren Urlaub jetzt auf Abstand ohne große Umstände", "Balkonien", 0.0f, (short) 10),
		new ReiseV2("Urlaub auf Abstand 2", "Die Perfekte Alternative, wenn sie keinen Balkon haben", "Terassien", 0.0f, (short) 10),
		new ReiseV2("UmbrellaCorp Exclusiv", "Wollen sie sich mit Corona infizieren, aber Naziparolen auf der Straße brüllen ohne Mindestabstand ist Ihnen zu doof, \nbuchen sie diesen Trip", "Tönnies", 10.5f, (short) 1),
		new ReiseV2("Rockall", "Haben Sie eine ganze Insel im Nordatlantik nur für sich. (Lebensversicherung nicht inklusive)", "Irgendwo im Nordatlantik", 9999.99f, (short) 9),
		new ReiseV2("Safari", "Exotische Tiere erwarten Sie in diesem gewaltigen Freiluftgehege.", "90° 0′ 0″ S", 123.45f, (short) 8),
		new ReiseV2(),
	};

	public static ReiseV2[] getReiseziele()
	{
		return reisen;
	}
}