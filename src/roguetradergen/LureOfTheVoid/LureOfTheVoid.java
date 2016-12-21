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
public abstract class LureOfTheVoid {
    public int place;
    public LureOfTheVoid()
    {
        
    }
    public abstract int[] statChanges(int[] stats);
    
    public abstract String[] skillList(String[] skills);
    
    public abstract String[] talentList(String[] talents);
    
    public abstract roguetradergen.TrailsAndTravails.TrailsAndTravails whereNext(int movement);
    
    public int getPlace()
    {
        return place;
    }
}
