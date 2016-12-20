/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rougetradergen;

/**
 *
 * @author Hex
 */
import java.util.Random;
        
public class RougeTraderGen {
    public Ui ui;
    
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //produceUI();
        //rougetradergen.worlds.World test = new rougetradergen.worlds.DeathWorld();
        //System.out.println(test.getClass().getSimpleName());
        //Charecter steve = generateCharecter();
        //steve.printStats();
        int start = 4;
        int goal = 2;
        int steps = 10;
        for (int j = 0; j<10; j++)
        {
            int direction = whichPath(start, goal, steps);
            steps -= 1;
            System.out.println("your startpoint is " + start + " movement " + direction + " endpoint is " + (start+direction) + " goal is " +goal );
            start += direction;
        }
    }
    public static void produceUI()
    {
        Ui ui = new Ui();
        ui.setTitle("RougeTrader Gen");
        ui.setVisible(true);
    }
    
    public static int rollDie(int maxRoll)
    {
        Random rand = new Random();
        return rand.nextInt(maxRoll ) + 1;   
    }
    
    public static int rollSDie(int number, int sides)
    {
        int total = 0;
        for(int j =0; j < number; j ++)
        {
            total += rollDie(sides);
        }
        return total;
    }
    
    public static Charecter generateCharecter()
    {
        int[] statline = new int[9];
        for(int noStat =0; noStat <9; noStat++)
        {
            statline[noStat] = rollSDie(2, 10);
            System.out.println(statline[noStat]);
        }
        Charecter genChar = new Charecter(statline);
        return genChar;
    }
    
    public static int whichPath(int currentNumber, int goalNumber, int stepsLeft )
    {
        int position = 6;
        int distance = unsignIt((currentNumber-goalNumber));
        if (distance < (stepsLeft -1))
        {
            position = rollDie(3) -2;
            
        }
        else if (distance == stepsLeft)
        {
            if(currentNumber-goalNumber > 0)
            {
                position = -1;
            }
            
            else if(currentNumber-goalNumber > 0)
            {
                position = 1;
            }
        }
        else if (distance == (stepsLeft -1))
            if(currentNumber-goalNumber > 0)
            {
                position = rollDie(2)-2;
            }
            
            else if(currentNumber-goalNumber > 0)
            {
                position = rollDie(2)-1;
            }
            else if ((currentNumber == goalNumber) && (goalNumber <= 2))
            {
                position = 0;
            }
            else 
            {
                position = rollDie(3) -2;
            }
                
        return position;
    }
    public static int unsignIt(int number)
    {
        return (int)(Math.sqrt(number*number));
    }
}
