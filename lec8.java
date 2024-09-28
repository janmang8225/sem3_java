
import java.util.LinkedList;
import java.util.ListIterator;

public class lec8 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);

		ListIterator Li = l.listIterator();
		System.out.println("before : "+l);

		while(Li.hasNext())
		{
			int i = (int) Li.next();
			if(i % 15 == 0) Li.remove();
			System.out.println(Li.nextIndex() + "  value : " + i);
			// System.out.println(i);
		}
		System.out.println();
		System.out.println("after : "+l);
		System.out.println();
		
		while (Li.hasPrevious()) {
			int j = (int) Li.previous();
			System.out.println(j);
			System.out.println(Li.previousIndex());
		}
		



	}
}
