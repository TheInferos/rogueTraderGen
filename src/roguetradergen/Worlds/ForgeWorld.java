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
public class ForgeWorld extends World {
        public ForgeWorld ()
    {
        super();
        place = 3;
    }
    
    public  int [] statChanges(int [] statline)
    {
        statline[0] -= 5;
        statline[5] += 5;
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
            if (movement == -1)
        {
            return new roguetradergen.BirthRight.Scapegrace();
        }
            else if(movement == 1)
            {
                return new roguetradergen.BirthRight.ChildOfTheCreed();
            }
                
        else 
        {
            return new roguetradergen.BirthRight.Stubjack();
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
