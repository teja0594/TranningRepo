package assignment.first.june;

public class Word_Char_Count {
public static void main(String[] args) {
	int c=0;
	String s="Hello welcome to india ";
	String[] str = s.split(" ");
	System.out.println("Words->"+str.length);
	for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)!=' ')
		c++;
}
System.out.println("Characters->"+c);
}
}
