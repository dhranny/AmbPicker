import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AmbassadorPicker {
	Scanner scanner;
	Picker picker;
	DataSource source;
	Output output;
	
	AmbassadorPicker(){
		picker = new Picker();
		source = new DataSource(System.in, picker);
		output = new Output(System.out);
		source.setOutput(output);
	}
	
	private void processPicking() {
		source.collectData();
		this.printNames();
	}
	
	private void printNames() {
		ArrayList<Ambassador[]> pickedOptions = picker.collate();
		for(Ambassador[] ambPair: pickedOptions) {
			for(Ambassador amb: ambPair) {
				System.out.print(amb.getName() + " "
						+ "");
			}
			output.print("");
		}
	}
	
	
	public static void main(String[] args) {
		AmbassadorPicker ambPicker = new AmbassadorPicker();
		ambPicker.processPicking();
	}
}
