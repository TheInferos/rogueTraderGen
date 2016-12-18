/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rougetradergen;

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
    public  Map<String, Integer> stats;
    
    public Charecter()
    {
        
        System.out.println(stats.get("WS"));
    }
    public void setMap()
    {
        Map<String, Integer> stats = new HashMap<String, Integer>();
        stats.put("WS", WeaponSkill);
        stats.put("AG", Agility);
        stats.put("BS", BallisticSkill);
        stats.put("Int", Intelligence );
        stats.put("Per", Perception);
    }
}
