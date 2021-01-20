import java.util.Scanner;

/*
Write a program that plays a word game with the user. The program should ask the user to
enter the following:
•	 His or her name
•	 His or her age
•	 The name of a city
•	 The name of a college
•	 A profession
•	 A type of animal
•	 A pet’s name
After the user has entered these items, the program should display the following story,
inserting the user’s input into the appropriate locations:
There once was a person named NAME who lived in CITY. At the age of AGE,
NAME went to college at COLLEGE. NAME graduated and went to work as a
PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both lived
happily ever after!

*/
public class wordGame {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter your name: ");
      String name = input.nextLine();
      
      System.out.println("Enter your age: ");
     int age = input.nextInt();
     
     System.out.println("Enter your city: ");
      String city = input.nextLine();
        input.nextLine();
     System.out.println("Enter your college: ");
      String college = input.nextLine();
      
      System.out.println("Enter your job: ");
      String job = input.nextLine();
      
      System.out.println("Enter your animal: ");
      String animal = input.nextLine();
      
      System.out.println("Enter your pets name: ");
      String petName = input.nextLine();
      
      
      System.out.println("-----------------------------------------------------------------");
      System.out.println("\nThere once was a person named " + name + ". Who lived in " + city);
         System.out.println("at the age of " + age + ", " + name + " went to " + college + ".");
         System.out.println(name + " graduated and went to work as a " + job + ".");
         System.out.println("Then " + name + " adopted a " + animal + " named " + petName );
    }
}
