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
public class ChosenByDestiny extends LureOfTheVoid {
    public ChosenByDestiny()
    {
        super();
        place = 6;
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
        if (movement == 1 ) // cant go right
       {
           movement = roguetradergen.RogueTraderGen.rollDie(2)-2;
       }
        
            if (movement == -1)
        {
            return new roguetradergen.TrailsAndTravails.DarkVoyage();
        }
     
        else 
        {
            return new roguetradergen.TrailsAndTravails.HighVendetta();
        }
    } 
}
