/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguetradergen.Talents;

/**
 *
 * @author Hex
 */
public class Jaded extends Talent{
    public Jaded()
    {
        super();
        name = "Jaded";
        description = "The Explorer’s wide travels have shown both wonders and\n" +
            "horrors beyond the ken of most. The galaxy has thrown its\n" +
            "worst at him and he has yet to flinch. Outrageous events, from\n" +
            "death’s horrific visage to xenos abominations, will not cause\n" +
            "Insanity Points or Fear Tests. Terrors of the Warp still affect\n" +
            "the character normally";         
    }
    
    public boolean prerequisites()
    {
        //willpower >=30
        return true;
    }
}
