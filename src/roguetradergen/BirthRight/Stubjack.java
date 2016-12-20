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
public class Stubjack extends BirthRight {
        public Stubjack()
    {
        super();
    }
        public int[] statChanges(int[] stats) //choice of stats[0] or stats[1] pg 26 pdf
    {
        stats[0]+=5;
        stats[1]+=5;
        stats[8]-=5;
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
            return new roguetradergen.LureOfTheVoid.Criminal();
        }
        else if(movement == 1)
            {
                return new roguetradergen.LureOfTheVoid.DutyBound();
            }        
        else 
        {
            return new roguetradergen.LureOfTheVoid.Renegade();
        }
    } 
}