public class try2 {
  public static void main(String[] args) {
    int[][] arr = new int[3][3];
    int[][] arr2 = new int[3][3];
    int count=1;
    for(int i=0; i<3; i++)
    {
      for(int j=0; j<3; j++)
      {
        arr[i][j] = count; count++;
      }
    }
    // for(int i=0; i<3; i++)
    // {
    //   for(int j=0; j<3; j++)
    //   {
    //     System.out.println(arr[i][j]+" ");
    //   }
    // }
    for(int i=0; i<3; i++)
    {
      for(int j=0; j<3; j++)
      {
        arr2[j][2-i] = arr[i][j];
      }
    }
    for(int i=0; i<3; i++)
    {
      for(int j=0; j<3; j++)
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