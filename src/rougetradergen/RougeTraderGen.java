/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rougetradergen;

/**
 *
 * @author Hex
 */
import com.sun.org.apache.bcel.internal.generic.NOP;
import java.util.Random;
public class RougeTraderGen {
    public Ui ui;
    
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //produceUI();
        Charecter steve = generateCharecter();
        steve.printStats();
    }
    public static void produceUI()
    {
        Ui ui = new Ui();
        ui.setTitle("RougeTrader Gen");
        ui.setVisible(true);
    }
    
    public static int rollDie(int maxRoll)
    {
        Random rand = new Random();
        return rand.nextInt(maxRoll ) + 1;   
    }
    
    public static int rollSDie(int number, int sides)
    {
        int total = 0;
        for(int j =0; j < number; j ++)
        {
            total += rollDie(sides);
        }
        return total;
    }
    
    public static Charecter generateCharecter()
    {
        int[] statline = new int[9];
        for(int noStat =0; noStat <9; noStat++)
        {
            statline[noStat] = rollSDie(2, 10);
        }
        Charecter genChar = new Charecter(statline);
        return genChar;
    }
    
}
