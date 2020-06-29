package UmbrellaCorp.UmbrellaTravel.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import UmbrellaCorp.UmbrellaTravel.User;
import UmbrellaCorp.UmbrellaTravel.repository.BenutzerRepository;

@Controller
public class UberController 
{
	@Autowired
	BenutzerRepository repoUser;

	@GetMapping("index")
	public String indexGET(Model model)
	{
		model.addAttribute("user", new User());
		return "index";
	}

	@GetMapping("profil")
	public String profilGET(Model model, Principal principal)
	{
		model.addAttribute("user", new User());
		return "profil";
	}

	@GetMapping("login")
	public String loginGET(Model model, Principal principal)
	{
		model.addAttribute("user", new User());
		return "login";
	}

	@GetMapping("registration")
	public String registrationGET(Model model, Principal principal)
	{
		model.addAttribute("user", new User());
		return "registration";
	}
	
}