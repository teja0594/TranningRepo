package assignment.first.june;

public class TestEmployee {
public static void main(String[] args) throws Exception {
	Employee e = new Employee(null, null);//null case
	e.validation();
	Employee e1 = new Employee("ab", "de");//less than minimum 3 char
	e1.validation();
	Employee e2= new Employee("Teja", "Kedari"); //satisfy case 
	e2.validation(); 
	
}
}
