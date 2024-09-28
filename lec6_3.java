interface Sports
{
	int sportsGameMarks = 15;
}

class Student 
{

}

class Exam extends Student
{
	int examMarks = 75;
}	

class Result extends Exam implements Sports
{
	int totalMarks = examMarks + sportsGameMarks;
	Result()
	{
		if(totalMarks>100) totalMarks=100;
		System.out.println("final marks : " + totalMarks);
	}
}

public class lec6_3 {
	public static void main(String[] args) {
		int marks;
		Result R = new Result();

	}

}
