package UmbrellaCorp.UmbrellaTravel.Entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Kunde extends User 
{
	private static final long serialVersionUID = 1L;

	private boolean gesperrt;

	@OneToMany(targetEntity = ReiseV2.class)
	List<ReiseV2> reisen = new LinkedList<ReiseV2>();
	
	public Kunde() {
		super("--Vorname--", "--Nachname--", "--Email--", "--Passwort--");
		this.gesperrt = false;
	}
	
	public Kunde(String vorname, String nachname, String email, String passwort, boolean gesperrt) {
		super(vorname, nachname, email, passwort);
		this.gesperrt = gesperrt;
		reisen.add(new ReiseV2()); // CLUDGE
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
	
	public void reiseBuchen(ReiseV2 r) {
		reisen.add(r);
	}

	public List<ReiseV2> getReisen()
	{
		return reisen;
	}

	@Override
	public boolean isAccountNonLocked() {
		return !gesperrt;
	}
}
