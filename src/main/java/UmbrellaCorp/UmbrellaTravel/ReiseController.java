package UmbrellaCorp.UmbrellaTravel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReiseController 
{
	@Autowired
	private ReiseRepository reiseRepository;

	@GetMapping("/reisen")
	public String reisenRequest(Reise reise, Model model) 
	{
		model.addAttribute("journeys", reiseRepository.findAll());
		return "reise_buchen";
	}
}