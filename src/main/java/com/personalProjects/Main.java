package com.personalProjects;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int numberOfRounds = 0;
        Player playerA = new Player(StonePaperScissors.Choices.PAPER,"A",0,0,0);
        Player playerB = new Player(StonePaperScissors.Choices.PAPER,"b", 0,0,0);

        Random rand = new Random();


        while (numberOfRounds<100){
            StonePaperScissors.game(playerA, playerB);
           playerB.setChoice(StonePaperScissors.Choices.values()[rand.nextInt(StonePaperScissors.Choices.values().length)]);

            numberOfRounds++;
        }
            System.out.println("Spieler A gewinnt "+ playerA.getWins() + " von "+ (numberOfRounds) +" Spielen");
            System.out.println("Spieler B gewinnt "+ playerB.getWins() + " von "+ (numberOfRounds) +" Spielen");
            System.out.println("Unentschieden: " + playerA.getIndecisive() +" von "+ (numberOfRounds) +" Spielen");
    }
}