import java.util.Scanner;
/*
Kathryn bought 600 shares of stock at a price of $21.77 per share. 
She must pay her stockbroker a 2 percent commission for the transaction. 
Write a program that calculates and displays the following:
•	 The amount paid for the stock alone (without the commission)
•	 The amount of the commission
•	 The total amount paid (for the stock plus the commission)
*/

public class stockComission {
    public static void main(String args[]) {
    
    double shareCost = 21.77;
    double shares = 600;
    double stockAlone = shareCost*shares; //our stock equation
    double comission = .02 * stockAlone; //our comission equation
    double totalAmount = comission + stockAlone; // the total of our stock + comission
    
    System.out.printf("The total of the stock alone (Without the comission): $%,.2f" , stockAlone); 
    System.out.printf("\nThe total of the comission: $%,.2f" , comission);
    System.out.printf("\nThe total of the stock and comission: $%,.2f" , totalAmount);
    }
}
