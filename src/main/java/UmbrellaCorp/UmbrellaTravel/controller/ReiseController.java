package UmbrellaCorp.UmbrellaTravel.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import UmbrellaCorp.UmbrellaTravel.Kunde;
import UmbrellaCorp.UmbrellaTravel.Reise;
import UmbrellaCorp.UmbrellaTravel.User;
import UmbrellaCorp.UmbrellaTravel.repository.BenutzerRepository;
import UmbrellaCorp.UmbrellaTravel.repository.ReiseRepository;

@Controller
public class ReiseController 
{
	@Autowired
	private ReiseRepository repoReise;

	@Autowired
	BenutzerRepository repoUser;

	@GetMapping("urlaubsprofil")
	public String reisenRequest(Reise reise, Model model, Principal principal) 
	{
		if(principal == null)
			model.addAttribute("user", new User());
		else
			model.addAttribute("user", repoUser.findByEmail(principal.getName()).get(0));
		
		model.addAttribute("reisen", new Kunde().getReisen());
		
		return "urlaubsprofil";
	}

	@GetMapping("reise_suchen")
	public String suchenRequest(Model model, Principal principal)
	{
		return "reise_suchen";
	}
}