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
public class HighVendetta extends TrailsAndTravails {
    public HighVendetta()
    {
        super();
    }
    
    public int[] statChanges(int[] stats)
    {
        return stats;
    }
    
    public String[] skillList(String[] skills)
    {
        //inquiry skill or +10
        return skills;
    }
    
    public String[] talentList(String[] talents)
    {
        // chpoice diehard or paranoia
        return talents;
    }
    public String[] otherBits(String[] other)
    {
        return other;
    }
}
