package btgt.btc4.bai3;

public class StringTooLongException extends Exception{
protected String a;
	
	public StringTooLongException() {
		
	}
	
	public StringTooLongException(String mess) {
		super(mess);
	}
}

