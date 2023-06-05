import static org.junit.jupiter.api.Assertions.*;

class SteinPapierSchereTest {
    /* 0 stands for paper,
        1 stands for scissors, and
        2 stands for stone.
     */

    @org.junit.jupiter.api.Test
        void indecisivePaper() {
            assertEquals("indecisive",SteinPapierSchere.game(new  Spieler(0,"A",0,0,0), new Spieler(0,"B",0,0,0)));
        }

        @org.junit.jupiter.api.Test
        void indecisiveStone() {
            assertEquals("indecisive",SteinPapierSchere.game(new  Spieler(2,"A",0,0,0), new Spieler(2,"B",0,0,0)));
        }

        @org.junit.jupiter.api.Test
        void indecisiveScissors() {
            assertEquals("indecisive",SteinPapierSchere.game(new  Spieler(1,"A",0,0,0), new Spieler(1,"B",0,0,0)));
        }

         @org.junit.jupiter.api.Test
         void aPaperBStone() {
            assertEquals("Player A wins",SteinPapierSchere.game(new  Spieler(0,"A",0,0,0), new Spieler(2,"B",0,0,0)));
        }

        @org.junit.jupiter.api.Test
        void aPaperBScissors() {
            assertEquals("Player B wins",SteinPapierSchere.game(new  Spieler(0,"A",0,0,0), new Spieler(1,"B",0,0,0)));
        }

        @org.junit.jupiter.api.Test
        void aScissorsBStone() {
            assertEquals("Player B wins",SteinPapierSchere.game(new  Spieler(1,"A",0,0,0), new Spieler(2,"B",0,0,0)));
        }
        @org.junit.jupiter.api.Test
         void bPaperAStone() {
            assertEquals("Player B wins",SteinPapierSchere.game(new  Spieler(2,"A",0,0,0), new Spieler(0,"B",0,0,0)));
        }

        @org.junit.jupiter.api.Test
        void bPaperAScissors() {
            assertEquals("Player A wins",SteinPapierSchere.game(new  Spieler(1,"A",0,0,0), new Spieler(0,"B",0,0,0)));
        }

        @org.junit.jupiter.api.Test
        void bScissorsAStone() {
            assertEquals("Player A wins",SteinPapierSchere.game(new  Spieler(2,"A",0,0,0), new Spieler(1,"B",0,0,0)));
        }
    }