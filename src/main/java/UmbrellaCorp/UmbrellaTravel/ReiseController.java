package UmbrellaCorp.UmbrellaTravel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReiseController 
{
	//@Autowired
	//private ReiseRepository reiseRepository;

	@GetMapping("/reisen")
	public String reisenRequest(Reise reise, Model model) 
	{
	//	model.addAttribute("reisen", reiseRepository.findAll());
		return "reise_buchen";
	}
}