package spring.s4.datasmap.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.s4.datasmap.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
    public Optional<User> findByEmailAndPassword(String email, String password);
}
