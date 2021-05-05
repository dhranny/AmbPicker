package com.ambPicker.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Pair {
	@Id
	private long id;
	
	private Long firstAmb;
	
	private Long secondAmb;

}
