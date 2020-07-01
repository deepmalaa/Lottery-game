import org.w3c.dom.ls.LSOutput;

import java.util.Random;
public class GamePlay
{
   Random rand = new Random();
   private int dice1;
   private int dice2;
   private int dice3;
   private int dice4;
   private int dice5;
   
   public GamePlay(int d1, int d2, int d3, int d4, int d5)
   {
      dice1 = d1;
      dice2 = d2;
      dice3 = d3;
      dice4 = d4;
      dice5 = d5;
   
   }
   
   
   public GamePlay()
   {
      dice1 = 0;
      dice2 = 0;
      dice3 = 0;
      dice4 = 0;
      dice5 = 0;
   
   }

    public int getDice1() {
        return dice1;
    }

    public void setDice1(int dice1) {
        this.dice1 = dice1;
    }

    public int getDice2() {
        return dice2;
    }

    public void setDice2(int dice2) {
        this.dice2 = dice2;
    }

    public int getDice3() {
        return dice3;
    }

    public void setDice3(int dice3) {
        this.dice3 = dice3;
    }

    public int getDice4() {
        return dice4;
    }

    public void setDice4(int dice4) {
        this.dice4 = dice4;
    }

    public int getDice5() {
        return dice5;
    }

    public void setDice5(int dice5) {
        this.dice5 = dice5;
    }

    /** */
    public int rollDice1()
   {
      return rand.nextInt(5) +1; 
        
    } 
    
    public int rollDice2()
   {
      return rand.nextInt(5) +1; 
       
    }
    
    public int rollDice3()
   {
      return rand.nextInt(5) +1; 
       
    }
   
    public int rollDice4()
   {
       
      return rand.nextInt(5) +1;  
    }
    
    public int rollDice5()
   {
      return rand.nextInt(5) +1 ;  
    }
    
    public int calculateScore()
    {
      return (dice1 + dice2 + dice4 +dice3 + dice5);
    }


    
       
}