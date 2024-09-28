import java.util.Random;


public class try1 {
  public static void main(String[] args) {
    Random rand = new Random();
    int n, mul=1;
    n = rand.nextInt(10);
    System.out.println(n);
    int[] arr = new int[n];
    System.out.println("Elements : ");
    for(int i=0; i<n; i++)
    {
        arr[i] = rand.nextInt(50);
        System.out.print(arr[i]+" ");
    }
    System.out.println(" ");
    for(int i=0; i<n; i++)
    {
        if(arr[i]%7==0) mul *= arr[i];
    }
    System.out.println("ans : " + mul);
  }
}

/*
    limitations:

 * homogenous
 * non scallable
 * 
 */