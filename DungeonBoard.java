/****************************************************************
* DungeonBoard.java
* Alexander James Turinske
*
* This draws a game board 
****************************************************************/

import java.util.Scanner;

public class DungeonBoard
{
  private String[][] board = new String[10][10];
  private int gameBoardSize = 10;
  private String character = "C ";
  private int charLocationX = 0;
  private int charLocationY = 0;

  //**************************************************************
/* This method hasn't been implemented yet 
  public void setBoardSize(int gameBoardSize)
  {
    this.gameBoardSize = gameBoardSize;
    board = new String[this.gameBoardSize][this.gameBoardSize];
  }
*/
  //***************************************************************

  public void getBoard() 
  {
    for (String[] elements1D : board)
    {
      for (String elements : elements1D)
      {
        System.out.print(elements);
      }
      System.out.println();
    }
    System.out.println();
  }  
 
  //****************************************************************

  public void drawBoard(int charLocationX, int charLocationY)
  {
    this.charLocationX = charLocationX;
    this.charLocationY = charLocationY;
 
    // reset every element in board array to *  
    for (String[] elements1D : board)
    {
      for (String elements : elements1D)
      {
        elements = "* ";
      }
    }

    // set every element in board array to either C or *
    for (int j=0; j<board.length; j++)
    {
      for (int i=0; i<board.length; i++)
      {
        if (j == charLocationY)
        {
          if (i == charLocationX)
          {
            board[i][j] = character;
          }
          else
          {
            board[i][j] = "* ";
          }
        }
        else
        {
          board[i][j] = "* ";
        }
      }
    }
  } // end drawBoard method

  public static void main(String[] args)
  {
    DungeonBoard board = new DungeonBoard();
    board.drawBoard(0,0);
    board.getBoard();
  }

} // end DungeonBoard class
