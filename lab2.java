
import java.util.Scanner;
public class lab2 {
//   int factorial(int);
  static int factorial(int z)
  {
    int mul = 1;
    while(z!=0)
    {
      mul *= z;
      z--;
    }
    return mul;
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.print("prime check : ");
    int x = obj.nextInt();
    int count=0;
    for(int i=1; i<=x; i++)
    {
      if(x%i==0) count++;
    }
    if(count<3) System.out.println("yes, its prime");
    else System.out.println("it is composite number :) ");
    count=0;

    System.out.print("armstrong check : ");
    int y = obj.nextInt();
    int temp = y;
    double sum=0;
    // System.out.println(count);
    while(temp != 0)
    {
      temp = temp / 10;
      count++;
      if(temp==0) break;
    }
    // System.out.println(count);
    temp = y;
    for(int i=0; i<count; i++)
    {
      sum = sum + Math.pow(temp%10, count);
      
      temp = temp / 10;
    }
    if(sum==y) System.out.println("yes, it's a armstrong number :) ");
    else System.out.println("yes, it's not a armstrong number :) ");

    System.out.print("factor of a number : ");
    int z = obj.nextInt();
    int f = factorial(z);
    System.out.println("factorial is : " + f);

    int w = obj.nextInt();
    temp = w;
    count=0;
    while(temp != 0)
    {
      temp = temp / 10;
      count++;
      if(temp==0) break;
    }
    temp = w;
    int[] arr = new int[count];
    for(int i=0; i<count; i++) 
    {
      arr[i] = temp%10;
      temp/=10;
    }
    int flag=-1;
    for(int i=0; i<count; i++)
    {
      if(arr[i]!=arr[count-1-i]) 
      {
        flag = 0;
        break;
      }
      else if(arr[i]==arr[count-1-i]) 
      {
        flag = 1;
      }
    }

    if(flag==1) System.out.println("is a palindrome");
    else if(flag==0) System.out.println("not a palindrome");

    float a , b ;
    System.out.print("enter a : ");
    a = obj.nextFloat();
    System.out.print("enter b : ");
    b = obj.nextFloat();
    char op;
    System.out.print("enter operation : ");
    op = obj.next().charAt(0);
    switch (op) {
        case '+':
            System.out.println(" = " + (a+b));
            break;
        
        case '-':
            System.out.println(" = " + (a-b));
            break;
        
        default:
            break;
    }




  } // end of main
  
} // end of lab2 class
