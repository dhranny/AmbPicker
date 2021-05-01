import java.util.ArrayList;
public class Picker {
	private ArrayList<Ambassador> options;
	private int maxOccurence;
	Picker(){
		options = new ArrayList<Ambassador>();
	}
	
	public void newOption(Ambassador option) {
		options.add(option);
	}
	public void setMaxOccurence(int maxOccurence) {
		this.maxOccurence = maxOccurence;
	}
	
	public Ambassador pick() {
		int randomNum = (int)(Math.random()*options.size());
		Ambassador selectedOption = options.get(randomNum);
		return selectedOption;
	}

	public ArrayList<Ambassador[]> collate(){
		ArrayList<Ambassador[]> pickedPairs = new ArrayList<Ambassador[]>();
		while(!options.isEmpty()) {
			Ambassador[] newPair = pickPair();
			pickedPairs.add(newPair);
		}
		return pickedPairs;
	}
	
	private Ambassador[] pickPair() {
		Ambassador pairOptionA, pairOptionB;
		Ambassador[] pair = new Ambassador[2];
		do {
			pairOptionA = pick();
			pairOptionB = pick();
		}
		while(pairOptionA == pairOptionB);
		pairOptionA.increaseNoOfUse();
		pairOptionB.increaseNoOfUse();
		pair[0] = pairOptionA;
		pair[1] = pairOptionB;
		if(pairOptionA.getNoOfUse() >= maxOccurence) {
			options.remove(pairOptionA);
		}
		if(pairOptionB.getNoOfUse() >= maxOccurence) {
			options.remove(pairOptionB);
		}
		return pair;
	}
}
