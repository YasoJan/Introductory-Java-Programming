import java.util.Scanner;
/*
Programming Challenge 8

A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are
10 servings in the bag and that a serving equals 300 calories. Write a program that lets the
user enter the number of cookies he or she actually ate and then reports the number of total
calories consumed.
    
*/

public class cookieCalories {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the amount of cookie eaten: ");
        int cookiesEaten = input.nextInt();
        
        double cals = 300/4; // each serving is 4 cookies that are 300 cals total
        double totalCals = cals * cookiesEaten; // multiply caloric ratio by the amount of cookies eaten to find total caloric expenditure
        
        System.out.printf("\nCalories consumed: %,.0f", totalCals); // printf statement with 0 decimal set precision formatting outputting calotic expenditure
    }
}
