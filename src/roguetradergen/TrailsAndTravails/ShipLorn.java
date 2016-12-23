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
public class ShipLorn extends TrailsAndTravails {
    public ShipLorn()
    {
        super();
        place = 4;
    }
    
    public int[] statChanges(int[] stats)
    {
        return stats;
    }
    
    public String[] skillList(String[] skills)
    {
        return skills;
    }
    
    public String[] talentList(String[] talents)
    {
        return talents;
    }
    public String[] other(String[] other)
    {
        //reroll wound recovery fate point dices.
        return other;
    }
    
    public roguetradergen.Motivation.Motivation whereNext(int movement)
    {
        if (movement == -1)
        {
            return new roguetradergen.Motivation.Vengeance();
        }
        else if(movement == 1)
            {
                return new roguetradergen.Motivation.Pride();
            }        
        else 
        {
            return new roguetradergen.Motivation.Renown();
        }
    } 
}
