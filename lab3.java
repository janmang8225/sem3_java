import java.util.Random;
public class lab3 {
  public static void main(String[] args) 
  {
    Random rand = new Random();
    int n = rand.nextInt(20);
    int[] arr = new int[n];
    for(int i=0; i<n; i++) 
    {
      arr[i] = rand.nextInt(50);
      System.out.print(arr[i]+" ");
    }
    int largest=0;
    for(int i=1; i<n; i++)
    {
      if(arr[i]>arr[largest]) largest = i;
    }
    System.out.println("");
    System.out.println("index of largest number is : " + largest + " ( number is " + arr[largest]+")");
    arr[largest]=0;
    largest=0;
    for(int i=1; i<n; i++)
    {
      if(arr[i]>arr[largest]) largest = i;
    }
    System.out.println("index of second largest number is : " + largest+" ( number is "+arr[largest]+")");
    System.out.println("");

    n = rand.nextInt(7);
    n += 3;
    int MAX_LENGTH = rand.nextInt(40);
    if(MAX_LENGTH<=25) MAX_LENGTH+=25;
    char[] str = new char[MAX_LENGTH];
    // String s1;


    for(int i=0; i<MAX_LENGTH; i++)
    {
      int ascii = rand.nextInt(26);
      ascii += 65;
      str[i] = (char)ascii;
    }
    for(int i=0; i<n; i++)
    {
      int RandomSpace = rand.nextInt(MAX_LENGTH-3);
      RandomSpace++;
      str[RandomSpace] = ' ';
    }
    str[MAX_LENGTH-1]=' ';
    int count=0;
    largest=0;
    for(int i=0; i<MAX_LENGTH; i++)
    {
      if(str[i]!=' ') count++;
      else if(str[i]==' ') 
      {
        if(count>=largest) 
        {
          largest=count;
        }
        count=0;
      }

    }


    System.out.println("");
    System.out.println(str);
    System.out.println("lenght of longest word is : " + largest);


  }   
}

/*
write a program to find max number from array and second max number from array

find the longest string from the string array 


*/
