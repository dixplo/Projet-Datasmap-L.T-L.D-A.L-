package spring.s4.datasmap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.s4.datasmap.model.Place;

public interface PlaceRepo extends JpaRepository<Place,Integer > {

}
