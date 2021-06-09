package assignment.first.june;

public class SavingAccount implements HDFC {
	private int balance;
	private double rateOfIntrest;
	public SavingAccount(int balance, double rateOfIntrest) {
		super();
		this.balance = balance;
		this.rateOfIntrest = rateOfIntrest;
	}
	public int getBalance() {
		return balance;
	} 
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getRateOfIntrest() {
		return rateOfIntrest;
	}
	public void setRateOfIntrest(double rateOfIntrest) {
		this.rateOfIntrest = rateOfIntrest;
	}
	
	public int withdrawl(int amount)
	{
		if(amount>balance)
		{
			System.out.println("Cant Withdraw you have low  balance: ");
		}
		else
		{
			balance=balance-amount;
		}
		return balance;
	}
	public int deposit(int amount)
	{
			balance=balance+amount;
			return balance;
	}
	

}
