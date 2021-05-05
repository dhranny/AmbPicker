package com.ambPicker.business;

import com.ambPicker.models.*;


public class Picker {
	
	private AmbOptions options;
	
	Picker(AmbOptions options){
		this.options = options;
	}
	
	public Ambassador pick() {
		int randomNum = (int)(Math.random()*options.size());
		Ambassador selectedOption = options.get(randomNum);
		return selectedOption;
	}

	public ArrangedPairs collate(){
		ArrangedPairs pickedPairs = new ArrangedPairs();
		while(!options.isEmpty()) {
			Pair newPair = pickPair();
			pickedPairs.add(newPair);
		}
		return pickedPairs;
	}
	
	private Pair pickPair() {
		Ambassador pairOptionA, pairOptionB;
		Pair pair = new Pair();
		do {
			pairOptionA = pick();
			pairOptionB = pick();
		}
		while(pairOptionA == pairOptionB);
		pairOptionA.increaseNoOfUse();
		pairOptionB.increaseNoOfUse();
		pair.setFirstAmb(pairOptionA.getId());
		pair.setSecondAmb(pairOptionB.getId());
		if(pairOptionA.getNoOfUse() >= options.getMaxOccurence()) {
			options.remove(pairOptionA);
		}
		if(pairOptionB.getNoOfUse() >= options.getMaxOccurence()) {
			options.remove(pairOptionB);
		}
		return pair;
	}
}
