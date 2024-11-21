package btgt.btc4.bai4;

public class StringTooLongException  extends Exception {
	protected String s;
	
	
	public StringTooLongException() {
		
	}
	public StringTooLongException(String mess) {
		super(mess);
	}
	
}
