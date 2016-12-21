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
        place = 1;
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
