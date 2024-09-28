import java.text.SimpleDateFormat;
import java.util.*;
public class lab4 {
  public static void main(String[] args) {
    Date d1;

    Scanner scan = new Scanner(System.in);
    System.out.println("enter a date : (dd/mm/yyyy) : ");
    String dateStr = scan.next();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    d1 = sdf.parse(dateStr);
    System.out.println("date is : " + d1);

    scan.close();
  }
}
