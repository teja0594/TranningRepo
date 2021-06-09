package assignment.first.june;

import java.util.Scanner;

public class BankTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HDFC hdfcacc = new SavingAccount(10000, 3.5);
		System.out.println("Balance: "+hdfcacc.deposit(5000));
		
		System.out.println("Balance: "+hdfcacc.withdrawl(100000));
		System.out.println("Balance: "+hdfcacc.deposit(2000));
		System.out.println("Balance: "+hdfcacc.withdrawl(1001));
		System.out.println("Balance: "+hdfcacc.deposit(4000));
	
	
	}
}
