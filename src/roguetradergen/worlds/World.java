/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguetradergen.worlds;

/**
 *
 * @author Hex
 */
public abstract class World {
    
    public int place;
    
    public World()
    {
    
    }
    public abstract int [] statChanges(int [] statline);
    
    public abstract String[] addSkills(String[] skills);
    
    public abstract String[] addTalents(String[] talents);
    
    public abstract roguetradergen.BirthRight.BirthRight whereNext(int movement);
    
    public int getPlace()
    {
        return place;
    }
}
