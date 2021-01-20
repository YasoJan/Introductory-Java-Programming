import java.util.Scanner;

/*
Write a program that has variables to hold three test scores. The program should ask the
user to enter three test scores and then assign the values entered to the variables. The program should display the average of the test scores and the letter grade that is assigned for
the test score average. Use the grading scheme in the following table:
Test Score Average - Letter Grade
90–100 A
80–89 B
70–79 C
60–69 D
Below 60 F
*/
public class testScore {
    public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
     
     System.out.println("Enter score #1: ");
     double score1 = input.nextDouble();
     
    System.out.println("Enter score #2: ");
     double score2 = input.nextDouble();
     
     System.out.println("Enter score #3: ");
     double score3 = input.nextDouble();
     
     double average = ((score1 + score2 + score3)/3); // average of test scores
      
      if(average>=90 && average <=100) // A grade
      System.out.printf("Grade: A %.2f", average );
      else if(average >=80 && average <=89) // B grade
      System.out.printf("Grade: B %.2f", average );
      else if(average >=70 && average <=79) // C grade
      System.out.printf("Grade: C %.2f", average );
      else if(average >=60 && average <=69) // D grade
      System.out.printf("Grade: D %.2f", average );
      else if(average >=50 && average <=59) // F grade 
      System.out.printf("Grade: F %.2f", average );
      else
      System.out.println("ERROR ENTER A VALID ENTRY"); // error message
    } 
}
