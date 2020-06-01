package UmbrellaCorp.UmbrellaTravel;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UberController 
{
	@RequestMapping("/")
	public String requestMethodName() {
		return "<a href=\"login.html\">Bitte melden sie sich an</a>";
		
	}
	
}