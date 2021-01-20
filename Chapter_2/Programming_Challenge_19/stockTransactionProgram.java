import java.util.Scanner;

/*
Last month Joe purchased some stock in Acme Software, Inc. Here are the details of
the purchase:
•	 The number of shares that Joe purchased was 1,000.
•	 When Joe purchased the stock, he paid $32.87 per share.
•	 Joe paid his stockbroker a commission that amounted to 2% of the amount he paid
for the stock.
Two weeks later Joe sold the stock. Here are the details of the sale:
•	 The number of shares that Joe sold was 1,000.
•	 He sold the stock for $33.92 per share.
•	 He paid his stockbroker another commission that amounted to 2% of the amount he
received for the stock.
Write a program that displays the following information:
•	 The amount of money Joe paid for the stock.
•	 The amount of commission Joe paid his broker when he bought the stock
•	 The amount that Joe sold the stock for.
•	 The amount of commission Joe paid his broker when he sold the stock.
•	 Display the amount of profit that Joe made after selling his stock and paying the two
commissions to his broker. (If the amount of profit that your program displays is a
negative number, then Joe lost money on the transaction.)
*/
public class stockTransactionProgram {
    public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
     
     int numberOfStocks = 1000;
     double pricePerShareBought = 32.87; //the stock price per share when it was bought
     double comission = .02;
     double pricePerShareSold = 33.92; // the stock price per share what it was sold
     
     System.out.println("The Stock Transaction Program");
     System.out.println("------------------------------------------------------------------------------"); 
     System.out.printf("\nThe amount of money Joe paid for the stock: $%,.2f", (numberOfStocks*pricePerShareBought));
     System.out.printf("\nThe amount of comission Joe paid his broker when he bought the stock: $%,.2f", comission * (numberOfStocks*pricePerShareBought));
     System.out.printf("\nThe amount that Joe sold the stock for: $%,.2f", pricePerShareSold*numberOfStocks);
     System.out.printf("\nThe amount of comission Joe paid his broker when he sold the stock: $%,.2f", comission * (numberOfStocks*pricePerShareSold));
    }
}
