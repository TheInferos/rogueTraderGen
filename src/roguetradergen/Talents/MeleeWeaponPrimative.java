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
public class MeleeWeaponPrimative extends WeaponTraining {
    
    public MeleeWeaponPrimative()
    {
        super();
        name = "Melee Weapon Traiing (Primative)";
        description = "The Explorer has trained extensively with hand-to-hand\n" +
            "weaponry, becoming proficient in the use of virtually all primative\n" +
            "hand-held close combat arms. When a character attempts to\n" +
            "use a weapon he does not have the correct Weapon Training\n" +
            "Talent for, he suffers a –20 penalty to any relevant Weapon\n" +
            "Skill or Ballistic Skill Test";
        ranged = false;
        group  = "Primative";
    }
    
}
