package spring.s4.datasmap;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.s4.datasmap.model.User;
import spring.s4.datasmap.repositories.UserRepo;

@Controller
@RequestMapping("/test/")
public class MainController {

	
	// Accès à la page d'acceuil
	
	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/index")
	public String index() {
		User u = new User();
		u.setName("nom");
		u.setLastName("Dalton");
		u.setEmail("joe.dalton@prison.org");
		
		return ("index");
		
	}
}
