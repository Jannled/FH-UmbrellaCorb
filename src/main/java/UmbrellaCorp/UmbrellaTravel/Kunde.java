package UmbrellaCorp.UmbrellaTravel;

import java.util.LinkedList;
import java.util.List;

public class Kunde extends User 
{
	private boolean gesperrt;
	List<Reise> reisen = new LinkedList<Reise>();
	
	public Kunde() {
		super("--Vorname--", "--Nachname--", "--Email--", "--Passwort--");
		this.gesperrt = false;
	}
	
	public Kunde(String vorname, String nachname, String email, String passwort, boolean gesperrt) {
		super(vorname, nachname, email, passwort);
		this.gesperrt = gesperrt;
		reisen.add(new Reise()); // CLUDGE
	}
	
	public boolean getGesperrt() {
		return gesperrt;
	}
	
	public void setGesperrt(boolean gesperrt) {
		this.gesperrt=gesperrt;
	}
	
	public void registrieren() {
		
	}
	
	public void beitragErstellen() {
		
	}
	
	public void reiseBuchen(Reise r) {
		reisen.add(r);
	}

	public List<Reise> getReisen()
	{
		return reisen;
	}
}
