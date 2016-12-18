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
import java.util.Random;
public class RougeTraderGen {
    public Ui ui;
    
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        produceUI();
        System.out.println(rollDie(20));
        
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
    
}
