// Name: Deepmala Bhomi          Date Assigned: 03/24/2020
//
// Course: CSCI 2003 42733       Date Due: 03/31/2020
//
// Instructor: Ms. Greer
//
// File name: Balance.java
//
/* Program Description: This class will stimulate Lottery. This class 
                        includes 3 instance variables, and constructors,setter 
                        and getter methods for each instance variable. This class
                        uses toString method to display values of instance variables.
                        This program has 3 other methods which is called in the main 
                        driver class.*/



/**
   Represents as Balance with the playCounter,
   counter, and winCounter.
*/
public class Balance 
{

   //instance variables
   private int playCounter;
   private int counter;
   private int winCounter;
   
   
   
   //argument constructors
   
   /**
      Initializes the instance variables
   */
   public Balance()
   {
      playCounter = 0;
      counter = 0;
      winCounter = 0;
   }
   
   
   //no argument constructors
   
   /**
      Initializes the instance variables
      @param a Counts number of plays.
      @param b Counts total number of wins. 
      @param c Counts number of wins in the recent game.
      
   */   
   public Balance(int a, int b, int c)
   {
      playCounter = a;
      counter = b;
      winCounter = c;
      
   }

   
   //SETTERS
   
   /**
      Sets playCounter instance variable
      @param a Counts number of plays
   */
   public void setPlayCounter(int a)
   {
      playCounter = a;
   }


   /**
      Sets counter instance variable
      @param b Counts total number of wins.
   */
   public void setCounter(int b)
   {
      counter = b;
   }
   
   
   /**
      Sets winCounter instance variable
      @param c Counts number of wins in recent game.
   */
   public void setWinCounter(int c)
   {
      winCounter = c;
   }

   
   //GETTERS

   /**
      Returns value of instance variable playCounter
      @return total number of plays.
   */
   public int getPlayCounter()
   {
      return playCounter;
   }


   /**
      Returns value of instance variable counter
      @return total number of wins.
   */
   public int getCounter()
   {
      return counter;
   }
   

   /**
      Returns value of instance variable winCounter
      @return number of wins in recent game.
   */
   public int getWinCounter()
   {
      return winCounter;
   }

   //METHODS
   
   /**
      Returns cash won in the recent game
      @return Cash won in the recent game
   */
   public double cashWonInThisGame()
   {
      return (winCounter*50);   
   }


   
   /**
      Returns the total cost of tickets.
      @return Total cost of tickets.
   */
   public double totalTicketCost()
   {
      return (playCounter*10);  
   }
   
   
   
   /**
      Returns the remaining money after balancing money won and total ticket cost.
      @return remaining money after balancing money won and total ticket cost.
   */
   public double calculateMoneyOwed()
   {
      double result = (playCounter*10)-(counter*50);

      return result;
   }


   /**
    * Returns total number of times won and total times played in a well format.
    * @return total number of times won and total times played.
    */
   public String toString()
   { 
      return ("\nTotal times won:           "+ counter +"\nTotal times played:        "+ playCounter);
      
               
   }
   
}         //end class