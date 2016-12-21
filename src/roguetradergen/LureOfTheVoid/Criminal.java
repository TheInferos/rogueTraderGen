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
public class Criminal extends LureOfTheVoid{
    public Criminal()
    {
        super();
        place = 2;
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
            return new roguetradergen.TrailsAndTravails.TheHandOfWar();
        }
            else if(movement == 1)
            {
                return new roguetradergen.TrailsAndTravails.Calamity();
            }        
        else 
        {
            return new roguetradergen.TrailsAndTravails.PressGanged();
        }
    } 
}
