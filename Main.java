import java.util.Random;

class Main {
    public static void main(String[] args) {
      System.out.println("Hello World ");
      // System.out.println(args[0]);
      // System.out.print(args[1]);
      // int x,y, sum;
      // Scanner obj1 = new Scanner (System.in);
      // System.out.println("enter a number : ");
      // x = obj1.nextInt();
      Random rand = new Random();
      // x = rand.nextInt(10);
      // y = rand.nextInt(10);
      // Scanner obj1 = new Scanner (System.in);
      // System.out.println("enter another number : ");
      // y = obj1.nextInt();

      // sum = x + y;
      // System.out.println("sum is " + sum);
      int n;
      float [] arr;
      n = rand.nextInt(10);
      arr = new float[n];
      for (int i = 0; i < n; i++) 
      {
        arr[i] = rand.nextInt();
        System.out.println(arr[i]);
      }
      

      
    }
  }
