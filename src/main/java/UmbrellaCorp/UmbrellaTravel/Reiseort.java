package UmbrellaCorp.UmbrellaTravel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reiseort 
{
	@Id
	private int ID;
	private String name;
	private String ort;

	public Reiseort(String name, String ort)
	{
		this.name = name;
		this.ort = ort;
	}

	public String getOrt() {
		return ort;
	}

	public String getName() {
		return name;
	}
}