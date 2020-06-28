package UmbrellaCorp.UmbrellaTravel;

import java.util.LinkedList;
import java.util.List;

public class Unterkunft {
	private String name;
	private boolean barrierefrei;
	private short sterne;
	private int betten;
	private float preis;
	private List<Reise> reise;
	
	public Unterkunft() {
		this.name = "name";
		this.barrierefrei = false;
		this.sterne = 0;
		this.betten = 0;
		this.preis = 0;
	}

	public Unterkunft(String name, boolean barrierefrei, Short sterne, int betten, float preis) 
	{
		this.name = name;
		this.barrierefrei = barrierefrei;
		this.sterne = sterne;
		this.betten = betten;
		this.preis = preis;

		reise = new LinkedList<Reise>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getBarrierefrei() {
		return barrierefrei;
	}

	public void setBarrierefrei(boolean barrierefrei) {
		this.barrierefrei = barrierefrei;
	}

	public short getSterne() {
		return sterne;
	}

	public void setSterne(short sterne) {
		this.sterne = sterne;
	}

	public int getBetten() {
		return betten;
	}

	public void setBetten(int betten) {
		this.betten = betten;
	}

	public float getPreis() {
		return preis;
	}

	public void setPreis(float preis) {
		this.preis = preis;
	}

	public void einchecken() {

	}

	public void auschecken() {

	}
}
