package UmbrellaCorp.UmbrellaTravel.controller;

import java.security.Principal;
import java.util.Arrays;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import UmbrellaCorp.UmbrellaTravel.entity.Kunde;
import UmbrellaCorp.UmbrellaTravel.entity.Reise;
import UmbrellaCorp.UmbrellaTravel.entity.Reiseziel;
import UmbrellaCorp.UmbrellaTravel.entity.User;
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

	@PostMapping("urlaubsprofil")
	public void reiseBewerten(Model model, 
		@NotNull(message = "Sie müssen angemeldet sein, um eine Reise zu bewerten!") Principal principal, 
		@RequestParam("reiseID") String reiseID, 
		@RequestParam("bewertung") String bewertung)
	{
		User u = benutzerRepository.findByEmail(principal.getName());
		if(u instanceof Kunde)
		{
			Kunde kunde = (Kunde) u;
			Reise reise = kunde.getReise(Long.parseLong(reiseID));
			Reiseziel reiseziel = reiseRepository.findById(reise.getZiel().getID()).get();

			
			benutzerRepository.save(kunde);
		}
		else
			throw new RuntimeException(u.toString() + " ist kein Kunde!");
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
			Reiseziel r = reiseRepository.findById(Long.parseLong(reiseID)).get();
			kunde.reiseBuchen(r);
			benutzerRepository.save(kunde);
		}
		else
			throw new RuntimeException(u.toString() + " ist kein Kunde!");

		System.out.println(u.toString() + " hat Reise mit ID " + reiseID + " gebucht!");

		return reisenRequest(model, principal);
	}
}