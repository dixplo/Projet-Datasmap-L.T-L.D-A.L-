package spring.s4.datamap.controllers;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.jeemv.springboot.vuejs.VueJS;
//import io.github.jeemv.springboot.vuejs.VueJS;
import spring.s4.datasmap.model.User;
import spring.s4.datasmap.repositories.UserRepo;




@Controller
@RequestMapping("/test/")
public class MainController {
	
	// Accès à la page d'acceuil
	
	@Autowired
	private VueJS vue;
	
	@Autowired
	private UserRepo userRepo;
	
	
	@GetMapping("/inscription")
	public String inscription() {
		return ("inscription");
	}
	
	@PostMapping("/validationinscription")
	public String inscription(User user) {
		userRepo.save(user);
		return("validationinscription");		
	}
	
	
	@GetMapping("/connexion")
		public String connexion(ModelMap model) {
		vue.addData("valid", true);
		vue.addData("name", "");
		vue.addDataRaw("nameRules","[\n" + "v => !!v || 'Name is required',\n" +"v => (v && v.length <= 10) || 'Name must be less than 10 characters',\n" +"]");
		
		
		return ("connexion");
	}
}
