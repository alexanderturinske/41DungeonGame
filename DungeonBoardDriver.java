/*************************************************************************
* DungeonBoardDriver.java
* Alexander James Turinske
*
* This program creates a GUI display of CRC cards
***************************************************************************/

import java.util.Scanner;
import javax.swing.*;     // for JFrame, JTextArea, & JSplitFrame

public class DungeonBoardDriver 
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
    String input;
    DungeonBoardSystem game = new DungeonBoardSystem();

//    System.out.print("Play the game or (q)uit: ");   // user starts the game
//    input = stdIn.nextLine(); 
    game.move();      // play game
  } // end main method
} // end DungeonBoardDriver class
