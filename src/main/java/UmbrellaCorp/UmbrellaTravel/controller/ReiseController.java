package UmbrellaCorp.UmbrellaTravel.controller;

import java.security.Principal;
import java.util.Arrays;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import UmbrellaCorp.UmbrellaTravel.Entity.Kunde;
import UmbrellaCorp.UmbrellaTravel.Entity.User;
import UmbrellaCorp.UmbrellaTravel.Reiseliste;
import UmbrellaCorp.UmbrellaTravel.repository.BenutzerRepository;
import UmbrellaCorp.UmbrellaTravel.repository.ReiseRepository;

@Controller
public class ReiseController 
{
	@Autowired
	BenutzerRepository benutzerRepository;

	@Autowired
	ReiseRepository reiseRepository;

	@GetMapping("urlaubsprofil")
	public String reisenRequest(Model model, Principal principal) 
	{
		if(principal == null)
			return "login";

		Kunde kunde = (Kunde) benutzerRepository.findByEmail(principal.getName());
		model.addAttribute("user", kunde);
		model.addAttribute("reisen", kunde.getReisen());
		
		return "urlaubsprofil";
	}

	@GetMapping("reise_suchen")
	public String suchenRequest(Model model, Principal principal)
	{
		if(reiseRepository.count() < 1)
			reiseRepository.saveAll(Arrays.asList(Reiseliste.reisen));

		model.addAttribute("reisen", reiseRepository.findAll());
		return "reise_suchen";
	}

	@GetMapping("reise_buchen")
	public String buchenRequest(Model model, @RequestParam("reiseID") String reiseID, @NotNull(message = "Sie müssen angemeldet sein, um eine Reise zu buchen!") Principal principal)
	{
		if(principal == null)
			return "login";

		User u = benutzerRepository.findByEmail(principal.getName());
		if(u instanceof Kunde)
		{
			Kunde kunde = (Kunde) u;
			kunde.reiseBuchen(reiseRepository.findById(Long.parseLong(reiseID)).get());
			benutzerRepository.save(kunde);
		}
		else
			throw new RuntimeException(u.toString() + " ist kein Kunde!");

		System.out.println("Reise mit ID " + reiseID + " gebucht!");

		return reisenRequest(model, principal);
	}


}