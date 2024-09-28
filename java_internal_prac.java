
import java.util.Scanner;

// ******************************************
// *** STUDENT COURSE REGISTRATION SYSTEM ***
// ******************************************

interface CourseRegistration
{
	void registerCourse();
	void dropCourse();
}


class Person implements CourseRegistration
{
	String name;
	String email;
	String phoneNumber;

	Person(String name, String email, String phoneNumber)
	{
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void registerCourse()
	{

		java.util.Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("select : ");
		System.out.print("(1) under graduate student? / (2) graduate student? : ");
		int choice2 = scan.nextInt();

		if(choice2 == 1)
		{

			System.out.println("select a course : ");
			System.out.print("(1) java / (2) cpp / (3) sql : ");
			int choice = scan.nextInt();

			switch (choice) {
				case 1:
					System.out.println();
					Student s1 = new Student();
					s1.registerJava();
					break;
			
				case 2:
					System.out.println();
					Student s2 = new Student();
					s2.registerCPP();
					break;

				case 3:
					System.out.println();
					Student s3 = new Student();
					s3.registerSQL();
					break;

				default:
					break;
			} // end of switch


		}

		else if(choice2 == 2)
		{

			System.out.println("select a course : ");
			System.out.print("(1) ResearchCourse1 / (2) ResearchCourse2 / (3) ResearchCourse3 : ");
			int choice = scan.nextInt();

			switch (choice) {
				case 1:
					System.out.println();
					Student s4 = new Student();
					s4.registerResearchCourse1();
					break;
			
				case 2:
					System.out.println();
					Student s5 = new Student();
					s5.registerResearchCourse2();
					break;

				case 3:
					System.out.println();
					Student s6 = new Student();
					s6.registerResearchCourse3();
					break;

				default:
					break;

			} // end of switch

		}

	}

	@Override
	public void dropCourse()
	{

		java.util.Scanner scan = new Scanner(System.in);

		System.out.println();
		System.out.println("select : ");
		System.out.print("(1) under graduate student? / (2) graduate student? : ");
		int choice2 = scan.nextInt();

		if(choice2 == 1)
		{

			System.out.println("select a course : ");
			System.out.print("(1) java / (2) cpp / (3) sql : ");
			int choice = scan.nextInt();

			switch (choice) {
				case 1:
					System.out.println();
					Student s1 = new Student();
					s1.dropJava();
					break;
			
				case 2:
					System.out.println();
					Student s2 = new Student();
					s2.dropCPP();
					break;

				case 3:
					System.out.println();
					Student s3 = new Student();
					s3.dropSQL();
					break;

				default:
					break;

			} // end of switch

		}

		else if(choice2 == 2)
		{

			System.out.println("select a course : ");
			System.out.print("(1) ResearchCourse1 / (2) ResearchCourse2 / (3) ResearchCourse3 : ");
			int choice = scan.nextInt();

			switch (choice) {
				case 1:
					System.out.println();
					Student s4 = new Student();
					s4.dropResearchCourse1();
					break;
			
				case 2:
					System.out.println();
					Student s5 = new Student();
					s5.dropResearchCourse2();
					break;

				case 3:
					System.out.println();
					Student s6 = new Student();
					s6.dropResearchCourse3();
					break;

				default:
					break;

			} // end of switch



		}
	}

	class Student
	{
		String courseReistered;

		void registerJava()
		{
			courseReistered = "Java";
			System.out.println(courseReistered);
		}

		void registerCPP()
		{
			courseReistered = "CPP";
			System.out.println(courseReistered);
		}

		void registerSQL()
		{
			courseReistered = "SQL";
			System.out.println(courseReistered);
		}

		void registerResearchCourse1()
		{
			courseReistered = "ResearchCourse1";
			System.out.println(courseReistered);
		}

		void registerResearchCourse2()
		{
			courseReistered = "ResearchCourse2";
			System.out.println(courseReistered);
		}

		void registerResearchCourse3()
		{
			courseReistered = "ResearchCourse3";
			System.out.println(courseReistered);
		}

		void dropJava()
		{
			courseReistered="";
		}

		void dropCPP()
		{
			courseReistered="";
		}

		void dropSQL()
		{
			courseReistered="";
		}

		void dropResearchCourse1()
		{
			courseReistered="";
		}

		void dropResearchCourse2()
		{
			courseReistered="";
		}

		void dropResearchCourse3()
		{
			courseReistered="";
		}
		


	} // end of subclass student

	

} // end of class Person




public class java_internal_prac {
	public static void main(String[] args) {
		// java.util.Vector vUnderGradStudent = new Vector<>();
		// java.util.Vector vGradStudent = new Vector<>();
		
		java.util.Scanner scan = new Scanner(System.in);
		
	
		System.out.print("enter student ID : ");
		String STUDENT_ID = scan.next();
		System.out.print("enter name : ");
		String NAME = scan.next();
		System.out.print("enter email : ");
		String EMAIL = scan.next();
		System.out.print("enter contact number : ");
		String PHONE_NUMBER = scan.next();
		
		Person P = new Person(NAME, EMAIL, PHONE_NUMBER);
		P.registerCourse();
		P.dropCourse();
		


	} // end of main


} // end of Public class java_internal_prac


	// *** format *** 
	// header rollno , name
	// heading
	// code 
	// output screenshot