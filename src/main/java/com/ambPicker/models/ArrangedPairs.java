package com.ambPicker.models;

import java.util.ArrayList;
import lombok.Data;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Entity;

@Entity
@Data
public class ArrangedPairs{

	@Id
	private long Id;
	
	@ManyToMany
	private ArrayList<Pair> pairList;
	
	public void add(Pair pair) {
		pairList.add(pair);
	}
}