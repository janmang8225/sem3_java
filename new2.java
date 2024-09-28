import java.util.Scanner;
class a
{   
    a()
    {
        System.out.println("constructor of a");
    }
    
}

class b extends a
{
    b()
    {
        System.out.println("constructor of b");
    }
}

class c extends b
{
    c()
    {
        System.out.println("constructor of c");
    }
}

public class new2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    b obj = new b();
  }
}


