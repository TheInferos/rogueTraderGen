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
public class Charm extends Skills {

    public Charm() {
        name = "Charm";
        description = "The Explorer can use the Charm Skill to improve the disposition\n"
                + "of others towards him, making a Charm Test whenever he\n"
                + "wishes to change the minds of an individual or small group. He\n"
                + "need not make a Charm Test each time he speaks with others\n"
                + "in a pleasant manner, but only when he wishes to change their\n"
                + "opinion, disposition, or convince them to do something.\n"
                + "All Charm Tests are Opposed by Willpower and can affect\n"
                + "a number of targets equal to the Explorer’s Fellowship Bonus.\n"
                + "His targets must be able to see and hear clearly, and share a\n"
                + "common language.\n"
                + "Skill Use: 1 minute"
                + "Special Use: Inspire\n"
                + "Those in a position of authority can use the Charm skill to\n"
                + "inspire a group-related test, either with positive or negative\n"
                + "reinforcement. Success provides a +10 bonus to the next Skill\n"
                + "Test of the motivated group. Thus, the ship’s priest might\n"
                + "inspire the gunnery crews to greater effort, or the Explorator\n"
                + "might speed the efforts of the Tech-adepts under his command\n"
                + "by putting the fear of the Omnissiah into them! When used\n"
                + "on board a starship during combat, this is known as the Put\n"
                + "Your Backs Into It! Action (see page 218).\n"
                + "Characters can also use this skill as an Extended Test for\n"
                + "purposes on improving morale on board their vessel. (See\n"
                + "page 226).";
        basic = true;
        stat = "Fel";
        use = "Combat/ Interaction";
    }

}
