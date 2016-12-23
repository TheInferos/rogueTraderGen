/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguetradergen.Worlds;

import roguetradergen.Features.*;
import roguetradergen.Skills.*;
import roguetradergen.Talents.*;
import roguetradergen.BirthRight.*;



/**
 *
 * @author Hex
 */
public class VoidBorn extends World{
    public VoidBorn()
    {
        super();
        place = 2;
    }
    
    @Override
    public  int [] statChanges(int [] statline)
    {
        statline[0] -= 5;
        statline[7] += 5;
        return statline;
    }
    
    @Override
    public Skills[] addSkills()
    {
        Skills[]  skills = new Skills[8];
        skills[0] = new SpeakLanguageShipDialect();
        return skills;
    }
    
    @Override
    public Talent[] addTalents()
    {
        Talent[]  talents = new Talent[8];
        return talents;
    }
    
    @Override
    public Features[] addFeatures()
    {
        Features[]  features = new Features[8];
        features[0] = new Charmed();
        features[1] = new IllOmened();
        return features;
    }
    
    @Override
      public BirthRight whereNext(int movement)
    {
        switch (movement) {
            case -1:
                return new Scavenger();
            case 1:
                return new Stubjack();
            default:
                return new Scapegrace();
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

