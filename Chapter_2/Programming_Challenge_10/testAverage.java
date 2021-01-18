import java.util.*;
/*
Programming Challenge 10

Write a program that asks the user to enter three test scores. The program should display
each test score, as well as the average of the scores
*/

public class testAverage{

     public static void main(String []args){
         
        Scanner input = new Scanner(System.in); // our Scanner object allows for user input
        
        System.out.println("Enter test #1: ");
        double test1 = input.nextDouble(); 
        
        System.out.println("Enter test #2: "); 
        double test2 = input.nextDouble();
        
        System.out.println("Enter test #3: ");
        double test3 = input.nextDouble();
        
        double average = (test1 + test2 + test3)/3;  // our formula for calculating the average of three scores
        
        System.out.println("---------------------------------------------");
        
        System.out.printf("\nTest average: %.2f", average); // final output
    }
}
       
     
