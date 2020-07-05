package UmbrellaCorp.UmbrellaTravel.Entity;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class User implements UserDetails {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;

	@NotBlank(message = "Bitte geben Sie ihren Vorname an!")
	private String vorname;

	@NotBlank(message = "Bitte geben Sie ihren Nachnamen an!")
	private String nachname;

	@NotBlank(message = "Bitte geben Sie eine gültige Email Adresse an!")
	@Column(nullable = false, unique = true)
	private String email;

	@NotBlank(message = "Bitte geben Sie ein valides Passwort ein!")
	private String password; // CLUDGE

	public User() {

	}

	public User(String vorname, String nachname, String email, String passwort) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email.toLowerCase();
		this.password = passwort;
	}

	public boolean verifyPasswort(String passwort) {
		return this.password.equals(passwort);
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public long getID() {
		return ID;
	}

	public void setID(long ID) {
		this.ID = ID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email.toLowerCase();
	}

	public void setPasswort(String passwort) {
		this.password = passwort;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		final List<GrantedAuthority> authorities = Collections.singletonList(new SimpleGrantedAuthority("User"));
        return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}