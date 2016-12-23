/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguetradergen.Skills;

/**
 *
 * @author Hex
 */
public class Awareness extends Skills {
    public Awareness()
    {
        super();
        name = "AwarenessS";
        description = "Awareness encompasses the Explorer’s subconscious ability to\n" +
"react to things his conscious mind may not perceive. He can use\n" +
"this Skill to notice threats—such as ambushes, traps, or cleverly\n" +
"hidden objects—or slight changes in the environment—such\n" +
"as a faint vibration in the deck plating or the smell of the air\n" +
"recyclers.\n" +
"When using Awareness against an opponent, the test is\n" +
"always Opposed. This use includes noticing ambushes, spotting\n" +
"traps, and other things involving another’s actions. However,\n" +
"noticing environmental factors is a Standard Test. This use\n" +
"includes perceiving trace scents, motion, or similar things.\n" +
"Skill Use: Free Action made in reaction to something.";
        basic = true;
        stat = "Per";
        use = "Exploration";
    }
    
}
