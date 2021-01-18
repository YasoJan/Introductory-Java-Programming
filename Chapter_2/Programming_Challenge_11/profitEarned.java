import java.util.*;
/*
Programming Challenge 11

An electronics company sells circuit boards at a 40 percent profit. If you know the retail
price of a circuit board, you can calculate its profit with the following formula:
Profit = Retail price × 0.4
Write a program that asks the user for the retail price of a circuit board, calculates the
amount of profit earned for that product, and displays the results on the screen.
*/

public class profitEarned{

     public static void main(String []args){
         
         Scanner x = new Scanner(System.in); // our scanner object
         
         System.out.print("Enter retail price of circuit board: $"); 
         double retailPrice = x.nextDouble();
         
         double profit = retailPrice * 0.4; // formula for calculating the profit
         
         System.out.printf("\nTotal profit earned: $%,.2f" , profit); // final output using printf statement for set precision to 2 decimal places
    }
}
