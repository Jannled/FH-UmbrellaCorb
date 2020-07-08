package UmbrellaCorp.UmbrellaTravel.controller;

import java.security.Principal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import UmbrellaCorp.UmbrellaTravel.Beispiele;
import UmbrellaCorp.UmbrellaTravel.entity.Kunde;
import UmbrellaCorp.UmbrellaTravel.repository.BenutzerRepository;

@Controller
public class UserController 
{
    @Autowired
    BenutzerRepository benutzerRepository;

	@GetMapping("login")
	public String loginGET(Model model, Principal principal)
	{
		//TODO Befüllt SQL mit Testeinträgen
		if(benutzerRepository.count() < 1)
			benutzerRepository.saveAll(Arrays.asList(Beispiele.kunden));

		if(principal == null)
			model.addAttribute("user", new Kunde());
		else
			model.addAttribute("user", benutzerRepository.findByEmail(principal.getName()));

		return "login";
	}

    @GetMapping("registration")
	public String registrationGET(Model model, Principal principal)
	{
		if(principal == null)
			model.addAttribute("user", new Kunde());
		else
			model.addAttribute("user", benutzerRepository.findByEmail(principal.getName()));

		return "registration";
	}
	
	@PostMapping("registration")
	public String registrationPUT(@ModelAttribute Kunde user)
	{
		user.encryptPassword(user.getPassword());
        benutzerRepository.save(user);
		return "login";
	}

	@GetMapping("profil")
	public String profilGET(Model model, Principal principal)
	{
		if(principal == null)
			return "login";
		else
			model.addAttribute("user", benutzerRepository.findByEmail(principal.getName()));
		
		return "profil";
	}
}