import java.util.Scanner; //importing scanner class 
/*
Programming Challenge 2

Write a program that has the following String variables: firstName, middleName, and
lastName. Initialize these with your first, middle, and last names. The program should also
have the following char variables: firstInitial, middleInitial, and lastInitial. Store
your first, middle, and last initials in these variables. The program should display the contents of these variables on the screen.
*/

public class nameInitials{

     public static void main(String []args){
        Scanner in = new Scanner(System.in); // our scanner object cin will be used throughout the program
                                                        
                                                        //************** our variables*******************
        String firstName;
        String middleName;
        String lastName;
                                                          //************** our input/output*******************
        System.out.println("Please enter your first name: ");
        firstName = in.nextLine();
        
         System.out.println("Please enter your middle name: ");
         middleName = in.nextLine();
        
         System.out.println("Please enter your last name: ");
         lastName = in.nextLine();
                                                          //************** our character retrieval*******************
        char middleInitial = middleName.charAt(0);
        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);
        
        System.out.println("\nYour first initial is: " + firstInitial + "\nYour middle initial is: " + middleInitial + "\nYour last initial is: " + lastInitial );
     }
}
