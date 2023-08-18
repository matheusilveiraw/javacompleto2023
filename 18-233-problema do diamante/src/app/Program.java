package app;

import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {


		ConcretePrinter p = new ConcretePrinter("1080");
		p.processoDoc("My letter");
		p.print("My letter");
		
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processoDoc("My email");
		System.out.println("Scan result: " + s.scan());
		
	}
}
