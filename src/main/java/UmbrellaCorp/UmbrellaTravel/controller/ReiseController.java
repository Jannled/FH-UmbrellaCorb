package UmbrellaCorp.UmbrellaTravel.controller;

import java.security.Principal;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import UmbrellaCorp.UmbrellaTravel.Entity.Kunde;
import UmbrellaCorp.UmbrellaTravel.Entity.Reise;
import UmbrellaCorp.UmbrellaTravel.Reiseliste;
import UmbrellaCorp.UmbrellaTravel.Entity.User;
import UmbrellaCorp.UmbrellaTravel.repository.BenutzerRepository;

@Controller
public class ReiseController 
{
	@Autowired
	BenutzerRepository benutzerRepository;

	@GetMapping("urlaubsprofil")
	public String reisenRequest(Reise reise, Model model, Principal principal) 
	{
		if(principal == null)
			model.addAttribute("user", new User());
		else
			model.addAttribute("user", benutzerRepository.findByEmail(principal.getName()));
		
		model.addAttribute("reisen", new Kunde().getReisen());
		
		return "urlaubsprofil";
	}

	@GetMapping("reise_suchen")
	public String suchenRequest(Model model, Principal principal)
	{
		model.addAttribute("reisen", Reiseliste.getReiseziele());
		return "reise_suchen";
	}

	@PostMapping("reise_buchen")
	public void buchenRequest(Model model, @NotNull(message = "Sie müssen angemeldet sein um eine Reise zu buchen!") Principal principal)
	{
		
	}
}