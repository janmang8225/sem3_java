import calc.Addition;
import calc.Division;
import calc.Multiplication;
import calc.Subtraction;

public class lec5 {
  public static void main(String[] args) {
    
    Addition addition = new Addition();
    Subtraction subtraction = new Subtraction();
    Multiplication multiplication = new Multiplication();
    Division division = new Division();
    System.out.println(addition.add(10, 13));
    System.out.println(subtraction.sub(10, 20));
    System.out.println(multiplication.mul(10, 13));
    System.out.println(division.div(10, 13));

  }
}
