package UmbrellaCorp.UmbrellaTravel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import UmbrellaCorp.UmbrellaTravel.User;

@Controller
public class UberController 
{
	@GetMapping("index")
	public String indexGET()
	{
		return "index";
	}

	@GetMapping("profil")
	public String profilGET(Model model)
	{
		model.addAttribute("user", new User());
		return "profil";
	}

	@GetMapping("login")
	public String loginGET(User user, Model model)
	{
		model.addAttribute("user", new User());
		return "login";
	}

	@GetMapping("registration")
	public String registrationGET(Model model)
	{
		model.addAttribute("user", new User());
		return "registration";
	}
	
}