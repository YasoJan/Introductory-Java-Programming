import java.util.Scanner;

/*
Scientists measure an object’s mass in kilograms and its weight in Newtons. If you know the
amount of mass that an object has, you can calculate its weight, in Newtons, with the following formula:
Weight =  Mass * 9.8

Write a program that asks the user to enter an object’s mass, and then calculate its weight.
If the object weighs more than 1,000 Newtons, display a message indicating that it is too
heavy. If the object weighs less than 10 Newtons, display a message indicating that the
object is too light.
*/
public class kgsToNewtons {
    public static void main(String args[]) {
   
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your object weight in kg: ");
    double kg = input.nextDouble();
    double newtons = kg * 9.8; // kg to newton conversion
    
    
    if(newtons>1000) // object weight greater than 1000
    {
        System.out.printf("\nThe object weight in newtons: %.2f",newtons);   
        System.out.println("\nThe object is too heavy");
    }
    else if(newtons<10 && newtons>0) // object weight between 0 and 10
    {
        System.out.printf("\nThe object weight in newtons: %.2f",newtons);
        System.out.println("\nThe object is too light"); 
    }
    else
        System.out.println("\nERROR ENTER A VALID ENTRY"); // error message without newton amount
    } 
}
