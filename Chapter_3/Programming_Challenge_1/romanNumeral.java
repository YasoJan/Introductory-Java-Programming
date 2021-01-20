import java.util.Scanner;

/*
Write a program that prompts the user to enter a number within the range of 1 through 10.
The program should display the Roman numeral version of that number. If the number is
outside the range of 1 through 10, the program should display an error message.
*/
public class romanNumeral {
    public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
     
     System.out.println("Enter a number 1-10 and see the roman numeral version of it: ");
     int number = input.nextInt();
     
     if(number == 1) // if else statements
     {
         System.out.println("You entered 1 aka I");
     }
         else if(number == 2)
     {
         System.out.println("You entered 2 aka II");
     }
        else if(number == 3)
     {
         System.out.println("You entered 3 aka III");
     }
         else if(number == 4)
     {
         System.out.println("You entered 4 aka IV");
     }
        else if(number == 5)
     {
         System.out.println("You entered 5 aka V");
     }
        else if(number == 6)
     {
         System.out.println("You entered 6 aka VI");
     }   
        else if(number == 7)
     {
         System.out.println("You entered 7 aka VI");
     }
       else  if(number == 8)
     {
         System.out.println("You entered 8 aka VI");
     }
        else if(number == 9)
     {
         System.out.println("You entered 9 aka IX");
     }
        else if(number == 10)
     {
         System.out.println("You entered 10 aka X");
     }
     else
        System.out.println("ERROR Enter a valid entry"); //error message
    } // end of main
} // end of romanNumeral class
