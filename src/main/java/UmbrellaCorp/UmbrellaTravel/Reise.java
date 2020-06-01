package UmbrellaCorp.UmbrellaTravel;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

public class Reise 
{
	private Date beginn;
	private Date ende;
	private List<Reiseort> reiseziele;

	public Reise(Date beginn, Date ende)
	{
		this.beginn = beginn;
		this.ende = ende;
		reiseziele = new LinkedList<Reiseort>();
	}

	public void zielHinzufuegen(Reiseort ziel)
	{
		reiseziele.add(ziel);
	}

	public Date getBeginn() {
		return beginn;
	}

	public Date getEnde() {
		return ende;
	}

	public List<Reiseort> getZiele()
	{
		return reiseziele;
	}
}