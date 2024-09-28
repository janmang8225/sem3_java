abstract class Account
{
  int accountNo=1;
  double balance=100;
  public double overdraftLimit=5;
  public double interestRate=3.7;


  abstract double ReturnOverDraftLimit();
  abstract double ReturnInterestRate();
}



// public class Account
// {
// 	private int accountNo=1;
// 	private double balance=100;


// 	public int ReturnAccountNo()
// 	{ return accountNo; }

// 	public double  ReturnBalance()
// 	{ return balance; }

// }

class Current extends Account
{

	// @Override 
	public double ReturnOverDraftLimit()
	{ return overdraftLimit; }

	public double ReturnInterestRate()
	{ return interestRate; }

	public void Deposit(double d)
	{
		balance += d;
	}

	public void withdraw(double d)
	{
		balance -= d;
	}

	public void CheckBalance()
	{
		System.out.println("balance : " + balance);
	}


}

class Savings extends Account
{
	
	// @Override 
	public double ReturnInterestRate()
	{ return interestRate; }

	public double ReturnOverDraftLimit()
	{ return overdraftLimit; }

	public void Deposit(double d)
	{
		balance += d;
	}

	public void withdraw(double d)
	{
		balance -= d;
	}

	public void CheckBalance()
	{
		System.out.println("balance : " + balance);
	}
	

}

public class lec7 {
	public static void main(String[] args) {
		int choice;
		java.util.Scanner scan = new java.util.Scanner(System.in);

		do
		{
			System.out.println("enter choice : \t (1) Current , (2) Savings , (3) exit ");
			choice = scan.nextInt();
			switch (choice) {
				case 1:
					Current c = new Current();
					int choice2;
					do 
					{
						System.out.println("enter choice : \t (1) Deposit , (2) withdraw , (3) check balance , (4) exit");
						choice2 = scan.nextInt();
						switch (choice2) 
						{
							case 1:
								double d;
								System.out.print("enter amount to deposit : ");
								d = scan.nextDouble();
								c.Deposit(d);
								break;

							case 2:
								double d2;
								System.out.print("enter amount to deposit : ");
								d2 = scan.nextDouble();
								c.withdraw(d2);
								break;

							case 3:
								c.CheckBalance();
								break;
						
							default:
								break;
						}

					} while (choice2 != 4);
					break;
			
				case 2:
				Savings s = new Savings();
				int choice3;
				do 
				{
					System.out.println("enter choice : \t (1) Deposit , (2) withdraw , (3) check balance , (4) exit");
					choice3 = scan.nextInt();
					switch (choice3) 
					{
						case 1:
							double d;
							System.out.print("enter amount to deposit : ");
							d = scan.nextDouble();
							s.Deposit(d);
							break;

						case 2:
							double d2;
							System.out.print("enter amount to deposit : ");
							d2 = scan.nextDouble();
							s.withdraw(d2);
							break;

						case 3:
							s.CheckBalance();
							break;
					
						default:
							break;
					}

				} while (choice3 != 4);
				break;



				default:
					break;
			}

		}while(choice!=3);
		
		



	}
}
