import java.util.Scanner;
public class Yahtzee
{
   public static void main(String[] args)
   {
      GamePlay player1 = new GamePlay();
      //ScoreCard score = new ScoreCard();
      
      Scanner in = new Scanner(System.in);
      
      
      System.out.println("Lets Play Yahtzee!");
      System.out.println("==================\n");
      
      
      int dice1 = 0;
      int dice2 = 0;
      int dice3 = 0;
      int dice4 = 0;
      int dice5 = 0;
      
      int dice=0;
      
      System.out.print("Enter dice to reroll ( 1 - 5 ): ");
      
      while (in.hasNextInt())
      {
         dice = in.nextInt();
         
         if (dice == 1 )
         {
            dice1 = player1.rollDice1();
            player1.setDice1(dice1);
         }
         
         if (dice == 2 )
         {
            dice2 = player1.rollDice2();
            player1.setDice2(dice2);
         }
         
         if (dice == 3 )
         {
            dice3 = player1.rollDice3();
            player1.setDice3(dice3);
         }
         
         if (dice == 4 )
         {
            dice4 = player1.rollDice4();
            player1.setDice4(dice4);
         }
         
         if (dice == 5 )
         {
            dice5 = player1.rollDice5();
            player1.setDice5(dice5);
         }


      }


   }
   
}