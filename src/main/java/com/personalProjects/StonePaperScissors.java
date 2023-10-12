package com.personalProjects;

public class StonePaperScissors {
    enum Choices {
        STONE, PAPER, SCISSORS;
    }

    public  static String game(Player playerA, Player playerB)
    {
        if(playerB.getChoice().equals(Choices.PAPER) ) {
            Choices choice = playerA.getChoice();
            switch (choice) {
                case PAPER:
                    playerA.setIndecisive(playerA.getIndecisive() + 1);
                    playerB.setIndecisive(playerB.getIndecisive() + 1);
                    return "indecisive";
                case SCISSORS:
                    playerA.setWins(playerA.getWins() + 1);
                    playerB.setLose(playerB.getLose() + 1);
                    return "Player A wins";
                case STONE:
                    playerB.setWins(playerB.getWins() + 1);
                    playerA.setLose(playerA.getLose() + 1);
                    return "Player B wins";

            }
        }
        if(playerB.getChoice().equals(Choices.SCISSORS) ) {
            Choices choice = playerA.getChoice();
            switch (choice) {
                case SCISSORS:
                    playerA.setIndecisive(playerA.getIndecisive() + 1);
                    playerB.setIndecisive(playerB.getIndecisive() + 1);
                    return "indecisive";
                case STONE:
                    playerA.setWins(playerA.getWins() + 1);
                    playerB.setLose(playerB.getLose() + 1);
                    return "Player A wins";
                case PAPER:
                    playerB.setWins(playerB.getWins() + 1);
                    playerA.setLose(playerA.getLose() + 1);
                    return "Player B wins";

            }
        }
        if(playerB.getChoice().equals(Choices.STONE) ) {
            Choices choice = playerA.getChoice();
            switch (choice) {
                case STONE:
                    playerA.setIndecisive(playerA.getIndecisive() + 1);
                    playerB.setIndecisive(playerB.getIndecisive() + 1);
                    return "indecisive";
                case PAPER:
                    playerA.setWins(playerA.getWins() + 1);
                    playerB.setLose(playerB.getLose() + 1);
                    return "Player A wins";
                case SCISSORS:
                    playerB.setWins(playerB.getWins() + 1);
                    playerA.setLose(playerA.getLose() + 1);
                    return "Player B wins";

            }
        }
        return"Game not functioning as expected";
    }
}
