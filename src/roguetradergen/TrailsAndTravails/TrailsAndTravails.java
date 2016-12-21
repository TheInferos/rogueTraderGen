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
public abstract class TrailsAndTravails {
    
    public int place;
    
    public TrailsAndTravails()
    {
    
    }
    public abstract int [] statChanges(int [] statline);
    
    public abstract String[] skillList(String[] skills);
    
    public abstract String[] talentList(String[] talents);
    
    public abstract roguetradergen.Motivation.Motivation whereNext(int movement);
    
    public int getPlace()
    {
        return place;
    }
}
