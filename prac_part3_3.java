import java.util.Scanner;

class Bottle
{
	double volume;
	public double ReturnVolume()
	{
		return volume;
	}

}

interface Recyclable
{	

}

class SodaBottle extends Bottle implements Recyclable
{	
	String name;
	@Override
	public String toString() {
		return "name : "+name+" , volume : "+ volume + " litres";
	}
	String Recycle()
	{
		return "Bottle returned for recycling";
	}
}



public class prac_part3_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SodaBottle sb = new SodaBottle();

		System.out.print("Type in the name of the soda: ");
		sb.name = scan.next();
		System.out.print("Type in the volume of the soda: ");
		sb.volume = scan.nextDouble();
		System.out.println(sb);
		System.out.println(sb.Recycle());

		
	}
}
