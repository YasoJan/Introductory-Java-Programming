import java.util.Scanner;

//Write a program that asks for the names of three runners and the time, in minutes, it took each of them to finish a race. The program should display the names of the runners in the order that they finished.

public class runningTheRace{
    public static void main(String args[]) {
        Scanner i = new Scanner(System.in);

        System.out.print("\nEnter the name of the first runner: ");
        String name1 = i.nextLine();

        System.out.print("Enter the time in minutes it took for this runner to finish: ");
        double time1 = i.nextDouble();
        i.nextLine();
        
        System.out.print("\nEnter the name of the second runner: ");
        String name2 = i.nextLine();

        System.out.print("Enter the time in minutes it took for this runner to finish: ");
        double time2 = i.nextDouble();
        i.nextLine();

        System.out.print("\nEnter the name of the third runner: ");
        String name3 = i.nextLine();

        System.out.print("Enter the time in minutes it took for this runner to finish: ");
        double time3 = i.nextDouble();

        System.out.println("----------------------------------------");
        if(time1 < time2 && time1 < time3) //if name1 wins 1st place
        {
            System.out.print("\n"+name1 + " won first place");  
            System.out.printf("\nTiming: %.2f", time1);
            System.out.println();
           
            if(time2<time3) // if name2 wins second place
            {
            System.out.print("\n"+name2 + " won second place");
            System.out.printf("\nTiming: %.2f", time2);
            System.out.println();

            System.out.print("\n"+name3 + " won third place");
            System.out.printf("\nTiming: %.2f", time3);
            System.out.println();
            }

            if(time3<time2) // if name3 wins third place
            {
            System.out.print("\n"+name3 + " won second place");
            System.out.printf("\nTiming: %.2f", time3);
            System.out.println();

            System.out.print("\n"+name2 + " won third place");
            System.out.printf("\nTiming: %.2f", time2);
            System.out.println();
            }
        }
        else if(time2 < time1 && time2< time3) // if name2 wins first place
            {
                System.out.print("\n"+name2 + " won first place");
                System.out.printf("\nTiming: %.2f", time2);
                System.out.println();
    
                if(time1<time3)  // if name1 wins second place
                {
                System.out.print("\n"+name1 + " won second place");
                System.out.printf("\nTiming: %.2f", time1);
                System.out.println();
    
                System.out.print("\n"+name3 + " won third place");
                System.out.printf("\nTiming: %.2f", time3);
                System.out.println();
                }
    
                if(time3<time1) // if name3 wins second place
                {
                System.out.print("\n"+name3 + " won second place");
                System.out.printf("\nTiming: %.2f", time3);
                System.out.println();
    
                System.out.print("\n"+name1 + " won third place");
                System.out.printf("\nTiming: %.2f", time1);
                System.out.println();
                }
            } //end of 2nd nested if
        else if(time3 <time1 && time3< time2) //if name3 wins first place
            {
                System.out.print("\n"+name3 + " won first place");
                System.out.printf("\nTiming: %.2f", time3);
                System.out.println();
    
            if(time1<time2)  // if name1 wins second place
                {
                System.out.print("\n"+name1 + " won second place");
                System.out.printf("\nTiming: %.2f", time1);
                System.out.println();
    
                System.out.print("\n"+name2+ " won third place");
                System.out.printf("\nTiming: %.2f", time2);
                System.out.println();
                }
    
                if(time2<time1) // if name2 wins second place
                {
                System.out.print("\n"+name2 + " won second place");
                System.out.printf("\nTiming: %.2f", time2);
                System.out.println();
    
                System.out.print("\n"+name1 + " won third place");
                System.out.printf("\nTiming: %.2f", time1);
                System.out.println();
                }
            }// end of 3rd nested if
            System.out.print("\nEnd of race\n");
            
    }
}
