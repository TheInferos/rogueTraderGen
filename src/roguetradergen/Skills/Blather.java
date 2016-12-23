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
public class Blather extends Skills {

    public Blather() {
        super();
        name = "Blather";
        description = "Blather allows the Explorer to stall for time with a confusing\n"
                + "or distracting stream of conversation. Blather Tests are always\n"
                + "Opposed by the target’s Willpower, or Scrutiny if the target\n"
                + "actively suspects the tactic. Winning the Opposed Test results\n"
                + "in the opponent’s bemused inaction for his entire round. For\n"
                + "every degree of success, the Explorer has dumbfounded the\n"
                + "target for an additional round. Loosing the Opposed Test\n"
                + "means that everyone involved may act normally.\n"
                + "Some Talents allow the Explorer to use Blather against\n"
                + "many opponents. However, even without these Talents, he\n"
                + "can affect a number of targets equal to his Fellowship Bonus\n"
                + "if he is able to win the Opposed Test. If the group shares\n"
                + "similar Characteristics, the GM may roll a single Willpower\n"
                + "Test for the group to save time.\n"
                + "While the Explorer’s opponents may be confused by his\n"
                + "banter, they will not remain inactive in the face of obvious\n"
                + "danger or preparations to harm them. The character and\n"
                + "his target must share a common language or the Test fails\n"
                + "automatically.\n"
                + "Skill Use: Full Action.";
        basic = false;
        stat = "Fel";
        use = "Interaction";
    }

}
