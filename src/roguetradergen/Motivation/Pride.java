/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguetradergen.Motivation;

/**
 *
 * @author Hex
 */
public class Pride extends Motivation {
    public Pride()
    {
        super();
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
    public String[] other(String[] gear)
    {
        //heirloom
        return gear;
    }
    public roguetradergen.Career.Career whereNext(int movement)
    {
        if (movement == -1)
        {
            return new roguetradergen.Career.Missionary();
        }
        else if(movement == 1)
            {
                return new roguetradergen.Career.Navigator();
            }        
        else 
        {
            return new roguetradergen.Career.Seneschal();
        }
    } 
}
