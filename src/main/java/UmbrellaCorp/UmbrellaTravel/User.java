package UmbrellaCorp.UmbrellaTravel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;

	private String vorname;
	private String nachname;
	private long kundennummer;
	private String email;
	private String passwort; //CLUDGE

	private static int kundenCounter = 1000;

	public User(String vorname, String nachname, String email, String passwort)
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
		this.passwort = passwort;
		this.kundennummer = kundenCounter++;
	}

	public boolean verifyPasswort(String passwort)
	{
		return this.passwort.equals(passwort);
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public long getKundennummer() {
		return kundennummer;
	}

	public String getEmail() {
		return email;
	}
}