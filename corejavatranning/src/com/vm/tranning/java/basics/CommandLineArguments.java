package com.vm.tranning.java.basics;

class Super
{
	public int index = 10;
}
class App extends Super
{
	 App ()
	{
		System.out.println(1);
	}
	void App ()
	{
		System.out.println(2);
	}
}
public class CommandLineArguments {
	public static void main(String[] args) {
		App a = new App();
		System.out.println(a.index);
	}

	

}
