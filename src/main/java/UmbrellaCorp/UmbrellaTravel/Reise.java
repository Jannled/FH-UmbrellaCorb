package UmbrellaCorp.UmbrellaTravel;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity
public class Reise 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;

	@NotBlank(message = "Reisebeginn ist ein notwendiges Feld!")
	private Date beginn;

	@NotBlank(message = "Reieseende ist ein notwendiges Feld!")
	private Date ende;
	//TODO private Reiseort reiseziel;

	public Reise()
	{
		this(new Date(0), new Date((new java.util.Date()).getTime()));
	}

	public Reise(Date beginn, Date ende)
	{
		this.beginn = beginn;
		this.ende = ende;
		//reiseziele = new LinkedList<Reiseort>();
	}

	/*public void zielHinzufuegen(Reiseort ziel)
	{
		reiseziele.add(ziel);
	}*/

	public Date getBeginn() {
		return beginn;
	}

	public Date getEnde() {
		return ende;
	}

	/*public List<Reiseort> getZiele()
	{
		return reiseziele;
	}*/
}