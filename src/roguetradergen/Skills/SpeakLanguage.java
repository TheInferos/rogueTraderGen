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
public abstract class SpeakLanguage extends Skills{
    public SpeakLanguage()
    {
        super();
        description= "Speak Language is used to communicate with others\n" +
            "using the same language. The Imperium has nearly as many\n" +
        "languages as it has star systems, but for all this variety, most\n" +
        "people can speak or understand a variation of Low Gothic. In\n" +
        "most situations, Skill Tests are unnecessary so long as those\n" +
        "involved all speak a common tongue. However, communication\n" +
        "with those using obscure dialects or cryptic, complex concepts\n" +
        "will require a Test at an appropriate Difficulty";
    }
    
}
