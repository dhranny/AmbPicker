import java.io.PrintStream;
public class Output {
	PrintStream printStream;
	Output(PrintStream printStream){
		this.printStream = printStream;
	}
	
	public void print(String stuffToPrint) {
		printStream.println(stuffToPrint);
	}
}
