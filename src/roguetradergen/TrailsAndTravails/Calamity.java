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
public class Calamity extends TrailsAndTravails {
    public Calamity()
    {
        super();
        place =3;
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
    
    public roguetradergen.Motivation.Motivation whereNext(int movement)
    {
        if (movement == -1)
        {
            return new roguetradergen.Motivation.Fortune();
        }
        else if(movement == 1)
            {
                return new roguetradergen.Motivation.Vengance();
            }        
        else 
        {
            return new roguetradergen.Motivation.Renown();
        }
    } 
}
