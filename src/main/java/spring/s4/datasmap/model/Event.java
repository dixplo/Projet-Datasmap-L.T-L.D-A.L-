package spring.s4.datasmap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Event {

	// fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	private int date;
	
	
	public Event(String name, String description,int date) {
		this.name = name;
		this.description = description;
		this.date = date;
		
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getDate() {
		return date;
	}


	public void setDate(int date) {
		this.date = date;
	}
}

