import harm.Harmonic;
import java.util.Scanner;
public class prac_part3_4 {
	public static void main(String[] args) {
		Harmonic h = new Harmonic();
		Scanner scan = new Scanner(System.in);
		System.out.print("enter number : ");
		int n = scan.nextInt();
		// h.harmonium(n);
		System.out.print("harmonic value : ");
		System.out.println(h.harmonium(n));
		System.out.println("original value : " + (1.0/n));

		scan.close();
	}
}
