package UmbrellaCorp.UmbrellaTravel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;

	@NotBlank(message = "Bitte geben Sie ihren Vorname an!")
	private String vorname;

	@NotBlank(message = "Bitte geben Sie ihren Nachnamen an!")
	private String nachname;

	@NotBlank(message = "Bitte geben Sie eine gültige Email Adresse an!")
	private String email;

	@NotBlank(message = "Bitte geben Sie ein valides Passwort ein!")
	private String passwort; //CLUDGE

	public User()
	{
		this("--Vorname--", "--Nachname--", "--Email--", "--Passwort--");
	}

	public User(String vorname, String nachname, String email, String passwort)
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
		this.passwort = passwort;
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
		return ID;
	}

	public String getEmail() {
		return email;
	}

	String getPasswort()
	{
		return passwort;
	}
}