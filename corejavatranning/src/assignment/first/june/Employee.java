package assignment.first.june;

public class Employee {

	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void validation() throws Exception
	{
		if(this.firstName != null && this.lastName!=null)
		{
			if(this.firstName.length()<3&& this.lastName.length()<3)
				throw new MinimumCharacterException("name should be minimum 3 character");
			else
				System.out.println(toString());
			
		}
		else
		{
			throw new NullPointerException("Entry Missing");
		}
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
