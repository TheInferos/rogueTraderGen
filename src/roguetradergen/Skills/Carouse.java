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
public class Carouse extends Skills {

    public Carouse() {
        name = "Carouse";
        description = "The Carouse Skill is used to resist the effects of alcohol and\n"
                + "narcotics. Frequent imbibers can build up quite a tolerance to\n"
                + "inebriants, remaining clear-headed and lucid while those across\n"
                + "the table find their judgement or capabilities diminished. The\n"
                + "Explorer makes a Skill Test whenever he suffers the effects of\n"
                + "alcohol or similar intoxicants.\n"
                + "Each time he would otherwise suffer from the effects of an\n"
                + "intoxicant, make a Carouse Test. Failure indicates he has gained\n"
                + "a level of Fatigue or suffers the side effects of the substance.\n"
                + "Should he lose conscious, the Explorer will remain passed\n"
                + "out for a number of hours equal to 1d10 minus his\n"
                + "Toughness Bonus (minimum 1 hour).\n"
                + "Skill Use: Free Action taken whenever the\n"
                + "Explorer imbibes";
        basic = true;
        stat = "T";
        use = "Combat/ Interaction";
    }

}
