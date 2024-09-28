import java.util.Scanner;

public class prac9 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String str; 
    str = scan.nextLine();
    // System.out.println(str);
    if(str.contains(" ") == false) 
    {
      System.out.println(str.replace('A', 'Z'));
      System.out.println("size : " + str.length());
    }
    
    if(str.contains(" ") == true && str.length() > 10 ) 
    {
      System.out.println(str.toLowerCase());
    }

    if(str.contains(" ") == true) 
    {
      String[] temp = str.split(" ", 2);
      // System.out.println(temp[1]);
      System.out.println(temp[0] + " " + temp[1].replaceAll(temp[1], "CHARUSAT"));
    }
    

  }
    
}
