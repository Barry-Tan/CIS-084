/*
PlayersonTram
Jingwen Tan
02/014/2020
CIS084 Java Programming
*/
package javaplayersonteam;
import java.util.Scanner;


public class javaplayersonteam {
    
    //global variables
    static Scanner stdin; //still needs to be initialized as an object
    
    public static void main(String[] args){
        int teamSize;
        int playersOnTeam;
        int morePlayersNeeded;
        int extraPlayers;
        
        //Create the Scanner object. Name it stdin
        stdin = new Scanner(System.in);
        
        //Input the data
        teamSize = SelectTeamSize(); // use function shown below
        System.out.println("There should be " + teamSize + " players");
        playersOnTeam = stdin.nextInt();
        
        //Process and otput
        if (playersOnTeam < teamSize)
        {
            System.out.println("There are not enough players");
            morePlayersNeeded = teamSize - playersOnTeam;
            System.out.println (morePlayersNeeded + " more players are needed");
        }
        else if(playersOnTeam > teamSize)
        {
            System.out.println("There are too many players");
            extraPlayers = playersOnTeam - teamSize;
            System.out.println(extraPlayers +" players need to be removed");
        }
        else
        {
            System.out.println("You have the correct number of players\n");
        }
    } // end of public static void main(String[] args)
    
 ///////////////////////////////////////////////////////////////////////////////
  // SelectTeamSize() is a function that returns the size of a team
 //  based on the user's selectic of a team sport
  static int SelectTeamSize()
    {
        int teamSelection; // team selection entered at the keyboard 1-4
        int teamSize;      // return # players that should be on a team
        
        do {
                 // display a menu of team sports
                System.out.println ("Select a professional sport");
                System.out.println ("1 - NFL Football");
                System.out.println ("2 - NBA Basketball");
                System.out.println ("3 - MLB Baseball");
                System.out.println ("4 - HOCKEY");
                System.out.println ("5 - Lacrosse");
                teamSelection = stdin.nextInt();
                
                if(teamSelection == 1)
                    teamSize = 53; // NFL
                else if (teamSelection == 2)
                    teamSize = 13; //NBA
                else if (teamSelection == 3)
                    teamSize = 25; //MLB
                else if (teamSelection == 4)
                    teamSize = 23; //hockey
                else if (teamSelection == 5)
                    teamSize = 12; //lacrosse
                else
                {
                    System.out.println("Illegal selection - try again");
                    teamSize = 0; //error flag
                }
            } while (teamSize == 0); // loop until a vaild selection is made
            
        return teamSize;    // to be used by the main program
     } // end of static int SelectTeamSize()
}   // end of class JavaPlayersOnTram


