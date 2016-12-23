/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguetradergen;

/**
 *
 * @author Hex
 */
import java.util.Random;
import roguetradergen.Worlds.*;
import roguetradergen.BirthRight.*;
import roguetradergen.LureOfTheVoid.*;
import roguetradergen.TrailsAndTravails.*;
import roguetradergen.Motivation.*;
import roguetradergen.Career.*;
import roguetradergen.Features.*;
import roguetradergen.Skills.*;
import roguetradergen.Talents.*;

public class RogueTraderGen {

    public Ui ui;

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //produceUI();
        //roguetradergen.worlds.World test = new roguetradergen.worlds.DeathWorld();
        //System.out.println(test.getClass().getSimpleName());
        /*
        roguetradergen.worlds.World World = randomStartWorld();
        roguetradergen.Career.Career career = new roguetradergen.Career.VoidMaster();
        Charecter genChar = generateCharecterBr2Mo(World, career);
        genChar.modStats();
        genChar.printStats();
         */

        Charecter genChar = generateCharacterAll();
        System.out.print(genChar.getOrginPath());
        genChar.printStats();
    }

    public static void produceUI() {
        Ui ui = new Ui();
        ui.setTitle("RogueTrader Gen");
        ui.setVisible(true);
    }

    public static int rollDie(int maxRoll) {
        Random rand = new Random();
        return rand.nextInt(maxRoll) + 1;
    }

    public static int rollSDie(int number, int sides) {
        int total = 0;
        for (int j = 0; j < number; j++) {
            total += rollDie(sides);
        }
        return total;
    }

    public static Charecter generateCharacterAll() {
        int[] stats = generateCStats();
        World World = randomStartWorld();
        BirthRight birthRight = generateBirthRight(World, -1, 5);
        LureOfTheVoid lure = generateLure(birthRight, -1, 4);
        TrailsAndTravails trial = generateTrial(lure, -1, 3);
        Motivation motivation = generateMotivation(trial, -1, 2);
        Career career = generateCareer(motivation, -1, 1);
        Charecter genChar = new Charecter(stats, World, birthRight, lure, trial, motivation, career);
        return genChar;
    }

    public static Charecter generateCharecterBr2Mo(roguetradergen.Worlds.World World, roguetradergen.Career.Career career) {
        int[] statline = generateCStats();
        BirthRight birthRight = generateBirthRight(World, career.getPlace(), 5);
        LureOfTheVoid lure = generateLure(birthRight, career.getPlace(), 4);
        TrailsAndTravails trial = generateTrial(lure, career.getPlace(), 3);
        Motivation motivation = generateMotivation(trial, career.getPlace(), 2);

        Charecter genChar = new Charecter(statline, World, birthRight, lure, trial, motivation, career);
        return genChar;
    }

    public static BirthRight generateBirthRight(roguetradergen.Worlds.World homeWorld, int goal, int steps) {
        return homeWorld.whereNext(whichPath(homeWorld.getPlace(), goal, steps));
    }

    public static LureOfTheVoid generateLure(roguetradergen.BirthRight.BirthRight birthRight, int goal, int steps) {
        return birthRight.whereNext(whichPath(birthRight.getPlace(), goal, steps));
    }

    public static TrailsAndTravails generateTrial(roguetradergen.LureOfTheVoid.LureOfTheVoid lure, int goal, int steps) {
        return lure.whereNext(whichPath(lure.getPlace(), goal, steps));
    }

    public static Motivation generateMotivation(roguetradergen.TrailsAndTravails.TrailsAndTravails trial, int goal, int steps) {
        return trial.whereNext(whichPath(trial.getPlace(), goal, steps));
    }

    public static Career generateCareer(roguetradergen.Motivation.Motivation motivation, int goal, int steps) {
        return motivation.whereNext(whichPath(motivation.getPlace(), goal, steps));
    }

    public static World randomStartWorld() {

        int choice = rollDie(6);
        switch (choice) {
            case 1:
                return new DeathWorld();
            case 2:
                return new VoidBorn();
            case 3:
                return new ForgeWorld();
            case 4:
                return new HiveWorld();
            case 5:
                return new ImperialWorld();
            case 6:
                return new NobleBorn();
            default:
                return new HiveWorld();

        }

    }

    public static int whichPath(int currentNumber, int goalNumber, int stepsLeft) {
        int position = 6;
        int distance = unsignIt((currentNumber - goalNumber));
        if (goalNumber == -1) {
            position = rollDie(3) - 2;
        } else if (distance < (stepsLeft - 1)) {
            position = rollDie(3) - 2;
        } else if (distance == stepsLeft) {
            if (currentNumber - goalNumber > 0) {
                position = -1;
            } else if (currentNumber - goalNumber < 0) {
                position = 1;
            }
        } else if (distance == (stepsLeft - 1)) {
            if (currentNumber - goalNumber > 0) {

                position = rollDie(2) - 2;
            } else if (currentNumber - goalNumber < 0) {
                position = rollDie(2) - 1;
            } else if ((currentNumber == goalNumber) && (goalNumber <= 1)) {
                position = 0;
            } else {
                position = rollDie(3) - 2;
            }
        }
        return position;
    }

    public static int unsignIt(int number) {
        return (int) (Math.sqrt(number * number));
    }

    public static int[] generateCStats() {
        int[] statline = new int[13];
        for (int noStat = 0; noStat < 9; noStat++) {
            statline[noStat] = rollSDie(2, 10);
        }
        statline[9] = rollDie(5);
        statline[10] = rollDie(10);
        return statline;
    }
}
