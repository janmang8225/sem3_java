import java.util.Scanner;
public class prac4 {
  public static void main(String[] args) {
    String[] Characters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    char[] Characters2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    String[] Morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    // System.err.println(Characters.length);
    // System.out.println(Morse.length);
    int choice;
    Scanner scan = new Scanner(System.in);
    do 
    {
      System.out.println("Enter 1 to convert string into morse code");
      System.out.println("enter 2 to convert morse code into string");
      System.out.println("enter 3 to exit :) ");
      System.out.print("enter choice : ");
      choice = scan.nextInt();  
      scan.nextLine();
      if(choice==1)
      {
        String str;
        System.out.print("enter string : ");
        str = scan.next();
        for(int i=0; i<str.length(); i++)
        {
          for(int j=0; j<Characters.length; j++)
          {
            if(Characters2[j]==str.charAt(i)) { System.out.print(Morse[j]+" "); }
          }
        }
        System.out.println();

      }
      else if (choice==2)
      {
        String str;
        System.out.print("enter morse code : ");
        str = scan.nextLine();
        System.out.println("taken string as : " + str);
        
        String[] NewStr = str.split(" ");
        
        for(int i=0; i<NewStr.length; i++)
        {
          for(int j=0; j<Morse.length; j++)
          {
            if(NewStr[i].equals(Morse[j])) System.out.print(Characters[j]+"");
          }
        }
        System.out.println();

      }

    } while (choice!=3);
    
  }
}
