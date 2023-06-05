import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int numberOfRounds = 0;
        Spieler spielerA = new Spieler(0,"A",0,0,0);
        Spieler spielerB = new Spieler(0,"b", 0,0,0);

        Random rand = new Random();

        while (numberOfRounds<100){
            SteinPapierSchere.game(spielerA , spielerB );
            spielerB.setChoice(rand.nextInt(3));

            numberOfRounds++;
        }
            System.out.println("Spieler A gewinnt "+ spielerA.getWins() + " von "+ (numberOfRounds) +" Spielen");
            System.out.println("Spieler B gewinnt "+ spielerB.getWins() + " von "+ (numberOfRounds) +" Spielen");
            System.out.println("Unentschieden: " + spielerA.getIndecisive() +" von "+ (numberOfRounds) +" Spielen");
    }
}