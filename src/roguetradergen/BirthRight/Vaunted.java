/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguetradergen.BirthRight;

/**
 *
 * @author Hex
 */
public class Vaunted extends BirthRight {
        public Vaunted()
    {
        super();
    }
        public int[] statChanges(int[] stats) //choice of stats[4] or stats[8] pg 26 pdf
    {
        stats[4]+=3;
        stats[6]-=3;
        stats[8]+=3;
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
