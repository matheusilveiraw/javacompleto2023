package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		//mesma coisa do programa anterior mas usando o try com recursos
		//programa muito mais enxutoi

		String path = "c:\\temp\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while(line != null) { 
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (IOException e) { 
				System.out.println("Erro: " + e.getMessage());
		}
	} 
}
