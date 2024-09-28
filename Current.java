abstract class Account
{
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

public class Current extends Account
{
	private int accountNo=1;
	private double balance=100;
	private double overdraftLimit=5;

	public double ReturnOverDraftLimit()
	{ return overdraftLimit; }

}

public class Savings extends Account
{
	private int accountNo=1;
	private double balance=100;
	private double interestRate=3.7;
	
	public double ReturnInterestRate()
	{ return interestRate; }

}

public class lec7 {
	public static void main(String[] args) {
		int choice;
		java.util.Scanner scan = new java.util.Scanner(System.in);

		do
		{
			System.out.println("enter choice : \t (1) Current , (2) Savings ");
			choice = scan.nextInt();
			switch (choice) {
				case 1:
					
					break;
			
				default:
					break;
			}

		}while(choice!=3);
		
		



	}
}
