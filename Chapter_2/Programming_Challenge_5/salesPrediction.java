import java.util.Scanner;
/*
Programming Challenge 5

The East Coast sales division of a company generates 62 percent of total sales. Based on
that percentage, write a program that will predict how much the East Coast division will
generate if the company has $4.6 million in sales this year. Hint: Use the value 0.62 to
represent 62 percent.
    
*/

public class salesPrediction {

     public static void main(String []args){
        
    double salesPercentage = 0.62; // the percentage of the profit the East Coast Division takes away 
    double profit = 4.6; // the company's total profit
    double sales = salesPercentage * profit; // our sales equation 
    
    System.out.printf("The East Coast Sales Division will generate $%.2f" , sales); // our printf statement to use set precision for our format
    System.out.print(" million in sales"); // our statement after the format which cannot be included in the same printf statement
     }
}
