import java.util.Scanner;

/*
A software company sells a package that retails for $99. Quantity discounts are given
according to the following table:

Quantity Discount
10–19 20%
20–49 30%
50–99 40%
100 or more 50%

Write a program that asks the user to enter the number of packages purchased. The program should then display the amount of the discount (if any) and the total amount of the
purchase after the discount
*/
public class qualityDiscount{
    public static void main(String args[]) {
   
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the total amount of packages bought: ");
    double packages = input.nextDouble(); 
    double price = packages * 99;
    
    System.out.print("---------------------------------------------------\n");
    
    //*******************************************************************************20% Discount********************************************************
    if(packages>=10 && packages<=19)
    {
        double discount = .20;
        double totalDiscounted = price * discount;
        System.out.print("\nDiscount: 20%");
        System.out.printf("\tDiscount: $%,.2f", totalDiscounted);
        System.out.printf("\t Total: $%,.2f", ((price)-(totalDiscounted)));
    }
    //*******************************************************************************30% Discount********************************************************
    else if(packages>=20 && packages<=49)
    {   
        double discount = .30;
        double totalDiscounted = price * discount;
        System.out.print("\nDiscount: 30%");
        System.out.printf("\tDiscount: $%,.2f", totalDiscounted);
        System.out.printf("\t Total: $%,.2f", ((price)-(totalDiscounted)));
    }
    //*******************************************************************************40% Discount********************************************************
    else if(packages>=50 && packages<=99)
    {
        double discount = .40;
        double totalDiscounted = price * discount;
        System.out.print("\nDiscount: 40%");
        System.out.printf("\tDiscount: $%,.2f", totalDiscounted);
        System.out.printf("\t Total: $%,.2f", ((price)-(totalDiscounted)));
    }
    //*******************************************************************************50% Discount********************************************************
    else if(packages>100)
    {
        double discount = .50;
        double totalDiscounted = price * discount;
        System.out.print("price:"+price);
        System.out.print("\nDiscount: 50%");
        System.out.printf("\tDiscount: $%,.2f", totalDiscounted);
        System.out.printf("\t Total: $%,.2f", ((price)-(totalDiscounted)));
    }
    //*******************************************************************************No Discount********************************************************
    else if(packages<10)
    {
        System.out.printf("\nDiscount: N/A \t Total: $%.2f", ((price)));
    }//*******************************************************************************ERROR MESSAGE********************************************************
    else
        System.out.println("ERROR Enter a valid entry");
   }
}
