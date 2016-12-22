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
        /*
        roguetradergen.worlds.World World = randomStartWorld();
        roguetradergen.Career.Career career = new roguetradergen.Career.VoidMaster();
        Charecter genChar = generateCharecterBr2Mo(World, career);
        genChar.modStats();
        genChar.printStats();
        */
        
        Charecter genChar = generateCharacterAll();
        System.out.print(genChar.getOrginPath()) ;
        genChar.printStats();
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
    
    public static Charecter generateCharacterAll()
    {
     int[] stats = generateCStats();
        roguetradergen.worlds.World World = randomStartWorld();
        roguetradergen.BirthRight.BirthRight birthRight = generateBirthRight(World, -1, 5);
        roguetradergen.LureOfTheVoid.LureOfTheVoid lure =generateLure(birthRight, -1, 4);
        roguetradergen.TrailsAndTravails.TrailsAndTravails trial =generateTrial(lure, -1, 3);
        roguetradergen.Motivation.Motivation motivation = generateMotivation(trial, -1, 2);
        roguetradergen.Career.Career career = generateCareer(motivation, -1, 1);
        Charecter genChar = new Charecter(stats,World,birthRight, lure, trial, motivation, career);
        return genChar;
    }
    
    public static Charecter generateCharecterBr2Mo(roguetradergen.worlds.World World, roguetradergen.Career.Career career)
    {
        int[] statline = generateCStats();
        roguetradergen.BirthRight.BirthRight birthRight = generateBirthRight(World, career.getPlace(), 5);
        roguetradergen.LureOfTheVoid.LureOfTheVoid lure =generateLure(birthRight, career.getPlace(), 4);
        roguetradergen.TrailsAndTravails.TrailsAndTravails trial =generateTrial(lure, career.getPlace(), 3);
        roguetradergen.Motivation.Motivation motivation = generateMotivation(trial, career.getPlace(), 2);

        
        Charecter genChar = new Charecter(statline,World,birthRight, lure, trial, motivation, career);
        return genChar;
    }
    
    public static roguetradergen.BirthRight.BirthRight generateBirthRight(roguetradergen.worlds.World homeWorld, int goal, int steps)
    {
         return homeWorld.whereNext(whichPath(homeWorld.getPlace(), goal, steps));
    }
    
    public static roguetradergen.LureOfTheVoid.LureOfTheVoid generateLure(roguetradergen.BirthRight.BirthRight birthRight, int goal, int steps)
    {
         return birthRight.whereNext(whichPath(birthRight.getPlace(), goal, steps));
    }
    
    public static roguetradergen.TrailsAndTravails.TrailsAndTravails generateTrial(roguetradergen.LureOfTheVoid.LureOfTheVoid lure, int goal, int steps)
    {
         return lure.whereNext(whichPath(lure.getPlace(), goal, steps));
    }
    
    public static roguetradergen.Motivation.Motivation generateMotivation (roguetradergen.TrailsAndTravails.TrailsAndTravails trial, int goal, int steps)
    {
         return trial.whereNext(whichPath(trial.getPlace(), goal, steps));
    }
    
    public static roguetradergen.Career.Career generateCareer(roguetradergen.Motivation.Motivation motivation, int goal, int steps)
    {
         return motivation.whereNext(whichPath(motivation.getPlace(), goal, steps));
    }

    public static roguetradergen.worlds.World randomStartWorld()
    {
       
        int choice = rollDie(6);
        switch(choice){
            case 1:
                 return new roguetradergen.worlds.DeathWorld();
            case 2:
                 return new roguetradergen.worlds.VoidBorn();   
            case 3:
                 return new roguetradergen.worlds.ForgeWorld();
            case 4:
                 return new roguetradergen.worlds.HiveWorld();
            case 5:
                 return new roguetradergen.worlds.ImperialWorld();
            case 6:
                 return new roguetradergen.worlds.NobleBorn();
            default:
                return new roguetradergen.worlds.HiveWorld();

        }
                 
    }
     
    public static int whichPath(int currentNumber, int goalNumber, int stepsLeft )
    {
        int position = 6;
        int distance = unsignIt((currentNumber-goalNumber));
        if (goalNumber == -1)
        {
            position = rollDie(3) -2; 
        }
            
        else if (distance < (stepsLeft -1))
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
    
    public static int [] generateCStats()
    {
        int[] statline = new int[13];
        for(int noStat =0; noStat <9; noStat++)
        {
            statline[noStat] = rollSDie(2, 10);
        }
        statline[9] = rollDie(5);
        statline[10] = rollDie(10); 
        return  statline;
    }
}
