/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguetradergen.TrailsAndTravails;

/**
 *
 * @author Hex
 */
public class DarkVoyage extends TrailsAndTravails {
    public DarkVoyage()
    {
        super();
        place = 5;
    }
    
    public int[] statChanges(int[] stats)
    {
        // 1d5 insanity points
        return stats;
    }
    
    public String[] skillList(String[] skills)
    {
        return skills;
    }
    
    public String[] talentList(String[] talents)
    {
        // survival or dark soul talent
        return talents;
    }
    
    public String[] Other(String[] other)
    {
        
        return other;
    }
    
    public roguetradergen.Motivation.Motivation whereNext(int movement)
    {
        if (movement == -1)
        {
            return new roguetradergen.Motivation.Renown();
        }
        else if(movement == 1)
            {
                return new roguetradergen.Motivation.Prestige();
            }        
        else 
        {
            return new roguetradergen.Motivation.Pride();
        }
    } 
}
