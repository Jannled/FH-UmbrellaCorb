package UmbrellaCorp.UmbrellaTravel.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Repräsentiert eine gebuchte Reise
 */
@Entity
public class Reise 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;

	@OneToOne(cascade = CascadeType.ALL)
	private Bewertung bewertung;

	@OneToOne(cascade = CascadeType.ALL)
	private Reiseziel ziel;

	public Reise() {};

	public Reise(Reiseziel reiseziel, Bewertung bewertung)
	{
		this.ziel = reiseziel;
		this.bewertung = bewertung;
	}

	public long getID()
	{
		return ID;
	}

	public Reiseziel getZiel()
	{
		return ziel;
	}

	public void setZiel(Reiseziel reiseziel)
	{
		this.ziel = reiseziel;
	}

	public Bewertung getBewertung()
	{
		return bewertung;
	}

	public void setBewertung(Bewertung bewertung)
	{
		this.bewertung = bewertung;
	}
}