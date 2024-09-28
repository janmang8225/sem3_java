import java.util.Scanner;
// import harm.Harmonic;

interface Recyclable
{
	default void func()
	{
		System.out.println("Give proper input");
	}
}

class Fabric implements Recyclable
{
	public String toString()
	{
		return "Fabric";

	}
}

class Bottle implements Recyclable
{
	@Override
	public String toString()
	{
		return "Bottle";

	}
}

class Paper implements Recyclable
{
	public String toString()
	{
		return "Newspaper";

	}
}


public class prac_part3_2 {
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);

		

		do
		{
		System.out.println("What do you want to Recycle? : ");
		System.out.println("(1) Clothes");		
		System.out.println("(2) Bottles");		
		System.out.println("(3) Newspapers");	
		System.out.println("(4) EXIT");			
		System.out.println("choose a number : ");
		n = scan.nextInt();

		if(n==1) 
		{
			Fabric fab = new Fabric();
			System.out.println(fab);
		}
		else if(n==2) 
		{
			Bottle bot = new Bottle();
			System.out.println(bot);
		}
		else if(n==3) 
		{
			Paper pap = new Paper();
			System.out.println(pap);		
		}
		else if(n==4)
		{
			System.out.println("Thanks for coming...");
		}
		else
		{
			Fabric f = new Fabric();
			f.func();
		}
		}while(n!=4);

	
	
	
	}

}
