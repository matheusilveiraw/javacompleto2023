package devices;

public class ConcretePrinter extends Device implements Printer{

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processoDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}
	
	@Override
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	} 
}
