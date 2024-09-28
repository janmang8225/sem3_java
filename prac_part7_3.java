
import java.util.ArrayList;
import java.util.HashMap;


public class prac_part7_3 {
  private static HashMap<Integer, String> books = new HashMap<>();
  private static ArrayList<String> cart = new ArrayList<>();
  public static void main(String[] args) {
    InitializeBooks();
    java.util.Scanner scan = new java.util.Scanner(System.in);

    
  }

  public static void InitializeBooks()
  {
    books.put(1, "Java programming");
    // add more 
  }

  public static void BrowseBooks()
  {
    System.out.println("===== Available Books =====");
    for(Map.Entry<Integer, String> entry : books.entrySet())
    {
      System.out.println(entry.getKey() + ". " + entry.getValue());
    }
  }
}
