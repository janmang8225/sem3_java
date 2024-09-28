import java.io.File;
import java.io.FileInputStream;
// import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class try6 {
	
	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		int i=0; 
		int choice;
		do
		{
			File f = new File("D:\\SEM 3\\java\\FileTesting\\"+"File" +Integer.toString(i)+".txt");
			try
			{
				if(f.createNewFile()) System.out.println("file created :) ");
				else System.out.println("file not created :( ");
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}



			i++;
			System.out.println();
			System.out.println("want to create more file? 1:yes / 0:no");
			choice = scan.nextInt();

		}while(choice==1);
		System.out.println();
		System.out.println("end of creating file :) ");

		
		for(int j=0; j<i; j++)
		{
			File f = new File("D:\\SEM 3\\java\\FileTesting\\"+"File" +Integer.toString(j)+".txt");
			System.out.print("file readable : ");
			if(f.canRead()) System.out.println("yes ");
			else System.out.println("no");


			System.out.print("file writable : ");
			if(f.canWrite()) System.out.println("yes ");
			else System.out.println("no");
			System.out.println();

		}

		System.out.println("end of veiwing file info :) ");


		// File f = new File("hello.txt");
		try
		{
			FileReader fr = new FileReader("readFile.txt");
			int c;
			while( (c=fr.read())!= -1 )
			{
				System.out.print((char)c);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

		System.out.println();
		System.out.println("end of reading from file :) ");

		try
		{
			FileWriter fw = new FileWriter("writeFile.txt");
			fw.write("yoooo!");
			fw.close();
			System.out.println("successfully wrote to file");
		}
		catch(IOException e)
		{
			// System.out.println(e);
			e.printStackTrace();
		}

		System.out.println("end of writing to file :) ");

		try
		{
			FileInputStream fis = new FileInputStream("city.png");
			FileOutputStream fos = new FileOutputStream("citycopy.png");

			int c;
			// while( (c = fis.read()) != -1 ) fos.write(c);

			while( (c = fis.read()) != -1 ) 
			{
				// if(c%2 == 0) fos.write(c);
				// else fos.write((byte)0xff);
				if(c<=0x255 && c>=0x0) fos.write(0);
			}

			fos.flush();
			fos.close();
			fis.close();
			System.out.println("file copied successfully :) ");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("end of copying image using File Input/Output stream :) ");


		
	}
}
