package p1;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account
{
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	HashMap<Integer, Integer> data = new HashMap<>();
	int selection;
	
//validate login information,customer number and pincode
	public void getLogin()
	{
		int x=1;
		do {
			try 
			{
				data.put(1111, 222);
				data.put(8454055, 548210);
				System.out.println("Welcome to ATM project");
				System.out.println("Enter the CustomerNumber");
				setCustomerNumber(menuInput.nextInt());
				System.out.println("Enter your pin Number");
				setPinNumber(menuInput.nextInt());
			} catch (Exception e) 
			{
				System.out.println("\n"+"Invalid character(s).only numbers"+"\n");
				x=2;
			}
			for(Entry<Integer, Integer> entry :data.entrySet())
			{
				if (entry.getKey()==getCustomerNumber()&& entry.getValue()==getPinNumber()) 
				{
					getAccountType();
				}
				else 
				{
					System.out.println("Wrong customer Number or Pin number "+"\n");
				}
			}
		} while (x==1);
	}
	
//	display Account type menu with  
	public void getAccountType()
	{
		System.out.println("Select the account you want to access");
		System.out.println(" Type 1- Checking account ");
		System.out.println(" Type 2- Savings account ");
		System.out.println(" Type 3- Exit ");
		System.out.println("Choice");
		
		selection=menuInput.nextInt();
		
		switch (selection) {
		case 1:
			getChecking();	
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank you for using this atm"+"\n");
			break;
		default:
			System.out.println("Invalid choice...try again"+"\n");	
		}
	}
		
//	Display checking account value with selection
		public void getChecking()
		{
			System.out.println("Checking account");
			System.out.println("Type 1- View Balance");
			System.out.println("Type 2- Withdraw Amount");
			System.out.println("Type 3- Deposit Amount");
			System.out.println("Type 4- Exit");
			System.out.println("Choice");

			selection=menuInput.nextInt();
			
			switch (selection)
			{
			case 1:
				System.out.println("Checking Account Balance:"+moneyFormat.format(getCheckingBalance())+"\n");
				getChecking();
				break;
			case 2:
				getCheckingWithdrawInput();
				getChecking();
				break;
			case 3:
				getCheckingDepositInput();
				getChecking();
				break;
			case 4:
				System.out.println("Thank you for using this ATM,bye"+"\n");
				getAccountType();
				break;

			default:
				System.out.println("Invalid choice...try again"+"\n");
				getChecking();
			}
		}
//		Display checking account value with selection
			public void getSaving()
			{
				System.out.println("Checking account");
				System.out.println("Type 1- View Balance");
				System.out.println("Type 2- Withdraw Amount");
				System.out.println("Type 3- Deposit Amount");
				System.out.println("Type 4- Exit");
				System.out.println("Choice");

				selection=menuInput.nextInt();
				
				switch (selection)
				{
				case 1:
					System.out.println("Saving Account Balance: "+moneyFormat.format(getSavingBalance())+"\n");
					getSaving();
					break;
				case 2:
					getSavingWithdrawInput();
					getSaving();
					break;
				case 3:
					getSavingDepositInput();
					getSaving();
					break;
				case 4:
					System.out.println("Thank you for using this ATM,bye"+"\n");
					getAccountType();
					break;

				default:
					System.out.println("Invalid choice...try again"+"\n");
					getSaving();
				}
			}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
