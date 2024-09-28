public class prac2 {
  public static void main(String[] args) {
    String str = "+91-94-999-65789";
    String s1[];
    s1 = str.split("-",4);
    // for(String a : s1) System.out.println(a);
    for(int i=0; i<3; i++)
    {
      if(i==0) System.out.print("Mobile system operator code : ");
      else if(i==1) System.out.print("MSC : ");
      else if(i==2) System.out.print("Unique code : ");
      System.out.println(s1[i+1]);
    }
  }
}



