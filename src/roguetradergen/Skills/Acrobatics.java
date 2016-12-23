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
public class Acrobatics  extends Skills {
    public Acrobatics()
    {
        super();
        name = "Acrobatics";
        description = "Acrobatics training supplements the Explorer’s natural agility to\n" +"perform feats the less athletic would not even consider. Leaping\n" +"between catwalks in the enginarium and flipping over the heads\n" +"of shorter foes is possible with this skill. The difficulty of the\n" +"Test depends on the difficulty of the feat involved: dodging\n" +"around the legs of an enraged xeno and leaping from stone to\n" +"stone in a swirling magma flow would both present significant\n" +"challenges. The more Degrees of Success obtained, the more\n" +"stylish or dramatic the end result.\n" +"Skill Use: Full Action unless otherwise noted.\n" +"Special Use: Disengage\n" +"When taking the Disengage Action in combat, the Explorer\n" +"may make an Acrobatics Test to reduce it to a Half Action"+"Special Use: Jump & Leap\n" +"An Acrobatics Test may substitute for an Agility Test when\n" +"jumping or a Strength Test when leaping, according to the\n" +"appropriate rules on page 266.";
        basic = false;
        stat = "Ag";
        use = "Movement, Combat";
    }
}
