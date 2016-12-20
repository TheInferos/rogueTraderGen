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
public class Savant extends BirthRight{
        public Savant()
    {
        super();
    }
        public int[] statChanges(int[] stats) //choice of sats[3] and stats[5] pg26 pdf
    {
        stats[3]-=3;
        stats[5]+=3;
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
    public roguetradergen.LureOfTheVoid.LureOfTheVoid whereNext(int movement)
    {
        if (movement == -1)
        {
            return new roguetradergen.LureOfTheVoid.DutyBound();
        }
        else if(movement == 1)
            {
                return new roguetradergen.LureOfTheVoid.ChosenByDestiny();
            }        
        else 
        {
            return new roguetradergen.LureOfTheVoid.Zealot();
        }
    } 
}