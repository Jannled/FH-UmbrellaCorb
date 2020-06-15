package UmbrellaCorp.UmbrellaTravel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UberController 
{
	@GetMapping("index.html")
	public String indexGET()
	{
		return "index";
	}

	@GetMapping("profil.html")
	public String profilGET()
	{
		return "profil";
	}
}