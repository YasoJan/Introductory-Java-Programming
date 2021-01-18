import java.util.Scanner;
/*
Write a program that asks the user to enter the name of his or her favorite city. Use a String
variable to store the input. The program should display the following:
•	 The number of characters in the city name
•	 The name of the city in all uppercase letters
•	 The name of the city in all lowercase letters
•	 The first character in the name of the city
*/


public class stringManipulator {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the name of your favorite city: ");
      String city = input.nextLine();
      
      int cityChars = city.length(); 
      
      System.out.println("The city has: " + cityChars + " amount of characters");
      System.out.println("The city is: " + city.toUpperCase());
      System.out.println("The city also is: " + city.toLowerCase());
      System.out.println("The first character in the city is: " + city.charAt(0));
    }
}
