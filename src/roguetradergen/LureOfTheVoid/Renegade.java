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
public class Renegade extends LureOfTheVoid {
    public Renegade()
    {
        super();
        place = 3;
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
            if (movement == -1)
        {
            return new roguetradergen.TrailsAndTravails.PressGanged();
        }
            else if(movement == 1)
            {
                return new roguetradergen.TrailsAndTravails.ShipLorn();
            }        
        else 
        {
            return new roguetradergen.TrailsAndTravails.Calamity();
        }
    } 
}
