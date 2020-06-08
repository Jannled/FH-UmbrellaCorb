package UmbrellaCorp.UmbrellaTravel;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UberController 
{
	@RequestMapping("/benutzer")
	public String benutzerRequest() {
		return "<a href=\"login.html\">Bitte melden sie sich an</a>";
		
	}
	
	@RequestMapping("/reisen")
	public String reisenRequest() {
		return "<a href=\"login.html\">Bitte melden sie sich an</a>";
		
	}
}