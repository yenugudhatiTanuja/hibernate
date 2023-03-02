package corejavaproject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Menu extends Account {
	Scanner menuinput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("###,##0.00");
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

	public void getLogin() throws IOException, MyException {
		int x = 1;
		do {
			try {
				data.put(123456, 987654);
				data.put(741852, 369258);
				System.out.println("Welcome to ATM ");
				System.out.println("Enter customer number ");
				setCustomerNumber(menuinput.nextInt());
				System.out.println("Enter your pin");
				setPinNumber(menuinput.nextInt());
			} catch (Exception e) {
				System.out.println("Invalid character only number");
				x = 2;
			}
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			if (data.containsKey(cn) && data.get(cn) == pn) {
				getAccountType();
			} else {
				System.out.println("wrong customer number Or  pin number");
			}
		} while (x == 1);
	}

	public void getAccountType() throws MyException {
		System.out.println("select which Account youy want to Access:");
		System.out.println("1.current Account");
		System.out.println("2.saving Account");
		System.out.println("3.Exit");
		int selection=menuinput.nextInt();
		switch(selection)
		{
		case 1:
			getCurrent();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("thankyou for using ATM,bye.\n");
			break;
		default:
			System.out.println("\n"+"Invalid Choice"+"\n");
			break;
			
		}
	}

	private void getSaving() throws MyException {
		// TODO Auto-generated method stub
		System.out.println("Saving Account");
		System.out.println("1.View Balance");
		System.out.println("2.withdraw funds");
		System.out.println("3.Deposit funds");
		System.out.println("4.Exit");
        System.out.println("choice:::");
        int selection=menuinput.nextInt();
        switch(selection)
        {
        case 1:
        	System.out.println("checking Account Balance:"+moneyFormat.format(getSavingBalance()));
        	getAccountType();
        	break;
        case 2:
        	getSavingWithdrawInput();
        	getAccountType();
        	break;
        case 3:
        	getSavingDepositInput();
        	getAccountType();
        	break;
        case 4:
        	System.out.println("Thankyou for using this ATM, bye.");
        	break;
        default:
        	System.out.println("\n"+"Invalid choice."+"\n");
        	getSaving();
        }
		
	}

	private void getCurrent() throws MyException {
		// TODO Auto-generated method stub
		System.out.println("current Account:");
		System.out.println("1.ViewBalance");
		System.out.println("2.Withdraw funds");
		System.out.println("3.Deposit funds");
		System.out.println("4.Exit");
        System.out.println("choice:::");
        int selection=menuinput.nextInt();
        switch(selection)
        {
        case 1:
        	System.out.println("current Account Balance:"+moneyFormat.format(getCurrentBalance()));
        	getAccountType();
        	break;
        case 2:
        	getCurrentWithdrawInput();
        	getAccountType();
        	break;
        case 3:
        	getCurrentDepositInput();
        	getAccountType();
        	break;
        case 4:
        	System.out.println("Thankyou for using this ATM, bye.");
        	break;
        default:
        	System.out.println("\n"+"Invalid choice."+"\n");
        	getCurrent();
        }

		
	}
}
