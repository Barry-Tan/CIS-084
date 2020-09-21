/**
CountingChange
Jingwen Tan
02/04/2020
CIS084 Java Programming
 */
package CountingChange;
import java.util.Scanner;

public class CountingChange {
    
    // define the constants
    public static final double Quarters = 0.25;
    public static final double Dimes = 0.10;
    public static final double Nickels = 0.05;
    public static final double Pennies = 0.01;
    
    public static void main(String[] args){
        // Declare the Variables
        int numQuarters, numDimes;
        int numNickels, numPennies;
        double dollor;
        //create the stdin object for keyboard
        Scanner stdin = new Scanner(System.in);
        
        //Title message
        System.out.println("Barry's Counting Program");
        
        //INPUT: # of coins
        System.out.print("Enter the number of quarters: ");
        numQuarters = stdin.nextInt();
        System.out.print("Enter the number of dimes: ");
        numDimes = stdin.nextInt();
        System.out.print("Enter the number of nickels: ");
        numNickels = stdin.nextInt();
        System.out.print("Enter the number of pennies: ");
        numPennies = stdin.nextInt();
        
        //Compute the dollor
        dollor = numQuarters * Quarters + numDimes * Dimes 
                + numNickels * Nickels + numPennies * Pennies;
        
        //OUTPUT: display dollor
        System.out.printf("\n");
        System.out.printf("Your total is $%.2f\n", dollor);
        
        //Close stdin
        stdin.close();
    } // end of public static void main
} // end of public class CountingChange
