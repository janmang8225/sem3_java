import java.util.Scanner;

public class prac3 {
  public static void PrintCalender(int year, int month)
  {
    int year_code, month_code=0, century_code=0, leap_year_code, day;
    int month_loop=0;
    // year code 
    int YY = year % 100;
    year_code = (YY + (YY / 4));
    year_code = year_code % 7;

    // month code 
    if (month == 1) month_code = 0;
    else if (month == 2) month_code = 3;
    else if (month == 3) month_code = 3;
    else if (month == 4) month_code = 6;
    else if (month == 5) month_code = 1;
    else if (month == 6) month_code = 4;
    else if (month == 7) month_code = 6;
    else if (month == 8) month_code = 2;
    else if (month == 9) month_code = 5;
    else if (month == 10) month_code = 0;
    else if (month == 11) month_code = 3;
    else if (month == 12) month_code = 5;

    // century code
    if (year / 100 == 17) century_code = 4;
    else if (year / 100 == 18) century_code = 2;
    else if (year / 100 == 19) century_code = 0;
    else if (year / 100 == 20) century_code = 6;
    else if (year / 100 == 21) century_code = 4;
    else if (year / 100 == 22) century_code = 2;
    else if (year / 100 == 23) century_code = 0;

    // leap year code
    if (year % 400 == 0)
        leap_year_code = 1;
    else if (year % 100 == 0)
        leap_year_code = 0;
    else if (year % 4 == 0)
        leap_year_code = 1;
    else
        leap_year_code = 0;

    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        month_loop = 31;
    else if (month == 4 || month == 6 || month == 9 || month == 11)
        month_loop = 30;
    else if (month == 2)
    {
        if (leap_year_code == 1)
            month_loop = 29;
        else
            month_loop = 28;
    }

    for(int i=1; i<=month_loop; i++)
    {
        day = (year_code + month_code + century_code + i - leap_year_code);
        // day++;
        day = day % 7;
        System.out.print("");
        
        if(i==1)
        {
            if(day==1) System.out.print("      ");
            else if(day==2) System.out.print("            ");
            else if(day==3) System.out.print("                  ");
            else if(day==4) System.out.print("                        ");
            else if(day==5) System.out.print("                              ");
            else if(day==6) System.out.print("                                    ");
        }
        if(1<=i && i<=9) System.out.print(" "+i+"    ");
        else System.out.print(i+"    ");
        if(day==6) System.out.println();
    }
  }
  public static void main(String[] args) {
    int year, month;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter year : ");
    year = scan.nextInt();
    System.out.println("Enter month : ");
    month = scan.nextInt();
    PrintCalender(year, month);


  }
}


