import java.util.Scanner;
/*
Write a program that asks the user to enter the number of calories and fat grams in a food
item. The program should display the percentage of the calories that come from fat. One
gram of fat has 9 calories; therefore:
Calories from fat 5 Fat grams * 9
The percentage of calories from fat can be calculated as follows:
Calories from fat 4 Total calories
If the calories from fat are less than 30 percent of the total calories of the food, it should
also display a message indicating the food is low in fat.
*/
public class fatGramCalculator {
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the calories from a food item: ");
    double calories = input.nextDouble();
    
    System.out.print("Enter the fat grams from the food item: ");
    double fatGrams = input.nextDouble();
    
    double fatCalories = fatGrams*9; // total of fat calories equation
    double fatPercentage = (fatCalories/calories) * 100; // percentage of fat equation
    
    if(fatCalories>calories)
    {
        System.out.print("ERROR FAT CALORIES CANNOT EXCEED TOTAL CALORIES"); // the error message if fat calories exceed total of calories
    }
    else
    {
    System.out.print("--------------------------------------------");
    System.out.printf("\n\nThe fat calories: %,.2f", fatCalories); //the fat calories total output
    System.out.printf("\nThe percentage of calories that came from fat: %,.2f" , fatPercentage); // the fat percentage output
    System.out.print("%"); //the percentage symbol 
    }
    if(fatPercentage<=30)
    {
        System.out.print("\nFood is low in fat"); // if fat percentage is lower than 30% then output "food is low in fat"
    }
    }
}
