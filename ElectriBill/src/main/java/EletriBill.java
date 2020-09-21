/**
ElectricBill
Jingwen Tan
02/11/2020
CIS084 Java Programming
 */
package EletricBill;
import java.util.Scanner;

public class EletriBill {
    
    // DEFINE THE CONSTANTS     
    public static final double RegPrice = 0.27;
    public static final double OverPrice = 0.55;
    
    public static void main(String[] args){
    // Declare the variables
    double kwh;
    double baseKwh, Extra_kwh;
    double Base_Bill, Extra_Bill, Electric_Bill;
    
    //create the stdin object(to use the keyboard)
    Scanner stdin = new Scanner(System.in);
    
    System.out.print("Enter the your kWh: "); //prompt message
    kwh = stdin.nextDouble();     // input from the keyboard
   
    if(kwh <= 500)
    {
        baseKwh = kwh;
        Extra_kwh = 0;  
    }
    else
    {
        baseKwh = 500;
        Extra_kwh = kwh-500;
    }
    
    Base_Bill = RegPrice * baseKwh;
    Extra_Bill = OverPrice * Extra_kwh;
    Electric_Bill = Base_Bill + Extra_Bill;
    
    //Output: Display bill 
    System.out.printf("\n"); // blank line before the output
    System.out.printf("Your total electric bill is $%.2f\n", Electric_Bill);
    
    // Close stdin 
    stdin.close();
    
   } // end of public static void main(String[] args)
}// end of public class ElectricBill
