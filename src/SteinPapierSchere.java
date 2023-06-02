import java.util.Random;

public class SteinPapierSchere {
    /* 0 stands for paper,
        1 stands for scissors, and
        2 stands for stone.
     */
    static Spieler spielerA = new Spieler(0, "A", 0,0,0);
    static Spieler spielerB = new Spieler(0, "B", 0,0,0);
    public static void game(){
        if (spielerB.paperScissorsStone == 0){
            if (spielerA.paperScissorsStone == 0){
                spielerA.indecisive++;
                spielerB.indecisive++;
            }
            if (spielerA.paperScissorsStone == 1){
                spielerA.wins++;
                spielerB.lose++;
            }
            if (spielerA.paperScissorsStone == 2){
                spielerB.wins++;
                spielerA.lose++;
            }
        }
        if (spielerB.paperScissorsStone == 1){
            if (spielerA.paperScissorsStone == 0){
                spielerB.wins++;
                spielerA.lose++;
            }
            if (spielerA.paperScissorsStone == 1){
                spielerA.indecisive++;
                spielerB.indecisive++;
            }
            if (spielerA.paperScissorsStone == 2){
                spielerA.wins++;
                spielerB.lose++;
            }
        }
        if (spielerB.paperScissorsStone == 2){
            if (spielerA.paperScissorsStone == 0){
                spielerA.wins++;
                spielerB.lose++;
            }
            if (spielerA.paperScissorsStone == 1){
                spielerB.wins++;
                spielerA.lose++;
            }
            if (spielerA.paperScissorsStone == 2){
                spielerA.indecisive++;
                spielerB.indecisive++;
            }
        }
    }

}
