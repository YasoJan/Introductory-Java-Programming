import java.util.*;
/*
Programming Challenge 9

A car’s miles-per-gallon (MPG) can be calculated with the following formula:
MPG = Miles driven / Gallons of gas used
The Miles-perGallon Problem

Write a program that asks the user for the number of miles driven and the gallons of gas
used. It should calculate the car’s miles-per-gallon and display the result on the screen.
*/

public class milesPerGallon{

     public static void main(String []args){
         
        Scanner input = new Scanner(System.in); // our Scanner object allows for user input
        
        System.out.println("Enter number of miles driven: ");
        double miles = input.nextDouble(); 
        
        System.out.println("Enter gallons of gas used: "); 
        double gallons = input.nextDouble();
        
        double mpg = miles/gallons; // mpg formula used
        
        System.out.println("---------------------------------------------");
        
        System.out.printf("\nMiles-per-gallon: %.2f", mpg); // final output 
    }
}
       
     
