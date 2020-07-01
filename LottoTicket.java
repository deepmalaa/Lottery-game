// Name: Deepmala Bhomi          Date Assigned: 03/24/2020
//
// Course: CSCI 2003 42733       Date Due: 03/31/2020
//
// Instructor: Ms. Greer
//
// File name: LottoTicket.java
//
/* Program Description: This class will stimulate Lottery. This class 
                        includes 5 instance variables, and constructors,setter 
                        and getter methods for each instance variable. This class
                        uses toString method to display values of instance variables.
                        This program has 2 other methods. Method inputValidation 
                        checks to see if the user input is within the range or not.
                        Method cashWon works with object of class Balance to calculate
 
                        total cash won by the player.*/

/**
   Represents as LottoTicket with the player,
   num1, num2 and num3.
*/
public class LottoTicket
{
   
   
   //instance variables
   private String player;
   private int num1;
   private int num2;
   private int num3;
   private int counter;

   
   
   //argument constructors
   /**
      Initializes the instance variables
   */
   public LottoTicket()
   {
      player = "";
      num1 = 0;
      num2 = 0;
      num3 = 0;
      counter = 0;
   }
   
   
   
   //no argument constructors
   
   /**
      Initializes the instance variables
      @param s Name of the player.
      @param a Player's first choice number.
      @param b Player's second choice number. 
      @param c Player's third choice number.
      @param d Total number of Wins.
      
   */
   public LottoTicket(String s, int a, int b, int c, int d)
   {
      player = s;
      num1 = a;
      num2 = b;
      num3 = c;
      counter = d;
   
      
   }

   //SETTERS
   
   
   /**
      Sets player instance variable
      @param s Name of the player. 
   */
   public void setPlayer(String s)
   {
      player = s;
   }
   
   
   /**
      Sets num1 instance variable
      @param a Player's first choice number. 
   */
   public void setNum1(int a)
   {
      num1 = a;
   }
   
   
   /**
      Sets num2 instance variable
      @param b Player's second choice number. 
   */
   public void setNum2(int b)
   {
      num2 = b;
   }
   
   
   /**
      Sets num3 instance variable
      @param c Player's third choice number. 
   */
   public void setNum3(int c)
   {
      num3 = c;
   }
   
   
   /**
      Sets counter instance variable
      @param d counts total number of wins. 
   */
   public void setCounter(int d)
   {
      counter = d;
   }


   
   //GETTERS

   /**
      Returns value of instance variable player
      @return player's name.
   */

   public String getPlayer()
   {
      return player;
   }
   
   
   /**
      Returns value of instance variable num1.
      @return player's first choice number.
   */
   public int getNum1()
   {
      return num1;
   }
   
   
   /**
      Returns value of instance variable num2.
      @return player's second choice number. 
   */
   public int getNum2()
   {
      return num2;
   }
   
   
   /**
      Returns value of instance variable num3.
      @return player's third choice number.
   */
   public int getNum3()
   {
      return num3;
   }


   /**
      Returns value of instance variable counter.
      @return total number of wins.
   */
   public int getCounter()
   {
      return counter;
   }

   
   //METHODS

   /**
    * Returns string containing lotto ticket number.
    * @return string containing lotto ticket number.
    */
   public String toString()
   {
      return "Your lotto ticket is " +num1 +" "+ num2 +" "+ num3 +".";
   }


   
   /**
      Returns boolean value true or false.
      @return boolean value true or false.
   */
   public boolean inputValidation()
   {
      //checking if the user entered numbers are on the range or not.
      if( (num1 <=30 && num1>=20) && (num2 <=20 && num2>=10) && (num3<=40 && num3>=30))
      {
         return true;  
      }
      else
      {  
         return false;
      }
   }



   /**
    * Returns total cash won.
    * @param balance works with object of another class
    * @return total cash won.
    */
   public double cashWon( Balance balance)
   {
      return (balance.getCounter()*50);
   }
   

}           //end class