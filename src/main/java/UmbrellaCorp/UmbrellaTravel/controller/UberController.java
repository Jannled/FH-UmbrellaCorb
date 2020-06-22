package UmbrellaCorp.UmbrellaTravel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import UmbrellaCorp.UmbrellaTravel.User;

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
		model.addAttribute("user", new User());
		return "profil";
	}

	@GetMapping("login.html")
	public String loginGET(User user, Model model)
	{
		model.addAttribute("user", new User());
		return "login";
	}

	@GetMapping("registration.html")
	public String registrationGET(Model model)
	{
		model.addAttribute("user", "diesisteintest@umbrellatours.com");
		return "registration";
	}
	
}