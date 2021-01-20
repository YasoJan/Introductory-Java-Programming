import java.util.Scanner;

/*
The date June 10, 1960, is special because when we write it in the following format, the
month times the day equals the year:
6/10/60
Write a program that asks the user to enter a month (in numeric form), a day, and a twodigit year. The program should then determine whether the month times the day is equal
to the year. If so, it should display a message saying the date is magic. Otherwise, it should
display a message saying the date is not magic.
*/
public class magicNumber {
    public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
     
     System.out.print("Enter the month (1-12): ");
     int month = input.nextInt();
     
     System.out.print("Enter the day (1-31): ");
     int day = input.nextInt();
     
     System.out.print("Enter the last two digits of the year: ");
     int year = input.nextInt();
     
     String date = month + "/" + day + "/" + year;
     
     if(month * day == year)
         System.out.println(date + " is magic");
    else
        System.out.println(date + " is NOT magic");
     
    } // end of main
} // end of magicNumber class
