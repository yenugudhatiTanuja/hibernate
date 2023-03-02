package corejavaproject;

import java.text.DecimalFormat;
import java.util.Scanner;

class MyException extends Exception
{
     public MyException(String Message)
    {
     	super(Message);
    }
}
public class Account {
	private int customerNumber;
	private int pinNumber;
	private double currentBalance = 500;
	private double savingBalance = 500;
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("###,##0.00");

	public int setCustomerNumber(int customerNumber) 
	{
		this.customerNumber = customerNumber;
		return customerNumber;
	}

	public int getCustomerNumber() 
	{
		return customerNumber;
	}

	public int setPinNumber(int pinNumber) 
	{
		this.pinNumber = pinNumber;
		return pinNumber;
	}

	public int getPinNumber() 
	{
		return pinNumber;
	}

	public double getCurrentBalance()
	{
		return currentBalance;
	}

	public double getSavingBalance() 
	{
		return savingBalance;
	}
	public double calCurrentWithdraw(double amount)
	{
		currentBalance=(currentBalance-amount);
		return currentBalance;
	}
	public double calSavingWithdraw(double amount)
	{
		savingBalance=(savingBalance-amount);
		return savingBalance;
	}
	public double calCurrentDeposit(double amount)
	{
		currentBalance=(currentBalance+amount);
		return currentBalance;
	}
	public double calSavingDeposit(double amount)
	{
		savingBalance=(savingBalance+amount);
		return savingBalance;
	}
	public void getCurrentWithdrawInput() throws MyException
	{
		System.out.println("Please Maintain Minimum Balance of 500 Rupees");
		System.out.println("current account balance :"+moneyFormat.format(currentBalance));
		System.out.println("Amount you to withdraw from current account");
		double amount=input.nextDouble();
		if(((currentBalance-amount)<500)&&((currentBalance-amount)>0))
		{
			throw new MyException("Maintain minimun balance");

		}
		else if((currentBalance-amount)<0)
		{
			System.out.println("Insuffieicient Funds");
		}
		else
		{
			calCurrentWithdraw(amount);
			System.out.println("****Please Collect Your Cash****");
		}
	}
	public void getSavingWithdrawInput() throws MyException
	{
		System.out.println("Please Maintain Minimum Balance of 500 Rupees");
		System.out.println("saving account balance :"+moneyFormat.format(savingBalance));
		System.out.println("Amount you to withdraw from saving account");
		double amount=input.nextDouble();
		if(((savingBalance-amount)<500)&&((savingBalance-amount)>0))
		{
			throw new MyException("Maintain minimun balance");
		}
		else if((savingBalance-amount)<0)
		{
			System.out.println("Insufficient Funds");
		}
		else
		{
				calSavingWithdraw(amount);
                System.out.println("****Please Collect Your Cash****");
		}
	}
	public void getCurrentDepositInput()
	{
		System.out.println("current account balance :"+moneyFormat.format(currentBalance));
		System.out.println("Amount you to Deposit to current account");
		double amount=input.nextDouble();
		if((amount)>0)
		{
			calCurrentDeposit(amount);
            System.out.println("****Your Amount  "+amount+ "  Deposited Sucessfully****");

		}
		else
		{
			System.out.println("Balance Cannot be Negative:"+"\n");
		}
	}
	public void getSavingDepositInput()
	{
		System.out.println("saving account balance :"+moneyFormat.format(savingBalance));
		System.out.println("Amount you to Deposit to saving account");
		double amount=input.nextDouble();
		if((amount)>0)
		{
			calSavingDeposit(amount);
            System.out.println("****Your Amount  "+amount+ "  Deposited Sucessfully****");

		}
		else
		{
			System.out.println("Balance Cannot be Negative"+"\n");
		}
	}

}
