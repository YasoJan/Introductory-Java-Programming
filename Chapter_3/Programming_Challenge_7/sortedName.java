import java.util.Scanner;

/*
Write a program that asks the user to enter three names, and then displays the names sorted
in ascending order. For example, if the user entered “Charlie”, “Leslie”, and “Andy”, the
program would display:
Andy
Charlie
Leslie
*/
public class sortedName{
    public static void main(String args[]) {
   
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a name: ");
    String name1 = input.nextLine();
    
    System.out.print("Enter a name: ");
    String name2 = input.nextLine();
    
    System.out.print("Enter a name: ");
    String name3 = input.nextLine();
    
    System.out.println("3rd name: " + name3);
    System.out.println("2nd name: " + name2);
    System.out.println("1st name: " + name1);
   }
}
