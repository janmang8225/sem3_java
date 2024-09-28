import java.util.Scanner;
class SmallException extends Exception
{
	public SmallException(String s)
	{
		super(s);
	}

}

class BigException extends Exception
{
	public BigException(String s)
	{
		super(s);

		
	}

	
}


public class prac_part4_2 {

	public static void PrintErrorReport(Exception e)
	{
		System.out.println(e.getMessage());
	}
	public static void TestValue(int TestedNumber) throws SmallException, BigException
	{
		if(TestedNumber<5) throw new SmallException("value is lower than 5");
		else if(TestedNumber>10) throw new BigException("value is greater than 10");
		else System.out.println("value is within range :) ");
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("enter 3 values : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		try
		{ TestValue(a); }
		catch(Exception ex)
		{ System.out.println(ex); }

		try
		{ TestValue(b); }
		catch(Exception ex)
		{ System.out.println(ex); }

		try
		{ TestValue(c); }
		catch(Exception ex)
		{ System.out.println(ex); }


	}
}
