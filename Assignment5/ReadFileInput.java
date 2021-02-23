package work;
import java.io.*;
public class ReadFileInput{
	public static void main (String[] args) throws IOException {
		FileReader reader = null;
		try {
			reader = new FileReader("quote.txt");
			
			int character;
			while((character = reader.read()) != -1) {
				System.out.print((char)character);
			}
		}
		finally {
			if(reader != null) {
				reader.close();
			}
		}
	}
}
