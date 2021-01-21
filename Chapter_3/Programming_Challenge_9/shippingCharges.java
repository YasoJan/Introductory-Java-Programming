import java.util.Scanner;
/*
The Fast Freight Shipping Company charges the following rates:
Weight of Package Rate per 500 Miles Shipped
2 pounds or less $1.10
Over 2 pounds but not more than 6 pounds $2.20
Over 6 pounds but not more than 10 pounds $3.70
Over 10 pounds $3.80
The shipping charges per 500 miles are not prorated. For example, if a 2-pound package is
shipped 550 miles, the charges would be $2.20. Write a program that asks the user to enter
the weight of a package and then displays the shipping charges.
*/
public class shippingCharges {
    static double rate;
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the package weight: ");
    double weight = input.nextDouble();
    System.out.print("Enter mileage: ");
    double miles = input.nextDouble();
    // nested if statements for mileage exceeding 500 
    if(weight<=2)
    {
        rate = 1.10;
        if(miles > 500)
        {
            rate = 2.20;
        } // end of nested if
    }
    if(weight > 2 && weight <= 6)
    {
        rate = 2.20;
        if(miles > 500)
        {
            rate = 3.70;
        } // end of nested if
    }
    if(weight > 6 && weight <= 10)
    {
        rate = 3.70;
        if(rate > 500)
        {
            rate = 3.80;
        } // end of nested if
    }
    if(weight > 10)
    {
        rate = 3.80;
    }
    System.out.printf("Total: $%,.2f" ,rate); // final output
    }
}
