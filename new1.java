import java.util.Scanner;

public class new1 {
  public static void main(String[] args) {
    // System.out.println(args[0]);
    // System.out.println(args[1]);
    // System.out.println("hello");
    // System.out.println(args[0]);
    // if(args[0].equals("user")) System.out.println("it is user ");
    // else System.out.println("not a user");
    int n;
    Scanner obj = new Scanner(System.in);
    System.out.println("who are you ? : ");
    n = obj.nextInt();
    if(n==1) System.out.println("it is user ");
    else System.out.println("not a user");
  }
}
