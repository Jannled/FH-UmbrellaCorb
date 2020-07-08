package UmbrellaCorp.UmbrellaTravel.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Kunde extends User 
{
	private static final long serialVersionUID = 1L;

	private boolean gesperrt;

	@OneToMany(targetEntity = Reise.class, cascade = CascadeType.ALL)
	List<Reise> reisen = new LinkedList<Reise>();
	
	public Kunde() {
		super("--Vorname--", "--Nachname--", "--Email--", "--Passwort--");
		this.gesperrt = false;
	}
	
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

	public void reiseBuchen(Reiseziel r) {
		reisen.add(new Reise(r, new Bewertung()));
	}

	public List<Reise> getReisen()
	{
		return reisen;
	}

	public Reise getReise(long ID)
	{
		for(Reise r : reisen)
			if(r.getID() == ID) return r;

		return null;
	}

	@Override
	public boolean isAccountNonLocked() {
		return !gesperrt;
	}

	public long getKundennummer() {
		return getID();
	}

	@Override
	public String toString() {
		String s = super.toString();
		return s.substring(0, s.length()-1) + ", Gebuchte Reisen: " + reisen.size() + ", Gesperrt: " + gesperrt + ")";
	}
}
