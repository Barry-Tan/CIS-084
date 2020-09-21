/* numberquiz.java
03/19/2020
Jingwen Tan
*/

import java.util.Scanner;

public class numberquiz {
    private static final int singlepoint = 10;//point for each question
    private static final int NUM1 = 0;
    private static final int NUM2 = 1;
    private static final int USER_ANS = 2;
    private static int[][] Storage = {
        {0,0,0},{0,0,0},{0,0,0},{0,0,0},
        {0,0,0},{0,0,0},{0,0,0},{0,0,0},
        {0,0,0},{0,0,0},{0,0,0}
    }; 
    private static void createQuiz(){
        //Create Scanner pbject
        Scanner stdin = new Scanner(System.in);
        int total_question = Storage.length;
        System.out.println("----Number Quiz----");
        for(int questNumber=1;questNumber<total_question;questNumber++){
            Storage[questNumber][NUM1] = (int)(100*Math.random());
            Storage[questNumber][NUM2] = (int)(100*Math.random());
            System.out.print("Question " + questNumber+ ": \n" + 
                    Storage[questNumber][NUM1] + "+" +
                    Storage[questNumber][NUM2] +" = ");
            Storage[questNumber][USER_ANS] = stdin.nextInt();
        }
    }
    private static void gradeQuiz(){
        int total_question = Storage.length;
        int total_score = 0;
        System.out.print(".......................Grading...................\n");
        for(int questNumber=1;questNumber<total_question;questNumber++){
            int rightAns = Storage[questNumber][NUM1]+Storage[questNumber][NUM2];
            if(Storage[questNumber][USER_ANS]==rightAns){
                total_score += singlepoint;
                System.out.print("Question " + questNumber+ ": \n" + 
                        Storage[questNumber][NUM1] +"+"+ Storage[questNumber][NUM2]
                        +" = "+ Storage[questNumber][USER_ANS]+ " (CORRECT) \n");
            }
            else{
                 System.out.print("Question " + questNumber+ ": \n" + 
                         Storage[questNumber][NUM1] + "+" + 
                         Storage[questNumber][NUM2] +" = " + 
                         Storage[questNumber][USER_ANS] + 
                         " (WRONG)-----Correct Answer: " + rightAns+"\n");
            }
        }
        System.out.print("Your total Score is: " + total_score+"/100");
        
    }; 
    public static void main(String[] args){
        createQuiz();
        gradeQuiz();
    }
}
