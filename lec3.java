class Calculate
{
  int l, b, h;
  Calculate()
  {
    l = 10; 
    b = 15; 
    h = 20;
  }
  float CurvedSurfaceArea()
  {
    return 2*h*(l+b);
  }
  float TotalSurfaceArea()
  {
    return 6*l*l;
  }
  float Volume()
  {
    return l*b*h;
  }
}
public class lec3 {
  public static void main(String[] args) {
    Calculate calc = new Calculate();
    System.out.println(calc.CurvedSurfaceArea());
    System.out.println(calc.TotalSurfaceArea());
    System.out.println(calc.Volume());

  }
}
