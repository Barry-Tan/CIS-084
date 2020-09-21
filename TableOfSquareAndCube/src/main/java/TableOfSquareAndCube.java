
package TableOfSquareAndCube;

public class TableOfSquareAndCube {
    
        public static void main(String[] args) {
        
        // display a title at the top of the table
        System.out.printf ("Val        Square      Cube\n");
        
        // display value, Square, Cube every 1 degrees
        for (int value=0; value<=20; value+=1) {    // step size = 1
            
           // function
           int square = value*value;
           int cube = value*value*value;
           
           
           // print
           System.out.printf ("%2s   %9s   %9s\n", value, square, cube);

        } // end of for loop                   
    } // end of main 
}

