import java.io.InputStream;
import java.util.Scanner;
public class DataSource {

	InputStream inputStream;
	Output output;
	Scanner scanner;
	Picker picker;
	
	DataSource(InputStream inputStream, Picker picker){
		this.inputStream = inputStream;
		scanner = new Scanner(inputStream);
		this.picker = picker;
	}
	
	public void setOutput(Output output) {
		this.output = output;
	}
	
	public void getMaxOccurence() {
		output.print("Please input the max pick for an option");
		int maxOccurence = scanner.nextInt();
		picker.setMaxOccurence(maxOccurence);
	}
	
	public void collectData() {
		getMaxOccurence();
		getName();
	}
	
	public void getName() {
		output.print("Input the name of anbassadors, then input \"end\" to stop");
		String newName;
		do {
			newName = readString();
			if(!newName.equalsIgnoreCase("end")) {
				Ambassador newAmb = new Ambassador(newName);
				picker.newOption(newAmb);
				output.print("Input \"end\" to stop");
			}
		}
		while(!newName.equalsIgnoreCase("end"));
	}
	
	private String readString() {
		String reading = "";
		while(reading.equals("")) {
			reading = scanner.nextLine();
			
		}
		return reading;
	}
}
