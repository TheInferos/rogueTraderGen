/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguetradergen;

/**
 *
 * @author Hex
 */
import java.util.Random;
        
public class RogueTraderGen {
    public Ui ui;
    
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //produceUI();
        //roguetradergen.worlds.World test = new roguetradergen.worlds.DeathWorld();
        //System.out.println(test.getClass().getSimpleName());
        //Charecter steve = generateCharecter();
        //steve.printStats();
        roguetradergen.worlds.World world = new roguetradergen.worlds.NobleBorn();
        roguetradergen.Career.Career career = new roguetradergen.Career.VoidMaster();
        generatePathBr2Mot(world, career);
    }
    public static void produceUI()
    {
        Ui ui = new Ui();
        ui.setTitle("RogueTrader Gen");
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
    
    public static void generatePathBr2Mot(roguetradergen.worlds.World homeWorld, roguetradergen.Career.Career chosenCareer)
    {
        roguetradergen.BirthRight.BirthRight birthRight = homeWorld.whereNext(whichPath(homeWorld.getPlace(), chosenCareer.getPlace(), 5));
        roguetradergen.LureOfTheVoid.LureOfTheVoid lure = birthRight.whereNext(whichPath(birthRight.getPlace(), chosenCareer.getPlace(), 4));
        roguetradergen.TrailsAndTravails.TrailsAndTravails trial = lure.whereNext(whichPath(lure.getPlace(), chosenCareer.getPlace(), 3));
        roguetradergen.Motivation.Motivation motivation = trial.whereNext(whichPath(trial.getPlace(), chosenCareer.getPlace(), 2));
        
        System.out.println("your startpoint is " + homeWorld.getClass().getSimpleName() + " Birthright " + birthRight.getClass().getSimpleName() + " Lure  " + lure.getClass().getSimpleName()
                + " trial is " + trial.getClass().getSimpleName() + " motivation is " + motivation.getClass().getSimpleName() + " the career you wanted is " + chosenCareer.getClass().getSimpleName() );
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
            
            else if(currentNumber-goalNumber < 0)
            {
                position = 1;
            }
        }
        else if (distance == (stepsLeft -1))
            if(currentNumber-goalNumber > 0)
            {
                
                position = rollDie(2)-2;
            }
            
            else if(currentNumber-goalNumber < 0)
            {
                position = rollDie(2)-1;
            }
            else if ((currentNumber == goalNumber) && (goalNumber <= 1))
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
