package assignment.first.june;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WWEWrestler {
public static void main(String[] args) {
	List<WWE> wrestlers = new ArrayList<WWE>();
	wrestlers.add(new WWE("John","Cena", 300));
	wrestlers.add(new WWE("Andre", "The Giant", 265));
	wrestlers.add(new WWE("Paul", "Bunyan", 173));
	wrestlers.add(new WWE("Lars", "Sullivan", 142));
	wrestlers.add(new WWE("Killian", "Dain", 305));
	long count = wrestlers.stream().count();
	System.out.println("No of wrestlers :"+count);
	long  wsum = wrestlers.stream().filter(p->p.getWeight()>200).map(p->p.getWeight()).reduce(0,(A,B)->A+B);
	 System.out.println("sum of wrestlers weight > 200 : "+wsum);
	 System.out.println("FirstName of all wrestlers are: ");
	 printFirstName(wrestlers).forEach(p->System.out.println(p));
	 System.out.println("wrestlers sorted by firstname :");
	 sortbyFirstName(wrestlers).forEach(p->System.out.println(p));
 
}
private static List<String> printFirstName(List <WWE> list)
{
	 return list.stream().map(p->p.getFirstName()).collect(Collectors.toList());
	
}
private static List<WWE> sortbyFirstName(List <WWE> list)
{
	 return list.stream().sorted(Comparator.comparing(WWE::getFirstName)).collect(Collectors.toList());
	
}
}
