

public class Ambassador {
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
