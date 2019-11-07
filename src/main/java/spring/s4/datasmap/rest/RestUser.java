package spring.s4.datasmap.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.s4.datasmap.model.User;
import spring.s4.datasmap.repositories.UserRepo;


	@RestController
	@RequestMapping("/rest/")
	public class RestUser {

	@Autowired
	private UserRepo userRepo;
	
	
	@PostMapping("connexion")
	public User getOne(@RequestBody User user) {
		Optional<User> use =userRepo.findByEmailAndPassword(user.getEmail(), user.getPassword());
		if (use.isPresent()) {
			return use.get();
		}
		return null;
	}

}
