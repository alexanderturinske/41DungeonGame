/******************************************************************
 * DungeonBoardSystem.java
 * Alexander James Turinske
 *
 * This is the prgram for the dungeon board system.
 * *****************************************************************/

import java.util.Scanner;

public class DungeonBoardSystem
{
  private DungeonBoard game = new DungeonBoard();
  private Scanner stdIn = new Scanner(System.in);
  private String input;
  private int charLocationX;
  private int charLocationY; 
  
  //*****************************************************************

  public void move()
  {
    game.drawBoard(charLocationY,charLocationX);
    game.getBoard();

    do
    {
      System.out.println("Move left (h), move right (l), move down (j)," +
        " move up (k), or (q)uit? ");
      input = stdIn.next();
      if (input.equalsIgnoreCase("h") && !(charLocationX == 0))
      {
        charLocationX --;
        game.drawBoard(charLocationY,charLocationX);
        game.getBoard();
      }
      else if (input.equalsIgnoreCase("l") && !(charLocationX == 9))
      {
        charLocationX ++;
        game.drawBoard(charLocationY,charLocationX);
        game.getBoard();
      }
      else if (input.equalsIgnoreCase("j") && !(charLocationY == 9))
      {
        charLocationY ++;
        game.drawBoard(charLocationY,charLocationX);
        game.getBoard();
      }
      else if (input.equalsIgnoreCase("k") && !(charLocationY == 0))
      {
        charLocationY --;
        game.drawBoard(charLocationY,charLocationX);
        game.getBoard();
      }
      else if ((input.equalsIgnoreCase("h") && charLocationX == 0) || 
               (input.equalsIgnoreCase("l") && charLocationX == 9) ||
               (input.equalsIgnoreCase("j") && charLocationY == 9) || 
               (input.equalsIgnoreCase("k") && charLocationY == 0)) 
      {
        System.out.println("You can't move out off the board!");
        game.getBoard();
      }
      else if (input.equalsIgnoreCase("q"))
      {
        System.out.println("Thanks for playing!");
      }
      else
      {
        System.out.println("That is an invalid entry!");
        game.getBoard();
      }
    } while (!input.equalsIgnoreCase("q")); // end while loop
  } // end move method
} // end DungeonBoardSystem class 
