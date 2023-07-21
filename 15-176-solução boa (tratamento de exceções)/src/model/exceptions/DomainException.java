package model.exceptions;

public class DomainException extends Exception { 
	//poderia ser Runtimeexception, o que não me força a tratar no código fonte, diferente do extend exception

	private static final long serialVersionUID = 1L;
	
	public DomainException (String msg) {
		super(msg);
	}
}
