import java.util.Scanner;

/*
Write a program that asks the user to enter a number of seconds.
•	 There are 60 seconds in a minute. If the number of seconds entered by the user is
greater than or equal to 60, the program should display the number of minutes in that
many seconds.

•	 There are 3,600 seconds in an hour. If the number of seconds entered by the user is
greater than or equal to 3,600, the program should display the number of hours in
that many seconds.
•	 There are 86,400 seconds in a day. If the number of seconds entered by the user is
greater than or equal to 86,400, the program should display the number of days in
that many seconds.
*/
public class timeCalculator{
    public static void main(String args[]) {
   
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the number of seconds: ");
    long  sec = input.nextLong();
    
    long mins = sec/60;
    
    long hour = sec/3600;
    
    long day = sec/86400;
    
    if(sec >= 60) 
    {
        System.out.println("minutes: " + mins); // include minutes regardless
             if(sec>=3600)
            {
                System.out.println("hours: " + hour); // include hours with minutes if greater than 3600 seconds
            }
            if(sec>86400)
            {
                System.out.println("days: " + day); // include days with hours and minutes if greater than 86400 seconds
            }
            if(sec < 60 && sec > 0)
            {
                System.out.println("Seconds: " + sec); // only include seconds if under 60 and over 0 seconds
            }
    }
    else
        System.out.println("ERROR ENTER A VALID ENTRY"); // error message for negative values
    }
}
