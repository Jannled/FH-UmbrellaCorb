package UmbrellaCorp.UmbrellaTravel.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import UmbrellaCorp.UmbrellaTravel.Entity.User;
import UmbrellaCorp.UmbrellaTravel.repository.BenutzerRepository;

@Controller
public class UberController 
{
	@Autowired
	BenutzerRepository benutzerRepository;

	@GetMapping("index")
	public String indexGET(Model model)
	{
		return "index";
	}

	@GetMapping("profil")
	public String profilGET(Model model, Principal principal)
	{
		if(principal == null)
			model.addAttribute("user", new User());
		else
			model.addAttribute("user", benutzerRepository.findByEmail(principal.getName()));
		
		return "profil";
	}

	@GetMapping("login")
	public String loginGET(Model model, Principal principal)
	{
		if(principal == null)
			model.addAttribute("user", new User());
		else
			model.addAttribute("user", benutzerRepository.findByEmail(principal.getName()));

		return "login";
	}
}