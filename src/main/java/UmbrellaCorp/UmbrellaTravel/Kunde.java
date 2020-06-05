package UmbrellaCorp.UmbrellaTravel;

public class Kunde extends User {
	private boolean gesperrt;
	
	public Kunde(String vorname, String nachname, String email, String passwort, boolean gesperrt) {
		super(vorname, nachname, email, passwort);
		this.gesperrt = gesperrt;
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
		
	}
}
