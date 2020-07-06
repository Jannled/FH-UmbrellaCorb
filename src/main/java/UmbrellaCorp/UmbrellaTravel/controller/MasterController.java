package UmbrellaCorp.UmbrellaTravel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MasterController 
{
	@GetMapping("index")
	public String indexGET(Model model)
	{
		return "index";
	}
}