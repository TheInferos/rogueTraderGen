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
public class ChemUse extends Skills {

    public ChemUse() {
        name = "Chem-Use";
        description = "The Chem-Use skill allows the Explorer to safely identify,\n"
                + "handle and prepare a variety of chemicals, toxins, poisons, and\n"
                + "drugs. While Chem-Use covers the use and basic combination\n"
                + "of these substances, the Trade (Chymist) skill deals with their\n"
                + "manufacture from base components.\n"
                + "Success in a Chem-Use Test, modified by the appropriate\n"
                + "difficulty for the chemical or drug in question, indicates it has\n"
                + "been applied correctly for the desired results. Failure indicates\n"
                + "the dose was wasted without effect. See Chapter V: Armoury\n"
                + "for more information on drugs, chemicals, and their effects.\n"
                + "When using a medicae injector or narthecium, the Skill Test\n"
                + "to administer a drug or antidote is reduced to a Half Action.\n"
                + "Employing Chem-Use to apply particularly complex\n"
                + "combinations of substances or toxins uses an Extended Test\n"
                + "of duration and difficulty set by the GM for the treatment in\n"
                + "question.\n"
                + "Skill Use: Full Action.";
        basic = false;
        stat = "Int";
        use = "Investigation";
    }

}
