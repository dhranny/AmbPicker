package com.ambPicker.models;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class AmbOptions {

	@Id
	private int id;
	
	@OneToMany
	private ArrayList<Ambassador> ambsInOptions;
	
	private int maxOccurence;
	
	public void add(Ambassador amb) {
		ambsInOptions.add(amb);
	}
	
	public void remove(Ambassador amb) {
		ambsInOptions.remove(amb);
	}
	
	public Ambassador get(int indexNum) {
		return ambsInOptions.get(indexNum);
	}
	
	public int size() {
		return ambsInOptions.size();
	}
	
	public boolean isEmpty() {
		return ambsInOptions.isEmpty();
	}
}
