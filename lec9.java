
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;



class Car
{
	String nameOfCar;
	String color;
	
	Car()
	{

	}
	Car(String n, String c)
	{
		nameOfCar = n;
		color = c;
	}
	

	@Override
	public String toString()
	{
		return nameOfCar + " " + color;
	}

}

public class lec9 {
	public static void main(String[] args) {
		
		// TreeMap T = new TreeMap<>();
		Vector<Car> V = new Vector<Car>();
		ArrayList<Car> A = new ArrayList<Car>();
		LinkedList<Car> L = new LinkedList<Car>();

		// Car c = new Car();
		V.add(new Car("tiago1", "blue"));
		V.add(new Car("tiago2", "orange"));
		V.add(new Car("tiago3", "blue"));
		V.add(new Car("tiago4", "purple"));
		V.add(new Car("tiago5", "lime"));

		A.add(new Car("tiago6", "green"));
		A.add(new Car("tiago7", "blue"));
		A.add(new Car("tiago8", "yellow"));
		A.add(new Car("tiago9", "blue"));
		A.add(new Car("tiago0", "white"));
		
		Enumeration e = V.elements(); 
 
		while(e.hasMoreElements())
		{
			Car o =(Car) e.nextElement();
			System.out.println(o);
			// System.out.println(e.nextElement());

		}

		
	}
}
