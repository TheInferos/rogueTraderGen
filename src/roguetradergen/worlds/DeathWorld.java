/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguetradergen.worlds;

/**
 *
 * @author Hex
 */
public class DeathWorld extends World{
    
    public DeathWorld()
    {
        super();
    }
    
    @Override
    public int [] statChanges(int[] statline)
    {
        statline[0] += 5;
        statline[3] += 5;
        statline[7] -= 5;
        statline[8] -= 5;
        return statline;
    }
    
    @Override
    public  String[] addSkills(String[] skills)
    {
        return skills;
    }
    
    @Override
    public  String[] addTalents(String[] Talents)
    {
        return Talents;
    }
    
}
