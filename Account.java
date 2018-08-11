import java.util.Scanner;

class Account
{
	double bal;
	 Account(double balance)
	{
		bal=balance;
		if(bal>=500)
		{
			System.out.println("Your account is active");
		}
		else
		{
			System.out.println("Your balance is under minimum balance");
		}
	}
	void credit(double amount)
	{
		bal=bal+amount;
	}
	void debit(double amount)
	{
		if(bal-amount<500)
		{
			System.out.println("Your balance is lower than minimum balance \n You can only withdraw "+(bal-500));
            
		}
		else
		{
			bal=bal-amount;
			System.out.println("your transaction is successfull");
		}
	}
	double getBalance()
	{
		return bal;
	}
public static void  main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Balance");
    double bal=sc.nextDouble();
    Account a=new Account(bal);
    if(bal>=500)
    {
	System.out.println("Enter your choice"+" \n"+" press 1 for credit amount or press 2 for debit amount");
	int choice=sc.nextInt();
switch(choice){

	case 1:
	{
		System.out.println("Enter amount to be credited");
		double amount1=sc.nextDouble();
		a.credit(amount1);
		break;
	}
	case 2:
	{
		System.out.println("Enter amount to be debited");
		double amount2=sc.nextDouble();
		a.debit(amount2);
break;
	}
	default:
	{
		System.out.println("ooohoo your choice is not familiar");
	}
}
	
double p=a.getBalance();
System.out.println("Your current balance is "+p);
}
else
System.out.println("Please come again with some more money");
}
};

