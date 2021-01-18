import java.util.Scanner; //importing scanner class 
/*
Programming Challenge 1
Write a program that declares the following:
•	 a String variable named name
•	 an int variable named age
•	 a double variable named annualPay
Store your age, name, and desired annual income as literals in these variables. The program
should display these values on the screen in a manner similar to the following:
My name is Joe Mahoney, my age is 26 and
I hope to earn $100000.0 per year.
*/

public class nameAgeSalary{

     public static void main(String []args){
        Scanner cin = new Scanner(System.in); // our scanner object cin will be used throughout the program
        String name;
        int age;
        double salary; // initializing our variables
        
       
        System.out.println("\nEnter your name: ");
      
        name = cin.nextLine();
    
        System.out.println("\nEnter your age: ");
        age = cin.nextInt();
        System.out.println("\nEnter your desired income: ");
        salary = cin.nextDouble();
       
        System.out.print("\nHello my name is " + name + ". Im " + age +" years old, and"); 
        System.out.printf(" I hope to earn $%,.2f",  salary); // our format specifier requires comma seperation and 2 decimal values
       
     }
}
