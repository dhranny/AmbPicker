package com.ambPicker.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Ambassador {
	
	@Id
	@Setter
	@Getter
	private Long Id;
	
	private String name;
	private int noOfUse;
	Ambassador(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void increaseNoOfUse() {
		noOfUse++;
	}
	
	public int getNoOfUse() {
		return noOfUse;
	}
}
