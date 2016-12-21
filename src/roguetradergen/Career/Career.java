/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguetradergen.Career;

/**
 *
 * @author Hex
 */
public abstract class Career {
    public int place;
    public Career()
    {
        
    }
    public abstract int[] statChanges(int[] stats);
    
    public abstract String[] skillList(String[] skills);
    
    public abstract String[] talentList(String[] talents);
    
    public int getPlace()
    {
        return place;
    }
}
