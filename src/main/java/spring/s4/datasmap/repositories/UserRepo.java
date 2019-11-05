package spring.s4.datasmap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import spring.s4.datasmap.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
