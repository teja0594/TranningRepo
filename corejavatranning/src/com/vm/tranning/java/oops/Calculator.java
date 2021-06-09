package com.vm.tranning.java.oops;

public class Calculator {

	private int num1;
	private int num2;
	private int sum=0;
	public Calculator(int a,int b)
	{
		this.num1=a;
		this.num2=b;
	}
	int add()
	{
		sum=num1+num2;
		myltiply();
		return sum;
	}
	private void myltiply()
	{
		System.out.println(num1*num2);
		if(quotient<=0||denominator<=0 ||numerator<=0)
		{
			System.out.println("Invalid");
		}
		else
		{
			if(numerator<denominator)
			{
				System.out.println("Invalid");
			}
			else
			{
				System.out.println((quotient*denominator)+numerator);
				System.out.println(denominator);
			}
			}
				
			}
		}
		
}