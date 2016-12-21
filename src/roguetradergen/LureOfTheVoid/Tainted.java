/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguetradergen.LureOfTheVoid;

/**
 *
 * @author Hex
 */
public class Tainted extends LureOfTheVoid {
    
    public Tainted()
    {
        super();
        place = 1;
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
    
    public roguetradergen.TrailsAndTravails.TrailsAndTravails whereNext(int movement)
    {
        if (movement == -1 ) // cant go left
       {
           movement = roguetradergen.RogueTraderGen.rollDie(2)-1;
       }
        if(movement == 1)
        {
            return new roguetradergen.TrailsAndTravails.PressGanged();
        }        
        else 
        {
            return new roguetradergen.TrailsAndTravails.TheHandOfWar();
        }
    } 
}
