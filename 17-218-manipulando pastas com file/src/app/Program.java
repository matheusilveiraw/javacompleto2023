package app;

import java.util.Scanner;
import java.io.File;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		
		File path = new File(strPath);
		
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS: ");
		
		for (File folder : folders) { 
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for(File file : files) { 
			System.out.println(file);
		}
		
		boolean sucesso = new File(strPath + "\\subdir").mkdir(); //criou uma pasta cyhamada subdir em C:\temp

		
		sc.close();
		
	}

}
