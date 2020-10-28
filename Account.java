package p1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account 
{
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance=0.0;
	private double savingBalance=0;
	
	//Set the customer number
	
	public int setCustomerNumber(int customerNumber)
	{
		this.customerNumber = customerNumber;
		return customerNumber;		
	}
	public int getCustomerNumber()
	{
		return customerNumber;
	}
	
	//Set the pin number
	
	public int setPinNumber(int pinNumber)
	{
		this.pinNumber=pinNumber;
		return pinNumber;
	}
	
	//Get the pin Number
	public int getPinNumber()
	{
		return pinNumber;	
	}
	
	//Get checking account balance

	public double getCheckingBalance()
	{
		return checkingBalance;
	}
	//Get saving account balance

		public double getSavingBalance()
		{
			return savingBalance;
		}
	
	//calculate checking account withdrawal
	
	public double calcCheckingWithdrawal(double amount)
	{
		return checkingBalance=(checkingBalance-amount);
	}
	
//	calculate saving account withdrawal
	
	public double calcSavingWithdrawal(double amount)
	{
		return savingBalance=savingBalance-amount;	
	}
	
//	calculate checking Account Withdrawal
	
	public double calcCheckingDeposit(double amount)
	{
		return checkingBalance=checkingBalance+amount;
	}
	
//	calculate saving Account Withdrawal
	
	public double calcSavingDeposit(double amount)
	{
		 savingBalance=savingBalance+amount;
		 return savingBalance;
	}

	
//	Customer checking account withdrawal input
	
	public void getCheckingWithdrawInput()
	{
		System.out.println("Checking account balance: "+moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraww from checking account");
		double amount = input.nextDouble();
		if((checkingBalance-amount)>=0) 
		{
			calcCheckingWithdrawal(amount);
			System.out.println("New checking Account Balance: "+moneyFormat.format(checkingBalance));
		} 
		else 
		{
			System.out.println("Balance insufficient");
		}
	}
	
	
//	Customer saving account withdrawal input
	
	public void getSavingWithdrawInput()
	{
		System.out.println("Checking  savings account balance: "+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraww from saving account");
		double amount = input.nextDouble();
		if((savingBalance-amount)>=0) 
		{
			calcSavingWithdrawal(amount);
			System.out.println("New saving Account Balance: "+moneyFormat.format(savingBalance));
		} 
		else 
		{
			System.out.println("Balance insufficient");
		}
	}
	
//	Customer checking account deposit input
	
	public void getCheckingDepositInput()
	{
		System.out.println("Checking account balance: "+moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to deposit to checking account");
		double amount = input.nextDouble();
		if((checkingBalance+amount)>=0) 
		{
			calcCheckingDeposit(amount);
			System.out.println("New checking Account Balance: "+moneyFormat.format(checkingBalance));
		} 
		else 
		{
			System.out.println("Balance insufficient");
		}
		
	}
	
//	Customer saving account deposit input
	
	public void getSavingDepositInput()
	{
		System.out.println("Checking  savings account balance: "+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to deposit to saving account");
		double amount = input.nextDouble();
		if((savingBalance+amount)>=0) 
		{
			calcSavingDeposit(amount);
			System.out.println("New saving Account Balance: "+moneyFormat.format(savingBalance));
		} 
		else 
		{
			System.out.println("Balance insufficient");
		}
	}	
}
