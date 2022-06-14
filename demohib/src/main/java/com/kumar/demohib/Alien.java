package com.kumar.demohib;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alien {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String colour;
	private String name;
	
	
	
	
	
	public Alien() {
		
	}


	public Alien(String colour, String name) {
		
		this.colour = colour;
		this.name = name;
	}
	
	
	public Alien(int id, String colour, String name) {
		
		this.id = id;
		this.colour = colour;
		this.name = name;
	}
	int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Alien [id=" + id + ", colour=" + colour + ", name=" + name + "]";
	}
	
	
	
	

}
