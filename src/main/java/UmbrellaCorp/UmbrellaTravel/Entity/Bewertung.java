package UmbrellaCorp.UmbrellaTravel.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bewertung 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
	
	/** 0-5 Sterne, Stern kann auch halb gefüllt sein (sprich Werte von 0-10) */
	private short punkte;
	
	public Bewertung() {
		this.punkte = 0;
	}
	
	public Bewertung(short punkte) {
		this.punkte = punkte;
	}
	
	public int getPunkte() {
		return punkte;
	}
	
	public void setPunkte(short punkte) {
		this.punkte = punkte;
	}
	
	
}
