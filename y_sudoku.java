import java.util.Random;
public class y_sudoku {
  public static void main(String[] args) {
    int arr[] = new int[9];
    Random rand = new Random();
    for(int i=0; i<9; i++)
    {
      Reroll:
      arr[i] = rand.nextInt(9);
      arr[i]++;
      if(i>0)
      {
        for(int j=1; j<=9; j++)
        {
          int count=0;
          for(int k=0; k<=i; k++)
          {
            if(arr[k]==j) count++;
          }
          if(count>=2) { continue Reroll; }
        }
      }
    }

    for(int i=0; i<9; i++) System.out.println(arr[i]);

  }
}
