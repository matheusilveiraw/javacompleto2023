package app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	String[] lines = new String[] {
			"valor 1",
			"valor 2",
			"valor 3"
	};
	
	String path = "c:\\temp\\out.txt";
	
	try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
		for(String line : lines) { 
			bw.write(line);
			bw.newLine();
		}
	} catch (IOException e) { 
		e.printStackTrace();
	}
} }
