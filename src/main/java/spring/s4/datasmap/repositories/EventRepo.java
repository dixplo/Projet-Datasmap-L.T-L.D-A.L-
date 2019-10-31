package spring.s4.datasmap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.s4.datasmap.model.Event;

public interface EventRepo extends JpaRepository <Event,Integer>{

}
