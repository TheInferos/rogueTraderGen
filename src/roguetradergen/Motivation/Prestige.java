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
public class Prestige extends Motivation{
    public Prestige()
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
        // choice talented any or peer(one)
        return talents;
    }
    public roguetradergen.Career.Career whereNext(int movement)
    {
        if (movement == -1)
        {
            return new roguetradergen.Career.Seneschal();
        }
        else if(movement == 1)
            {
                return new roguetradergen.Career.RogueTrader();
            }        
        else 
        {
            return new roguetradergen.Career.Navigator();
        }
    }     
}
