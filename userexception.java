
import java.util.*;
import java.lang.*;
class insuffbal extends Exception{
	insuffbal(String st){
			super(st);
			}
}
class Account{
	int Accountno;

	static Double  balance;
	static int amt;
	public Account(Double initbalance){
	if( initbalance>0 && initbalance<500)
		{
		System.out.println("The account could not be created");
		}
		else{
			balance= initbalance;
		}
				}	
	public void credit(Double amt)
		{
			balance= balance+amt;
		}
	public static void debit(Double amt) throws insuffbal
		{
		if(balance-amt<500)
		{
			throw new insuffbal("insufficient balance");
		}
		else{
			balance= balance-amt;
		}
		}
			public Double display()
				{
				return balance;
				}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		Double initbalance, amt, balance;
		int choice;
			System.out.println("Enter the initial balance");
		initbalance= sc.nextDouble();
			System.out.println("Enter the amount to be credited/debited");
		amt= sc.nextDouble();
			System.out.println("Enter the choice");
		choice=sc.nextInt();
		Account acc= new Account(initbalance);
		switch(choice)
		{
			case 1:acc.credit(amt);break;
			case 2:
			try{
				acc.debit(amt);
				break;
			}
			catch(insuffbal p)
			{
				System.out.println("Caught the exception");
            System.out.println(p.getMessage());
		}
}
			System.out.printf("the existing balance is "+acc.display());
	}
};