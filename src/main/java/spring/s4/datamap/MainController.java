package spring.s4.datamap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test/")
public class MainController {

	
	// Accès à la page d'acceuil

	@GetMapping("/projet")
	public String index() {
		return ("index");
		
	}
}
