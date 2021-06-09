package com.vm.tranning.java.basics;

public class FirstProgram {
public static void main(String[] args) {
	int wordc=0;
	boolean fspace=false;;
	String s="How   are you  teja kedari ";
	for(int i=0;i<s.length();++i)
	{
		if(s.charAt(i)==' '&&!fspace)
		{
			fspace=true;
			wordc++;
		}
		else if(s.charAt(i)==' '&&fspace)
		{
			continue;
		}
		else
		{
			fspace=false;
		}
	}
	System.out.println(wordc);
}
}
