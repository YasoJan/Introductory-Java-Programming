import java.util.Scanner;
/*
A cookie recipe calls for the following ingredients:
•	 1.5 cups of sugar
•	 1 cup of butter
•	 2.75 cups of flour
The recipe produces 48 cookies with these amounts of the ingredients. Write a program
that asks the user how many cookies he or she wants to make, and then displays the number of cups of each ingredient needed for the specified number of cookies.
*/
public class cookieRecipe{
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
    // we must find the ratio of sugar, butter, and flour per cookie
    double sugarPerCookie = 1.5/48;
    double butterPerCookie = 1.0/48;
    double flourPerCookie = 2.75/48;
    
    System.out.println("Enter how many cookies you'd like to make: ");
    double cookies = input.nextDouble();
    //we output the correct amount
    System.out.println("-----------------------------------------");
    System.out.printf("\nCups of sugar: %.2f", sugarPerCookie * cookies);
    System.out.printf("\ncups of butter needed: %.2f", butterPerCookie * cookies);
    System.out.printf("\nCups of flour needed: %.2f", flourPerCookie * cookies);
    }
}
