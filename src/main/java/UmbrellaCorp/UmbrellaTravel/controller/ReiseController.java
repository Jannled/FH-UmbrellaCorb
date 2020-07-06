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
import UmbrellaCorp.UmbrellaTravel.Entity.Reise;
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
	public String reisenRequest(Reise reise, Model model, Principal principal) 
	{
		if(principal == null)
			model.addAttribute("user", new Kunde());
		else
			model.addAttribute("user", benutzerRepository.findByEmail(principal.getName()));
		
		model.addAttribute("reisen", new Kunde().getReisen());
		
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
	public String buchenRequest(@RequestParam("reiseID") String reiseID, @NotNull(message = "Sie müssen angemeldet sein, um eine Reise zu buchen!") Principal principal)
	{
		if(principal == null)
			return "login";

		System.out.println("Reise mit ID " + reiseID + " gebucht!");
		User u = benutzerRepository.findByEmail(principal.getName());
		if(u instanceof Kunde)
		{
			Kunde kunde = (Kunde) u;
			kunde.reiseBuchen(reiseRepository.findById(Long.parseLong(reiseID)).get());
		}
		else
			throw new RuntimeException(u.toString() + " ist kein Kunde!");
		
		return "urlaubsprofil";
	}
}