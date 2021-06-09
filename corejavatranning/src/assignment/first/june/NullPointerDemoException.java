package assignment.first.june;

public class NullPointerDemoException extends Exception {
	  
	private static final long serialVersionUID = 1L;
	String message;
	NullPointerDemoException(String message)
	{
		this.message=message;
	}
	
	public String toString() { 
		return message;
	}
}