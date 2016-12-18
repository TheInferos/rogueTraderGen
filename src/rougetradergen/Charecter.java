/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rougetradergen;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.CaseInsensitiveMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author Hex
 */
public class Charecter {
    public int WeaponSkill;
    public int BallisticSkill;
    public int Strength;
    public int Toughness;
    public int Agility;
    public int Intelligence;
    public int Perception;
    public int Willpower;
    public int Fellowship;
    public String World;
    public  Map<String, Integer> stats;
    
    public Charecter(int[] statline)
    {
        setStatline(statline);
        worldStatChanges();
        stats = new HashMap<String, Integer>();

    }
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
    public void setStatline(int [] statline)
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
    
    public void worldStatChanges()
    {
        if (null != World)
        switch (World) {
            case "Death World":
                Strength += 5;
                Toughness += 5;
                Willpower -= 5;
                Fellowship -= 5;
                break;
            case "Void Born":
                Strength -= 5;
                Willpower += 5;
                break;
            case "Forge World":
                WeaponSkill -= 5;
                Intelligence += 5;
                break;
            case "Hive World":
                Toughness -= 5;
                Fellowship += 5;
                break;
            case "Imperial World":
                Willpower += 3;
                break;
            case "Noble Born":
                Willpower -= 5;
                Fellowship +=5;
                break;
                    
            default:
                break;
        }
    }
}
