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
public class Vengeance extends Motivation {
    public Vengeance()
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
        // hated(any one)
        return talents;
    }
    public roguetradergen.Career.Career whereNext(int movement)
    {
        if (movement == -1)
        {
            return new roguetradergen.Career.VoidMaster();
        }
        else if(movement == 1)
            {
                return new roguetradergen.Career.Missionary();
            }        
        else 
        {
            return new roguetradergen.Career.Explorator();
        }
    } 
    
}
