/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rolltwodice;

/**
 *
 * @author barry
 */
public class Rolltwodice {
  
    public static void main(String[] args) {
        int[] pointCount;
        pointCount = new int[13];
        int die1;
        int die2;
        int roll2dice;
        
        
        for(int roll=0;roll<1000;roll++){
            die1 = 1+(int)(Math.random()*6);
            die2 = 1+(int)(Math.random()*6);
            roll2dice = die1+die2;
            pointCount[roll2dice]++;   
        }
        
        System.out.print("1000 dice rolls\n");
        System.out.println("Value\tRolls");
        
        for(int i =2;i<=12;i++){
            System.out.println(i + "\t"+ pointCount[i]);
        }
    }
    
}
