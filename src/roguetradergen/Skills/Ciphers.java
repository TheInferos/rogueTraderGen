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
// has skill group
public class Ciphers extends Skills {

    public Ciphers() {
        name = "Ciphers";
        description = "Many groups and organizations employ ciphers as a secret,\n"
                + "shorthand code to communicate basic ideas, warnings, or\n"
                + "information rapidly. The Explorer can use and understand the\n"
                + "hand signals, physical markings, or other subtle signs employed\n"
                + "to express these concepts. Skill Tests are not required to either\n"
                + "leave or read basic messages but are necessary to communicate\n"
                + "or decipher complicated meanings or signs obscured by the\n"
                + "passage of time";
        basic = false;
        stat = "Int";
        use = "Investigation";
    }

}
