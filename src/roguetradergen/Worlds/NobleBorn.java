/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguetradergen.Worlds;


import roguetradergen.Features.*;
import roguetradergen.Skills.*;
import roguetradergen.Talents.*;
/**
 *
 * @author Hex
 */
public class NobleBorn extends World{
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
    
    @Override
    public  roguetradergen.Skills.Skills[] addSkills()
    {
        Skills[]  skills = new roguetradergen.Skills.Skills[8];
        skills[0] = new Survival();
        return skills;
    }
    
    @Override
    public  Talent[] addTalents()
    {
        Talent[]  talents = new Talent[8];
        return talents;
    }
    
    @Override
    public Features[] addFeatures()
    {
        Features[]  features = new Features[8];
        return features;
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

}
