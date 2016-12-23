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
public abstract class Resistance extends Talent{
    public String typeOfResistance;
    public Resistance()
    {
        super();
        description = "The Explorer’s background, experience, training, exposure,\n" +
"or plain stubbornness has inured him to a particular type of\n" +
"hardship. Each time the Explorer selects this Talent, choose\n" +
"one group. He gains a +10 bonus when making Tests to resist\n" +
"the effects of this group. The GM may wish to approve certain\n" +
"choices or have them justified by the character’s past.";
    }
    
}
