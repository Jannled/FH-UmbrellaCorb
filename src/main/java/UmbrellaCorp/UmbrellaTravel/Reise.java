package UmbrellaCorp.UmbrellaTravel;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

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
	//private List<Reiseort> reiseziele;

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