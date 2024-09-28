import java.util.Scanner;
public class try2copy {
    public static void main(String[] args) {
      int n, count=1;
      Scanner scan = new Scanner(System.in);
      n = scan.nextInt();
      int[][] arr = new int[n][n];
      int[][] arr2 = new int[n][n];
      System.out.println(" ");

      
      for(int i=0; i<n; i++)
      {
        for(int j=0; j<n; j++)
        {
          arr[i][j] = count; count++;
        }
      }

      for(int i=0; i<n; i++)
      {
        for(int j=0; j<n; j++)
        {
          System.out.print(arr[i][j]+" ");
        }
        System.out.println(" ");
      }

      for(int i=0; i<n; i++)
      {
        for(int j=0; j<n; j++)
        {
          arr2[j][n-1-i] = arr[i][j];
        }
      }
      
      System.out.println(" ");
      System.out.println("New Array : ");
      System.out.println(" ");
      



      for(int i=0; i<n; i++)
      {
        for(int j=0; j<n; j++)
        {
          System.out.print(arr2[i][j]+" ");
        }
        System.out.println(" ");
      }
  
  
    }
  }
  
  /*
  1 2 3    7 4 1
  4 5 6    8 5 2
  7 8 9    9 6 3 
  i 0 j 0 - i 0 j 2
  i 0 j 1 - i 1 j 2
  i 0 j 2 - i 2 j 2
  
  i 1 j 0 - i 0 j 1
  i 1 j 1 - i 1 j 1
  i 1 j 2 - i 2 j 1
  
  i 2 j 0 - i 0 j 0
  i 2 j 1 - i 1 j 0
  i 2 j 2 - i 2 j 0 
  
  
   
  */