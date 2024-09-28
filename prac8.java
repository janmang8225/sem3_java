import java.util.Scanner;

class Fuel
{
  private float octane95=0, octane98=0, diesel=0;
  public void RefuelOctane95(float v)
  {
    octane95 += v;
  }
  public void RefuelOctane98(float v)
  {
    octane98 += v;
  }
  public void diesel(float v)
  {
    diesel += v;
  }
  public void display()
  {
    System.out.println("Total fuel used : " + (octane95+octane98+diesel));
    System.out.println("total octane95 used : " + octane95);
    System.out.println("total octane98 used : " + octane98);
    System.out.println("total diesel used : " + diesel);
  }
}

public class prac8 {
  public static void main(String[] args) {
    int choice, v;
    Fuel f = new Fuel();
    Scanner scan = new Scanner(System.in);
    do
    {
      System.out.println("what u want to do : ");
      System.out.println("(1)octane 95 ? ");
      System.out.println("(2)octane 98 ? ");
      System.out.print("(3)Diesel ? ");
      choice = scan.nextInt();
      if(choice==1)
      {
        System.out.print("enter amount of fuel : ");
        v = scan.nextInt();
        f.RefuelOctane95(v);
      }
      else if(choice==2)
      {
        System.out.print("enter amount of fuel : ");
        v = scan.nextInt();
        f.RefuelOctane98(v);
      }
      else if(choice==3)
      {
        System.out.print("enter amount of fuel : ");
        v = scan.nextInt();
        f.diesel(v);
      }
      else break;


    }while(choice<4);

    f.display();
    
  }
}
