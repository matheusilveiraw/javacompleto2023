package app;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		//no arquivo tá produto, preço, quantidade,tem que fazer um novo arquivo com produto + preço total
		Scanner sc = null;
		Locale.setDefault(Locale.US);
		
		File file = new File("c:\\temp\\exerproposot\\entrada.txt");	
		FileWriter escritor = new FileWriter("c:\\\\temp\\\\exerproposot\\\\saida.txt");
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				String linhas[] = linha.split(",");
				Integer.parseInt(linhas[1]);
				String produto = linhas[0];
				
				System.out.println("Produto: " + produto);
				String valorProv = linhas[1] + "." + linhas[2];
				double valor = Double.parseDouble(valorProv); //da um erro se tentar fazer tudo em uma linha, deixar assim
				int quantidade = Integer.parseInt(linhas[3]);
				System.out.println("Total: " + (valor * quantidade));
								
				escritor.write("Produto: " + produto + "." + " Total: R$" + valor * quantidade);
				escritor.close();
							}
		} catch(IOException e) { 
			System.out.println("Error: " + e.getMessage());
		} finally {
			if(sc != null) { 
				sc.close();	
			}
		}
		
//		
//		System.out.println("Digite os produtos: ");
//		for(int i = 0; i < 4; i++) { 
//			System.out.println("Produto #" + (i + 1) + ":");
//			String produto = sc.nextLine();
//			System.out.println(produto);
//		} 
		sc.close();
	}
}