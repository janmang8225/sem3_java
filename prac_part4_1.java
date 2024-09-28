import java.util.Scanner;
public class prac_part4_1 {
	public static void main(String[] args) {
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("enter 2 numbers : ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println();
			System.out.println("sum of two numbers : " + (a+b));
		}
		catch(Exception ex)
		{
			System.out.println("not an integer :( ");
		}
		
		
	}
	
}
