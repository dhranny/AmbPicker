package com.ambPicker.restControllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ambPicker.data.ArrangedPairsRepo;
import com.ambPicker.models.ArrangedPairs;

@RestController
@RequestMapping("/")
public class AmbController {
	
	private ArrangedPairsRepo arrangedRepo;
	@Autowired
	AmbController (ArrangedPairsRepo arrangedRepo){
		this.arrangedRepo = arrangedRepo;
	}
	
	@GetMapping(path = "/get/{id}", produces = "application/json")
	public ResponseEntity<ArrangedPairs> getArranged(Long id) {
		Optional<ArrangedPairs> optionalPairs = arrangedRepo.findById(id);
		if(optionalPairs.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		ArrangedPairs arrangedPairs = optionalPairs.get();
		ResponseEntity<ArrangedPairs> responseToReturn = new ResponseEntity<>(arrangedPairs, HttpStatus.OK);
		return responseToReturn;
	}

	
}
