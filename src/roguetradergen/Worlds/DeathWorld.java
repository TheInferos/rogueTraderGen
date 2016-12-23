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
public class DeathWorld extends World{
    
    public DeathWorld()
    {
        super();
        place = 1;
    }
    
    @Override
    public int[] statChanges(int[] statline)
    {
        statline[0] += 5;
        statline[3] += 5;
        statline[7] -= 5;
        statline[8] -= 5;
        statline[9] += 2 +2*getBonus(statline[3]);
        
        return statline;
    }
    
    @Override
    public  roguetradergen.Skills.Skills[] addSkills()
    {
        Skills[]  skills = new roguetradergen.Skills.Skills[1];
        skills[0] = new Survival();
        return skills;
    }
    
    @Override
    public  Talent[] addTalents()
    {
        Talent[]  talents = new Talent[1];
        int roll =roguetradergen.RogueTraderGen.rollDie(2);
        if ( roll == 1)
        {
            talents[1] = new Jaded();
        }
        else
        {
            talents[1] = new ResisitancePoison();
        }
        return talents;
    }
    
    @Override
    public Features[] addFeatures()
    {
        Features[]  features = new Features[2];
        features[0] = new DeathWorldParanoid();
        features[1] = new DeathWorldSurvivor();
        return features;
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
    
    public roguetradergen.BirthRight.BirthRight whereNext(int movement)
    {
       if (movement == -1 ) // cant go left
       {
           movement = roguetradergen.RogueTraderGen.rollDie(2)-1;
       }
        if (movement == 0)
        {
            return new roguetradergen.BirthRight.Scavenger();
        }
        else 
        {
            return new roguetradergen.BirthRight.Scapegrace();
        }
    }

    
}
