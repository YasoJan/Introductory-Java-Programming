/*
Programming Challenge 6

One acre of land is equivalent to 43,560 square feet. Write a program that calculates the
number of acres in a tract of land with 389,767 square feet. Hint: Divide the size of the
tract of land by the size of an acre to get the number of acres.
    
*/

public class landCalculation {
    public static void main(String[] args) { 
        
        int acre = 43560; // the square footage in an acre
        int tract = 389767; // the tract of land in square feet
        int total = tract/acre; // the total size of the tract of land in acres
        
        System.out.print("The total size of the land is " + total + " acres"); // the final output 
    }
}
