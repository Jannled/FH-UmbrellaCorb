package UmbrellaCorp.UmbrellaTravel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Repärsentiert eine Reise die gebucht werden kann
 */
@Entity
public class Reiseziel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
	
	private String titel;

	@Column(length = 1023)
	private String beschreibung;

	private String ort;

	/** Preis Pro Nacht pro Person */
	private float preis;

	/** 0-5 Sterne, Stern kann auch halb gefüllt sein (sprich Werte von 0-10) */
	private long anzBewertungen;
	private float bewertung;
	
	public Reiseziel()
	{
		this("--Titel--", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. ", "--Ort--", -0.0f);
	}

	public Reiseziel(String titel, String beschreibung, String ort, float preis)
	{
		this.titel = titel;
		this.beschreibung = beschreibung;
		this.ort = ort;
		this.preis = preis;
	}

	public short updateBewertung(short bewertung)
	{
		this.bewertung = (this.bewertung * anzBewertungen + bewertung) / ++anzBewertungen;
		System.out.printf("Bewertung für %s: %.3f %n", toString(), this.bewertung);
		return bewertung;
	}

	public long getID()
	{
		return ID;
	}

	public void setID(long ID)
	{
		this.ID = ID;
	}

	public String getTitel()
	{
		return titel;
	}

	public void setTitel(String titel)
	{
		this.titel = titel;
	}

	public String getBeschreibung()
	{
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung)
	{
		this.beschreibung = beschreibung;
	}

	public String getOrt()
	{
		return ort;
	}

	public void setOrt(String ort)
	{
		this.ort = ort;
	}

	public float getPreis()
	{
		return preis;
	}

	public void setPreis(float preis)
	{
		this.preis = preis;
	}

	public short getBewertung()
	{
		return (short) bewertung;
	}

	public void setBewertung(short bewertung)
	{
		this.bewertung = bewertung;
	}

	@Override
	public String toString() {
		return "Reiseziel(ID: " + getID() + ", Titel: " + getTitel() + ", Bewertung: " + bewertung + ")";
	}
}