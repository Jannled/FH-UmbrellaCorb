package UmbrellaCorp.UmbrellaTravel;

import UmbrellaCorp.UmbrellaTravel.Entity.ReiseV2;

public class Reiseliste 
{
	public static final ReiseV2[] reisen = {
		new ReiseV2("Urlaub auf Abstand", "Genießen sie ihren Urlaub jetzt auf Abstand ohne große Umstände", "Balkonien", 0.0f, (short) 10),
		new ReiseV2("UmbrellaCorp Exclusiv", "Wollen sie sich mit Corona infizieren, aber Naziparolen auf der Straße brüllen ohne Mindestabstand ist ihenn zu doof, \nbuchen sie diesen Trip", "Tönnies", 10.5f, (short) 1),
		new ReiseV2(),
	};

	public static ReiseV2[] getReiseziele()
	{
		return reisen;
	}
}