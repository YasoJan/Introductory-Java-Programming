import java.util.Scanner;

/*
Write a program that calculates and displays a person’s body mass index (BMI). The BMI is
often used to determine whether a person with a sedentary lifestyle is overweight or underweight for his or her height. A person’s BMI is calculated with the following formula:
BMI 5 Weight 3 703 / Height^2
where weight is measured in pounds and height is measured in inches. The program should
display a message indicating whether the person has optimal weight, is underweight, or is
overweight. A sedentary person’s weight is considered optimal if his or her BMI is between
18.5 and 25. If the BMI is less than 18.5, the person is considered underweight. If the BMI
value is greater than 25, the person is considered overweight.
*/
public class bmi {
    public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
     
     System.out.println("Enter your weight in lbs: ");
     double weight = input.nextDouble();
     
     System.out.println("Enter your height in inches: ");
     double height = input.nextDouble();
     
     double bmi = ((weight * 703)/(height*height));
     
     if(bmi<18.5) //underweight
     {
         System.out.printf("Your bmi is: %.2f" , bmi);
         System.out.println("\nYou are underweight");
     }
     else if(bmi>=18.5 && bmi <= 25) //optimal weight
     {
         System.out.printf("Your bmi is: %.2f" , bmi);
         System.out.println("\nYou are at optimal weightt");
     }
     if(bmi>25) //overweight
     {
         System.out.printf("Your bmi is: %.2f" , bmi);
         System.out.println("\nYou are overweight");
     }
     
    } 
}
