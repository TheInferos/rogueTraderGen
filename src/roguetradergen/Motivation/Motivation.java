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
public abstract class Motivation {
    public int place;
    public Motivation()
    {
        
    }
    public abstract int[] statChanges(int[] stats);
    
    public abstract String[] skillList(String[] skills);
    
    public abstract String[] talentList(String[] talents);
    
    public abstract roguetradergen.Career.Career whereNext(int movement);
    
    public int getPlace()
    {
        return place;
    }
}
