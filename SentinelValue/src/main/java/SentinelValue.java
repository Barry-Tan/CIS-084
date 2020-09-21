/* SentinelValue
   Jingwen Tan
   CIS084 Java Programming
   Version:1.0
   2-24-2020
*/
package SentinelValue;
import java.util.Scanner;

public class SentinelValue {
    
    public static void main(String[] args){
        double firstscore;
        double score;
        double total = 0;
        double average;
        int studentCount = 1;
        
        // create the Scanner object
        Scanner stdin = new Scanner(System.in);
        
        //title at the top of the output
        System.out.println("Find the average score of students");
        System.out.println("Enter -1 when done");
        
        //read the score for the first student
        System.out.printf("Enter the score for student #%d: ", studentCount);
        firstscore = stdin.nextDouble();
        
        if(firstscore == -1 && studentCount == 1){
            System.out.print("No score is enter");
        }
        
        else{
            while(true){
                 System.out.printf("Enter the score for student #%d: ", studentCount+1);
                 score = stdin.nextDouble();
                 if(score>100 || score <0 && score !=-1){
                    total = total;
                    studentCount = studentCount;
                    System.out.print("your score should between 0-100, Do it again\n");
                  }
                 else if(score == -1){
                     break;
                 }
                  else{
                    total += score;
                    studentCount++;
                  }   
            }// end of loop
        
            average = (total+firstscore)/ (studentCount);
            System.out.printf("\nThe average score for %d students is %8.2f\n",studentCount,average);
        }
    } // end of main
} // end of class definition
