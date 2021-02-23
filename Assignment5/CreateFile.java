package work;
import java.io.*;
public class CreateFile {
	public static void main(String[] args) throws IOException {
		File myNewFile = null;
		FileWriter myFileWriter = null;
		InputStreamReader myStandardIn = null;
		BufferedReader br = null;
		try {
			myNewFile = new File("command_line_input.txt");
			myFileWriter = new FileWriter(myNewFile);
			myStandardIn = new InputStreamReader(System.in);
			br = new BufferedReader(myStandardIn);
			System.out.println("Enter '@q' to quit");
			String input;
			do {
				input = br.readLine();
				myFileWriter.write(input);
			}
			while(!(input.equals("@q")));	
		}
		finally {
			if(br != null) 
				br.close();
			if(myStandardIn != null)
				myStandardIn.close();
			if(myFileWriter != null) {
				myFileWriter.flush();
				myFileWriter.close();
			}
		}
	}
}
