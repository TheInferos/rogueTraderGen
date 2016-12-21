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
public class ChildOfTheCreed extends BirthRight {
    public ChildOfTheCreed()
    {
        super();
        place = 4;
    }
    
    public int[] statChanges(int[] stats) //Choice between stats[7] and stats[8] pg26 pdf
    {
        stats[0]-=3;
        int option = roguetradergen.RogueTraderGen.rollDie(2);
        if (option == 1)
        {
            stats[7]+=3;
        }
        else{
            stats[8]+=3;
        }
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
    public roguetradergen.LureOfTheVoid.LureOfTheVoid whereNext(int movement)
    {
            if (movement == -1)
        {
            return new roguetradergen.LureOfTheVoid.Renegade();
        }
            else if(movement == 1)
            {
                return new roguetradergen.LureOfTheVoid.Zealot();
            }        
        else 
        {
            return new roguetradergen.LureOfTheVoid.DutyBound();
        }
    } 

}