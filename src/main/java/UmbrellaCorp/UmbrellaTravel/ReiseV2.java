package UmbrellaCorp.UmbrellaTravel;

public class ReiseV2 
{
	private String titel;
	private String beschreibung;
	private String ort;

	/** Preis Pro Nacht pro Person */
	private float preis;

	/** 0-5 Sterne, Stern kann auch halb gefüllt sein */
	private short bewertung;
	
	public ReiseV2()
	{
		this("--Titel--", "--Beschreibung-- \n Fancy wa?", "--Ort--", -0.0f, (short) 10);
	}

	public ReiseV2(String titel, String beschreibung, String ort, float preis, short bewertung)
	{
		this.titel = titel;
		this.beschreibung = beschreibung;
		this.ort = ort;
		this.preis = preis;
		this.bewertung = bewertung;
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
		return bewertung;
	}

	public void setBewertung(short bewertung)
	{
		this.bewertung = bewertung;
	}
}