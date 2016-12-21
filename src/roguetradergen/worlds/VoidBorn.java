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
public class VoidBorn extends World{
    public VoidBorn()
    {
        super();
        place = 2;
    }
    
    public  int [] statChanges(int [] statline)
    {
        statline[0] -= 5;
        statline[7] += 5;
        return statline;
    }
    
    public  String[] addSkills(String[] skills)
    {
        return skills;
    }
    
    public  String[] addTalents(String[] talents)
    {
        return talents;
    }
      public roguetradergen.BirthRight.BirthRight whereNext(int movement)
    {
            if (movement == -1)
        {
            return new roguetradergen.BirthRight.Scavenger();
        }
            else if(movement == 1)
            {
                return new roguetradergen.BirthRight.Stubjack();
            }
                
        else 
        {
            return new roguetradergen.BirthRight.Scapegrace();
        }
    }
}

