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
public class Scapegrace extends BirthRight {
        public Scapegrace()
    {
        super();
    }
        public int[] statChanges(int[] stats) //choice of the two pg26 pdf
    {
        stats[5]+=3;
        stats[6]+=3;
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
