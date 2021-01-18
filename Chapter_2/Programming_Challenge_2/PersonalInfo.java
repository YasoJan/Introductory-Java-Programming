import java.util.Scanner; //importing scanner class 
/*
Programming Challenge 3

Write a program that displays the following information, each on a separate line:
•	 Your name
•	 Your address, with city, state, and ZIP
•	 Your telephone number
•	 Your college major
Although these items should be displayed on separate output lines, use only a single println
statement in your program.
*/

public class personalInfo{

     public static void main(String []args){
        
        Scanner in = new Scanner(System.in); // our scanner object cin will be used throughout the program
                                                        
                                                        //************** our variables*******************
        String name;
        String city;
        String state;
        String zipCode;
        String number;
        String major;  // we can also type String name, city, state, zipCode, number, major; <-------- for convenience
        
                                                        //************** our input/output*******************
        System.out.print("Please enter your name: ");
        name = in.nextLine();
         
         System.out.print("Please enter your city: ");
         city = in.nextLine();
         
         
         System.out.print("Please enter your state: ");
         state = in.nextLine();
        
          System.out.print("Please enter your zip code: ");
          zipCode = in.nextLine();
          
           
          System.out.print("Please enter your phone number: ");
          number = in.nextLine();
        
           
           System.out.print("Please enter your college major: ");
          major = in.nextLine();
          
          String address = city + ", " + state + " " + zipCode; // we can add different strings together to form one "address" string
          
                                                          //************** our final message *******************
       
        
        System.out.println("\nYour name is: " + name + "\nYour address is: " + address + "\nYour phone number is: " + number + "\nYour major is: " + major);
     }
}
