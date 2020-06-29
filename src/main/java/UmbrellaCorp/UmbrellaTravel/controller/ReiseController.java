package UmbrellaCorp.UmbrellaTravel.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import UmbrellaCorp.UmbrellaTravel.Kunde;
import UmbrellaCorp.UmbrellaTravel.Reise;
import UmbrellaCorp.UmbrellaTravel.User;
import UmbrellaCorp.UmbrellaTravel.repository.ReiseRepository;

@Controller
public class ReiseController 
{
	@Autowired
	private ReiseRepository reiseRepository;

	@GetMapping("urlaubsprofil")
	public String reisenRequest(Reise reise, Model model, Principal principal) 
	{
		System.out.println("Benutzer " + (principal != null ? principal.getName() : "--NULL--") + " hat die Seite aufgerufen!");
		model.addAttribute("reisen", new Kunde().getReisen());
		model.addAttribute("user", new User());
		return "urlaubsprofil";
	}
}