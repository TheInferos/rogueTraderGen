/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rougetradergen.BirthRight;

/**
 *
 * @author Hex
 */
public class Scavenger extends BirthRight {
        public Scavenger()
    {
        super();
    }
        public int[] statChanges(int[] stats) // choice of the two pg 25 pdf
    {
        stats[4]+=3;
        stats[7]+=3;
        return stats;
    }
    
    public String[] skillList(String[] skills)
    {
        return skills;
    }
    
    public String[] talentList(String[] talents)
    {
        return talents;
    }
}