/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguetradergen.worlds;

import roguetradergen.Features.*;
import roguetradergen.Skills.*;
import roguetradergen.Talents.*;

/**
 *
 * @author Hex
 */
public abstract class World {
    
    public int place;
    
    public World()
    {
    
    }
    public abstract int[] statChanges(int [] statline);
    
    public abstract Skills[] addSkills();
    
    public abstract Talent[] addTalents();
    
    public abstract Features[] addFeatures();
    
    
    public abstract roguetradergen.BirthRight.BirthRight whereNext(int movement);
    
    public abstract int setFP(int [] statline);
    
    public int getPlace()
    {
        return place;
    }
    public int getBonus(int stat)
    {
        return stat/10;
    }
}
