import java.util.Scanner;
class Account
{
  private int id;
  private double balance, annualInterestRate;

  Account()
  {
    id = 0;
    balance = 500;
    annualInterestRate = 7;  
  }
  Account(int id, double balance, double annualInterestRate)
  {
    this.id = id;
    this.balance = balance;
    this.annualInterestRate = annualInterestRate;
  }
  double getMonthlyInterestRate()
  {
    return annualInterestRate/12;
  }
  double getMonthlyInterest()
  {
    return ((annualInterestRate/12)*balance/100);
  }
  double withdraw(double amount)
  {
    return balance -= amount;
  }
  double deposit(double amount)
  {
    return balance += amount;
  }

  int search(int id)
  {
    if(this.id == id) return 1;

    return 0;
  }
  void putdata()
  {
    System.out.println("id : " + id);
    System.out.println("balance : " + balance);
    System.out.println("annual interest rate : " + annualInterestRate);
    System.out.println("annual interest amount : " + (annualInterestRate/100*balance));
  }



}


public class prac6 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("enter number of account u want to create with default constructor : ");
    int n = scan.nextInt();
    Account[] acc = new Account[n];
    
    for(int i=0; i<n; i++)
    {
      acc[i] = new Account();
      System.out.println("monthly interest : " + acc[i].getMonthlyInterest());
    }

    System.out.print("enter number of account u want to create with parameterised constructor : ");
    int n2 = scan.nextInt();
    Account[] acc2 = new Account[n2];
    int id;
    double balance, annualInterestRate;

    for(int i=0; i<n2; i++)
    {
      System.out.print("enter id : ");
      id = scan.nextInt();
      System.out.print("enter balance : ");
      balance = scan.nextDouble();
      System.out.print("enter annual interest rate : ");
      annualInterestRate = scan.nextDouble();

      acc2[i] = new Account(id, balance, annualInterestRate);
    }


    System.out.print("\n(1) deposit / (2) withdraw / (0) nothing : ");
    int choice = scan.nextInt();
    if(choice==1)
    {
      System.out.println("enter account number : ");
      int a = scan.nextInt();
      for(int i=0; i<n; i++)
      {
        if(acc[i].search(a) == 1) 
        {
          System.out.print("enter amount to deposit : ");
          double d = scan.nextDouble();
          acc[i].deposit(d);
          break;
        }
      }
      for(int i=0; i<n2; i++)
      {
        if(acc2[i].search(a) == 1) 
        {
          System.out.print("enter amount to deposit : ");
          double d = scan.nextDouble();
          acc2[i].deposit(d);
          break;
        }
      }
    }
    System.out.println();
    System.out.println("accounts created using parameterised constructors : ");
    for(int i=0; i<n2; i++)
    {
      acc2[i].putdata();
    }

    

    scan.close();
  }
}
