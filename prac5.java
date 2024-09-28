import java.util.Random;
import java.util.Scanner;
public class prac5 {
  public static void main(String[] args) {
    System.out.print("Enter a string : ");
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    System.out.println(Scramble(str));

    System.out.print("Enter your guess : ");
    String userstr = scan.nextLine();
    System.out.print(isAnagram(str, userstr));
    scan.close();
  } // end of main 

  // start of function 
  static String Scramble (String str)
  {
    int n;
    Random rand = new Random();
    char[] NewCharArray = str.toCharArray();

    for(int i=0; i<NewCharArray.length; i++)
    {
       n = rand.nextInt(NewCharArray.length);
      char temp = NewCharArray[n];
      NewCharArray[n] = NewCharArray[i];
      NewCharArray[i] = temp;
    }
    
    // str = NewCharArray.toString();
    return new String(NewCharArray);
  } // end of function

  static boolean  isAnagram(String OriginalStr, String UserInput)
  {
    int[] CharCount = new int[26];
    if(OriginalStr.length()!=UserInput.length()) return false;

    for(char c : OriginalStr.toCharArray()) {  CharCount[c-'a']++;  }
    for(char c : UserInput.toCharArray())
    {
      if(CharCount[c-'a']==0) return false;
      
      CharCount[c-'a']++;
    }
    return true;
  }
} // end of class



