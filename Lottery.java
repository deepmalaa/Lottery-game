// Name: Deepmala Bhomi          Date Assigned: 03/24/2020
//
// Course: CSCI 2003 42733       Date Due: 03/31/2020
//
// Instructor: Ms. Greer
//
// File name: Lottery.java
//
/* Program Description: This class stimulates a Lottery game. This program 
                        allows user to enter 3 numbers from 3 different number
                        ranges to make their lotto ticket. Then the program 
                        randomly generates 9 numbers and compares them with the 
                        input. For each matched number, user will win $50. Users
                        can replay the game. Each play of the game costs $10.
                        Finally, the program displays the total money won / owed. */



//importing Scanner class and Random class
import java.util.Scanner;
import java.util.Random;


/**
 * Stimulates a lottery game
 */

public class Lottery 
{
   
   /**
    * Creating main method
      @param args stores command line arguments
    */

   public static void main(String[] args)
   {
   
      //displaying header
      
      System.out.println("  .............................................");
      System.out.println("  :            $$$   LOTTERY   $$$            :");
      System.out.println("  .............................................");
      System.out.println("  :  $$Put your luck on trial and win cash$$  :");
      System.out.println("  .............................................");
      
      
      
      //displaying user interface
      System.out.println("_________________________________________________");
      System.out.println("|                 How to play??                 |");
      System.out.println("_________________________________________________");
      System.out.println("|Step 1: Choose 3 numbers for your lotto ticket.|");
      System.out.println("|Step 2: Random number generator will generate 9|");
      System.out.println("|        numbers. If your ticket has the number |");
      System.out.println("|        then you will win cash.                |");
      System.out.println("|Step 3: 1 win is equal to $50.                 |");
      System.out.println("|Step 4: 1 ticket costs $10.                    |");
      System.out.println("|Step 5: You can play again by entering 'y'.    |");
      System.out.println("_________________________________________________");
      
      
      
      /*  CREATING OBJECTS  */
      
      //creating a Scanner object
      Scanner in = new Scanner(System.in);
      
      //creating random number generator object
      Random generator = new Random();
     
      
      //creating ticket object for LottoTicket class with no argument constructor.
      LottoTicket ticket = new LottoTicket();
      
      //creating balance object for Balance class with no argument constructor.
      Balance balance = new Balance();
      
      
      
      
      
      //asking user to enter their name
      System.out.print("\nEnter your name: "); 
      String player = in.nextLine();
      
      //using setter to set value to instance variable of LottoTicket class.
      ticket.setPlayer(player);
      
      
      
      
      //initilizing variables to use inside the loop
      String ans = "y";
      int counter= 0;            //counts the total number of wins.
      int playCounter = 0;       //counts the number of times the game is played.
      int winCounter = 0;        //counts the number of wins in the latest play.
      
      
      
      
      //initializing a do while loop
      //this loop lets the player to play lottery again when they enter 'y'.
      do{
      
      
         //assigning variable to 0 so that it will count the number of wins in the latest play only.
         winCounter = 0;
         
         
         /* USER INPUTS */
         
         //asking user to enter their choice number for lotto ticket.
         System.out.print("\nEnter a number (20 - 30): ");
         int num1 = in.nextInt();
         
         //using setter to assign value to instance variable of LottoTicket class.
         ticket.setNum1(num1);
      
         
         
         //asking user to enter their choice number for lotto ticket.
         System.out.print("\nEnter a number (10 - 20): ");
         int num2 = in.nextInt();
         
         //using setter to assign value to instance variable of LottoTicket class.
         ticket.setNum2(num2);
      
         
         
         //asking user to enter their choice number for lotto ticket.
         System.out.print("\nEnter a number (30 - 40): ");
         int num3 = in.nextInt();
         
         //using setter to assign value to instance variable of LottoTicket class.
         ticket.setNum3(num3);
         
         
      
         System.out.println();
         
         
         
         //calls inputValidation method from LottoTicket class which returns boolean values.
         if (ticket.inputValidation())
         {
         
            //displaying ticket information
            
            System.out.println("\n+-----------------------------+");
            
            //using toString method from class LottoTicket
            System.out.println(" "+ ticket);
            System.out.println("+-----------------------------+\n");
         
         
         
            
            //initializing loop to generate 9 random numbers
            for (int i=1; i<=9; i++)
            {
            
               //limiting the range from 10 - 40
               int rand = generator.nextInt(30)+10;
            
            
               //displaying randomly generated number
               System.out.println("Randomly Generated number:      "+ rand);
               
            
               //checking if the random number is equal to user input
               if (rand== num1 || rand == num2 || rand == num3)
               {
               
                  //displaying congratulations message if a random number is
                  //equal to user input
                  System.out.println("\n     ***********************");
                  System.out.println("     *  Congratulations!!  *");
                  System.out.println("     ***********************\n");
                  
                  
                  //updating counter variables
                  counter = counter + 1;
                  winCounter = winCounter + 1;
                  
                 
               }     //end if loop
            
            
            }    // end for loop
            
            
            
            
            //displaying message if the player does not wins in the recent play.
            if (winCounter == 0)
            {
               System.out.println("\n==================================");
               System.out.println("=    Better Luck Next Time :(    =");
               System.out.println("==================================");
            
            }
            
            
            
            //updating counter variable
            playCounter +=1;
            
            
            //passing values of counter variables to class Balance using setters
            balance.setWinCounter(winCounter);
            balance.setCounter(counter);
            balance.setPlayCounter(playCounter);
            
         
           
            
            
            
            //displaying cash won and ticket cost information
            System.out.println("\n\n+------------------------------+");
            
            
            //calling methods to display information
            System.out.println(" You won $" + balance.cashWonInThisGame());
         
            System.out.println(" You have won a total of $" + ticket.cashWon(balance));
         
            System.out.println(" Your ticket total is $" + balance.totalTicketCost());
            
            
            System.out.println("+------------------------------+\n\n");
           
            
         
            
            //asking user if they want to plat lottery again
            System.out.print("Would you like to play again? (y/n): ");
            ans = in.next();
            
         }     //end if
          
                
         else
         {
            //displyaing input validation message
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("X  Please enter valid numbers only!!  X");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            
         }     //end else 
         
      
      }       // end do-while loop
      
      
      //using do-while loop to let the player play again if he/she wants to.
      while(ans.equals("y"));
      
      
      
      
      //displaying game summary
      System.out.println("\n==============================");
      System.out.println("         GAME SUMMARY         ");
      System.out.println("==============================");
      
      
      //using getter to get players name from LottoTicket class
      System.out.println("Player name: "+ ticket.getPlayer());
      
      //using toString method to print out game summary information
      System.out.println(balance);
      
      
      System.out.println("------------------------------");
      
      //calling methods of class Balance to display required information
      System.out.printf("%-22s$%5.2f","Total cash won:",ticket.cashWon(balance));
      System.out.printf("\n%-22s$%5.2f","Total ticket cost:",balance.totalTicketCost());
      System.out.println("\n------------------------------");
      System.out.printf("\n%-22s$%5.2f","Total cash owed:", balance.calculateMoneyOwed());
      System.out.println("\n==============================");
      
     
   }        //end main method
   
}       //end class
