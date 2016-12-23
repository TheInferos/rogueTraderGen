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
public class Survival extends Skills{
    public Survival()
    {
        super();
        name = "Survival";
        description = "Survival allows the Explorer to endure for prolonged periods\n" +"in unusual or alien environments. A skilled outdoorsman, the\n" +"character can find edible plants, hunt for game, and determine\n" +"if food is safe for consumption. He can also construct viable\n" +"shelters from native materials or improvised substances and\n" +"ensure they’re located away from flood-chutes or the territory\n" +"of predators. The Difficulty of these Tests depends on the\n" +"location—barren deserts provide much greater challenge\n" +"than verdant tropical forests.\n" +"This Skill can also apply to man-made environments, such\n" +"as artificial worlds, the depths of the Underhive, or the belly\n" +"of massive starships. In this case, it can provide safe resting\n" +"areas away from plasma vents and knowledge about which\n" +"sacred unguents also provide minimal nutrition.\n" +"Skill Use: Full Action.";       
        basic = false;
        stat = "Int";
        use = "Exploration";
    }
    
}
