/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguetradergen;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import roguetradergen.Worlds.*;
import roguetradergen.BirthRight.*;
import roguetradergen.LureOfTheVoid.*;
import roguetradergen.TrailsAndTravails.*;
import roguetradergen.Motivation.*;
import roguetradergen.Career.*;
import roguetradergen.Features.*;
import roguetradergen.Skills.*;
import roguetradergen.Talents.*;
/**
 *
 * @author Hex
 */
public class Charecter {
    public int [] statline;
    public int WeaponSkill;
    public int BallisticSkill;
    public int Strength;
    public int Toughness;
    public int Agility;
    public int Intelligence;
    public int Perception;
    public int Willpower;
    public int Fellowship;
    public int Wounds;
    public int fatePoints;
    public int InsanityPoints;
    public int CorruptionPoints;
    public ArrayList<Talent> talents;
    public ArrayList<Skills> skills;
    public ArrayList<Features> features;
    public World World;
    public BirthRight birthRight;
    public LureOfTheVoid lure;
    public TrailsAndTravails trial;
    public Motivation motivation;
    public Career career;
    public Map<String, Integer> stats;
    
    public Charecter(int[] statline, World homeWorld, BirthRight birthRight, LureOfTheVoid lure, TrailsAndTravails trial,
                   Motivation motivation, Career career)
    {
        stats = new HashMap<String, Integer>();
        talents = new ArrayList<Talent>();
        skills = new ArrayList<Skills>();
        features = new ArrayList<Features>();
        this.statline = statline;
        
        
        setStatline();
        World = homeWorld;
        this.birthRight = birthRight;
        this.lure = lure;
        this.trial = trial;
        this.motivation = motivation;
        this.career = career;
        modStats();
        
        mapStats(stats);

    }
    //potentially unneeded
    public void mapStats(Map<String, Integer> stats)
    {
        stats.put("WS", WeaponSkill);
        stats.put("BS", BallisticSkill);
        stats.put("Str", Strength );
        stats.put("T", Toughness);
        stats.put("Ag", Agility);
        stats.put("Int", Intelligence);
        stats.put("Per", Perception);
        stats.put("Wp", Willpower);
        stats.put("Fel", Fellowship);
    }
    public void setStatline()
    {
        WeaponSkill = 25 +statline[0];
        BallisticSkill = 25 +statline[1];
        Strength = 25 + statline[2];
        Toughness = 25 + statline[3];
        Agility = 25 + statline[4];
        Intelligence = 25 + statline[5];
        Perception = 25 + statline[6];
        Willpower = 25 + statline[7];
        Fellowship = 25 +statline[8];
        Wounds = statline[9];
        fatePoints = statline[10];
        InsanityPoints = statline[11];
        CorruptionPoints = statline[12];
    }

    public void printStats()
    {
        for (Map.Entry<String,Integer> entry : stats.entrySet()) 
        {
                String key = entry.getKey();
                int value = entry.getValue();
                System.out.println("Your " + key + " score is " + value);
        }
    }
    
    public void worldStatChanges(int [] statline)
    {
        World.statChanges(statline);
        if (null != World)
        switch (World.getClass().getSimpleName()) 
        {
            case "DeathWorld":
                Wounds = RogueTraderGen.rollDie(5)+2+2*(getBonus(Toughness));
                break;
            case "VoidBorn":
                Wounds = RogueTraderGen.rollDie(5)+2*(getBonus(Toughness));
                break;
            case "ForgeWorld":
                Wounds = RogueTraderGen.rollDie(5)+1+2*(getBonus(Toughness));
                break;
            case "HiveWorld":
                Wounds = RogueTraderGen.rollDie(5)+ 1+2*(getBonus(Toughness));
                break;
            case "ImperialWorld":
                Wounds = RogueTraderGen.rollDie(5)+2*(getBonus(Toughness));
                break;
            case "NobleBorn":
                Wounds = RogueTraderGen.rollDie(5)+2*(getBonus(Toughness));
                break;                    
            default:
                break;
        }
    }
    public void modStats()
    {
        statline = World.statChanges(statline);
        statline = birthRight.statChanges(statline);
        statline = lure.statChanges(statline);
        statline = trial.statChanges(statline);
        statline = motivation.statChanges(statline);
        statline = career.statChanges(statline);
        setStatline();
        mapStats(stats);
    }
    
    public int getBonus(int stat)
    {
        return stat/10;
    }
    
     public String getOrginPath()
     {
         return "Home World is: " + World.getClass().getSimpleName()+" Birthright is: "+ birthRight.getClass().getSimpleName() + " Lure to the void is: " + lure.getClass().getSimpleName() + " Trial and trevial: " + trial.getClass().getSimpleName()
                 + " their motivation was: " + motivation.getClass().getSimpleName() + " now they've ended up as a " + career.getClass().getSimpleName();
     }
     public void addTalents(ArrayList<Talent> nTalents)
     {
        for (Talent newTalents: nTalents)
        {
            talents.add(newTalents);
        }
     }
     
     public void addSkills(ArrayList<Skills> nSkills)
     {
         for(Skills newSkills: nSkills)
         {
             skills.add(newSkills);
         }
     }
     
     public void addFeatures(ArrayList<Features> nFeatures)
     {
         for (Features newFeatures: nFeatures)
         {
             features.add(newFeatures);
         }
     }
}
