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
        place = 2;
    }
        public int[] statChanges(int[] stats) //choice of the two pg26 pdf
    {
        int option = roguetradergen.RogueTraderGen.rollDie(2);
        if (option == 1)
        {
        stats[5]+=3;
        }
        else{
        stats[6]+=3;
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
            return new roguetradergen.LureOfTheVoid.Tainted();
        }
        else if(movement == 1)
            {
                return new roguetradergen.LureOfTheVoid.Renegade();
            }        
        else 
        {
            return new roguetradergen.LureOfTheVoid.Criminal();
        }
    } 
}
