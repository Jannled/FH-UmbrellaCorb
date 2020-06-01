package UmbrellaCorp.UmbrellaTravel;

public class Reiseort 
{
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