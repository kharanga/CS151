package work;

import java.io.*;

public class IntToHex {
	public static void main (String[]args) throws IOException{
		InputStreamReader input = null;
		BufferedReader br = null;
		try {
			input = new InputStreamReader(System.in);
			br = new BufferedReader(input);
			System.out.println("Enter an integer for conversion");
			String line = br.readLine();
			int dec = Integer.parseInt(line);
			String hex = Integer.toHexString(dec);
			System.out.println(hex);
		}
		finally {
			if(br != null)
				br.close();
			if(input != null) 
				input.close();
		}
	}
}
