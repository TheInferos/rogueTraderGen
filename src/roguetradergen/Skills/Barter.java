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
public class Barter extends Skills{
    public Barter(){
        name = "Barter";
        description= "";
        stat = "The Barter skill allows the Explorer to negotiate better\n" +
            "prices or exchange for goods and services. This can modify\n" +
            "the Acquisition Modifier for items where the price is not set,\n" +
            "but rather the result of negotiation. Thus, the Explorer could\n" +
            "not use it to change the cost for promethium at an Imperial\n" +
            "Guard depot, but he could definitely use it to haggle with the\n" +
            "representatives of House Dimico over the cost of equipping\n" +
            "his personal guard with handcrafted bolters. All Barter Tests\n" +
            "are Opposed, as they involve interaction by their very nature.\n" +
            "Barter may sometimes be used to assist with Acquisition\n" +
            "Tests (see page 271).\n" +
            "Skill Use: A typical Barter Test takes about five minutes,\n" +
            "but delicate dealings and intricate negotiations may involve\n" +
            "Extended Tests";
        basic = true;
        stat = "Fel";
        use = "Interaction";
    }
    
}
