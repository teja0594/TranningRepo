package assignment.first.june;

public class MinimumCharacterException extends Exception {
	  
	private static final long serialVersionUID = 1L;
	String message;
	MinimumCharacterException(String message)
	{
		this.message=message;
	}
	
	public String toString() { 
		return message;
	}
}