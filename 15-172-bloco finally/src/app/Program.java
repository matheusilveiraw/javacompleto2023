package app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				//pra fazer o programa dar certo tem que criar um arquivo de texto lá no c: temp e digitar alguma coisa no ar
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			//executa o finally independnete do que acontecer nas exceções
			if (sc != null) {
				sc.close();
			}
		}
	}
}