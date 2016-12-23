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
public abstract class NobleBorn extends World{
    public NobleBorn()
    {
        super();
        place = 6;
    }
    
    public  int [] statChanges(int [] statline)
    {
        statline[7] -= 5;
        statline[8] += 5;
        return statline;
    }
    
    public  String[] addSkills(String[] skills)
    {
        return skills;
    }
    
    public  String[] addTalents(String[] talents)
    {
        return talents;
    }

    public roguetradergen.BirthRight.BirthRight whereNext(int movement)
    {
       if (movement == 1 ) // cant go right
       {
           movement = roguetradergen.RogueTraderGen.rollDie(2)-2;
       }
        if (movement == 0)
        {
            return new roguetradergen.BirthRight.Vaunted();
        }
        else 
        {
            return new roguetradergen.BirthRight.Savant();
        }
    }
    
    @Override
    public int setFP(int [] statline)
    {
        int roll = roguetradergen.RogueTraderGen.rollDie(10);
        if (roll <= 5)
        {
            return 2;
        }
        else
        {
            return 3;
        }
    }

    public abstract Features[] addFeatures();
}
