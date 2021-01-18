import java.util.Scanner;
/*
Programming Challenge 12
Write a program that computes the tax and tip on a restaurant bill. The program should ask
the user to enter the charge for the meal. The tax should be 6.75 percent of the meal charge.
The tip should be 20 percent of the total after adding the tax. Display the meal charge, tax
amount, tip amount, and total bill on the screen.
*/


public class restaurantBill {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the charge for the meal: $");
      double charge = input.nextDouble();
      
      double tax = 0.0675;
      double tip = 0.2;
      double totalCharge = ((tax + tip) * charge) + charge; //our total charge formula
       System.out.println("----------------------------"); 
      
      System.out.printf("\nMeal charge: $%,.2f", charge); // our meal charge in set precision

      System.out.printf("\ntax amount: $%,.2f", tax * charge); // our tax in set precision 
    
      System.out.printf("\ntip ammount: $%,.2f", tip * charge); // our tip in set precision
     
      System.out.printf("\nTotal bill: $%,.2f", totalCharge); // our total charge in set precision

    }
}
