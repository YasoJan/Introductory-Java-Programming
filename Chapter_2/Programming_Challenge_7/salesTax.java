import java.util.Scanner;
/*
Programming Challenge 7

Write a program that will ask the user to enter the amount of a purchase. The program
should then compute the state and county sales tax. Assume the state sales tax is 4 percent
and the county sales tax is 2 percent. The program should display the amount of the purchase, the state sales tax, the county sales tax, the total sales tax, and the total of the sale
(which is the sum of the amount of purchase plus the total sales tax). Hint: Use the value
0.02 to represent 2 percent, and 0.04 to represent 4 percent.
    
*/

public class salesTax {
    public static void main(String[] args) { 
        
        Scanner i = new Scanner (System.in); 
//*********************************************************************inputting user purchase amount*********************************************************************                                                                
        System.out.print("Enter your purchase amount: $"); 
        double purchaseAmount = i.nextDouble();

//*********************************************************************initializing Variables*********************************************************************                                                                
     
       double stateTax = 0.04;
       double countyTax = 0.02;
       double tax = stateTax + countyTax;
       double total = (tax * purchaseAmount) + purchaseAmount; // our total tax calculation
      
        System.out.println("-------------------------------------------------------\n");

//*********************************************************************outputting user amount before & after tax*********************************************************************                                                                
         
       System.out.printf("Your total amount before tax: $%,.2f ", purchaseAmount); //printf statement for set precision 
       System.out.println();
       System.out.printf("Your total amount after tax: $%,.2f ", total);
    }
}
