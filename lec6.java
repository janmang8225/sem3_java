import java.util.Scanner;

interface Exam
{
	boolean Pass(int mark);
	// {
	// 	if(mark>=50) return true;
	// 	else return false;
	// }
}

interface Classify 
{
	String Division(int average);
	// {
	// 	if(average>=60) return "First";
	// 	else if(average>=50 && average<60) return "Second";
	// 	else if(average<50) return "No Division";
	// }
}

class Result implements Exam , Classify
{
	public boolean Pass(int mark)
	{
		if(mark>=50) return true;
		else return false;
	}
	public String Division(int average)
	{
		if(average>=60) return "First";
		else if(average>=50 && average<60) return "Second";
		else if(average<50) return "No Division";

		return "";
	}
}

public class lec6 {
	public static void main(String[] args) {
		Result R = new Result();
		Scanner scan = new Scanner(System.in);
		int mark = scan.nextInt();
		int average = scan.nextInt();
		System.out.println(R.Pass(mark));
		System.out.println(R.Division(average));
		
	}
    
}
