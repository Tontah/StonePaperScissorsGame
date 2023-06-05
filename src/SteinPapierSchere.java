import java.util.Random;

public class SteinPapierSchere {
    /* 0 stands for paper,
        1 stands for scissors, and
        2 stands for stone.
     */

    public  static String game(Spieler spielerA, Spieler spielerB)
    {
        if (spielerB.getChoice() == 0){
            if (spielerA.getChoice() == 0){
                spielerA.setIndecisive(spielerA.getIndecisive()+1);
                spielerB.setIndecisive(spielerA.getIndecisive()+1);
                return "indecisive";
            }
            if (spielerA.getChoice() == 1){
                spielerA.setWins(spielerA.getWins()+1);
                spielerB.setLose(spielerB.getLose()+1);
                return "Player A wins";
            }
            if (spielerA.getChoice() == 2){
                spielerB.setWins(spielerB.getWins()+1);
                spielerA.setLose(spielerA.getLose()+1);
                return "Player B wins";
            }
        }
        if (spielerB.getChoice() == 1){
            if (spielerA.getChoice() == 0){
                spielerB.setWins(spielerB.getWins()+1);
                spielerA.setLose(spielerA.getLose()+1);
                return "Player B wins";
            }
            if (spielerA.getChoice() == 1){
                spielerA.setIndecisive(spielerA.getIndecisive()+1);
                spielerB.setIndecisive(spielerA.getIndecisive()+1);
                return "indecisive";
            }
            if (spielerA.getChoice() == 2){
                spielerA.setWins(spielerA.getWins()+1);
                spielerB.setLose(spielerB.getLose()+1);
                return "Player A wins";
            }
        }
        if (spielerB.getChoice() == 2){
            if (spielerA.getChoice() == 0){
                spielerA.setWins(spielerA.getWins()+1);
                spielerB.setLose(spielerB.getLose()+1);
                return "Player A wins";
            }
            if (spielerA.getChoice() == 1){
                spielerB.setWins(spielerB.getWins()+1);
                spielerA.setLose(spielerA.getLose()+1);
                return "Player B wins";
            }
            if (spielerA.getChoice() == 2){
                spielerA.setIndecisive(spielerA.getIndecisive()+1);
                spielerB.setIndecisive(spielerA.getIndecisive()+1);
                return "indecisive";
            }
        }
        return"Game not functioning as expected";
    }

}
