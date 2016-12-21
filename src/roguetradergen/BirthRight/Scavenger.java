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
public class Scavenger extends BirthRight {
        public Scavenger()
    {
        super();
        place = 1;
    }
        public int[] statChanges(int[] stats) // choice of the two pg 25 pdf
    {
        int option = roguetradergen.RogueTraderGen.rollDie(2);
        if (option == 1)
        {
            stats[4]+=3;
        }
        else
        {
            stats[7]+=3;
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
        if (movement == -1 ) // cant go left
       {
           movement = roguetradergen.RogueTraderGen.rollDie(2)-1;
       }
        
        if(movement == 1)
            {
                return new roguetradergen.LureOfTheVoid.Criminal();
            }        
        else 
        {
            return new roguetradergen.LureOfTheVoid.Tainted();
        }
    } 
}