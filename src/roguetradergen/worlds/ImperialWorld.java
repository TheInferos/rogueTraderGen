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
public class ImperialWorld extends World {
    public ImperialWorld()
    {
        super();
    }
    
    public  int [] statChanges(int [] statline)
    {
        statline[7] += 3;
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
            return new roguetradergen.BirthRight.ChildOfTheCreed();
        }
            else if(movement == 1)
            {
                return new roguetradergen.BirthRight.Vaunted();
            }
                
        else 
        {
            return new roguetradergen.BirthRight.Savant();
        }
    }
}
