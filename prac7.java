import java.util.Scanner;
class Point
{
  private int x , y;
  public Point()
  {
    x = 10; 
    y = 20;
  }
  public Point(int x, int y)
  {
    this.x = x;
    this.y = y;

    if(this.x>100) this.x=100;
    else if(this.x<0) this.x=0;

    if(this.y>100) this.y=100;
    else if(this.y<0) this.y=0;
  }

  public void move(int x, int y)
  {
    this.x += x;
    this.y += y;

    if(this.x>100) this.x=100;
    else if(this.x<0) this.x=0;

    if(this.y>100) this.y=100;
    else if(this.y<0) this.y=0;
    
  }
  public String toString()
  {
    return "("+this.x+","+this.y+")";
  }
}

public class prac7 {
  public static void main(String[] args) {
    int xd, yd, choice;
    Scanner scan = new Scanner(System.in);
    do
    {
      System.out.println("what do you want to do : ");
      System.out.println("(1) call default constructor");
      System.out.println("(2) call parameterized constructor");
      System.out.println("(3) move");
      System.out.println("(4) Display");
      System.out.println("(5) Exit");
      choice = scan.nextInt();

      switch (choice) {
        case 1:
          Point p1 = new Point();
          System.out.println(p1);
          break;

        case 2:
          Point p2 = new Point(30, 40);
          System.out.println(p2);
          break;
      
        case 3:
          Point p3 = new Point(30, 40);
          System.out.print("enter x and y distance to move : ");
          xd = scan.nextInt();
          yd = scan.nextInt();
          p3.move(xd, yd);
          System.out.println(p3);
          break;

        case 4:
          Point p4 = new Point(30, 40);
          System.out.println(p4);
          break;

        default:
            break;
      }


    }while(choice != 5);




    

    



  }
}
