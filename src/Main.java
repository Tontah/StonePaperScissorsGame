import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberOfRounds = 0;
        while (numberOfRounds<100){
            SteinPapierSchere.spielerB.paperScissorsStone = rand.nextInt(3);
            SteinPapierSchere.game();
            System.out.println("Spieler A gewinnt "+ SteinPapierSchere.spielerA.wins + " von "+ (numberOfRounds+1) +" Spielen");
            System.out.println("Spieler B gewinnt "+ SteinPapierSchere.spielerB.wins + " von "+ (numberOfRounds+1) +" Spielen");
            System.out.println("Unentschieden: " + SteinPapierSchere.spielerA.indecisive +" von "+ (numberOfRounds+1) +" Spielen");
            /*System.out.println("Spieler A choice "+ SteinPapierSchere.spielerA.paperScissorsStone);
            System.out.println("Spieler B choice "+ SteinPapierSchere.spielerB.paperScissorsStone);*/
            numberOfRounds++;
        }
    }
}