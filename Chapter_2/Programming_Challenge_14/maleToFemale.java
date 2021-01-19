import java.util.Scanner;
import org.apache.maven.model.*;
/*
Write a program that asks the user for the number of males and the number of females registered in a class. 
The program should display the percentage of males and females in the class.
Hint: Suppose there are 8 males and 12 females in a class. There are 20 students in the class.
The percentage of males can be calculated as 8 4 20 5 0.4, or 40%. The percentage of
females can be calculated as 12/20 = 0.6, or 60%. 
*/

public class maleToFemale {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the number of males: ");
      double males = input.nextDouble();
      
      System.out.println("Enter the number of females: ");
      double females = input.nextDouble();
      
      double total = males + females;
      double maleRatio = ((males/total) * 100);
      double femaleRatio =(( females/total) * 100);
      
      System.out.printf("Male percentage %.2f: " , maleRatio);
      System.out.printf("Female percentage %.2f: " , femaleRatio);
    }
}
