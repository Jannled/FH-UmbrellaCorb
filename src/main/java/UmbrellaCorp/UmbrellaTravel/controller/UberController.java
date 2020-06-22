package UmbrellaCorp.UmbrellaTravel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String profilGET(Model model)
	{
		
		return "profil";
	}

	@GetMapping("login.html")
	public String loginGET()
	{
		return "login";
	}

	@GetMapping("registration.html")
	public String registrationGET(Model model)
	{
		model.addAttribute("user", "diesisteintest@umbrellatours.com");
		return "registration";
	}
	
}