package com.personalProjects;

import static org.junit.jupiter.api.Assertions.*;

class SteinPapierSchereTest {
    /* 0 stands for paper,
        1 stands for scissors, and
        2 stands for stone.
     */
    Spieler spielerA;
    Spieler spielerB;

    @org.junit.jupiter.api.Test
    void indecisivePaper() {
        assertEquals("indecisive", SteinPapierSchere.game(spielerA = new Spieler(0, "A", 0, 0, 0), spielerB = new Spieler(0, "B", 0, 0, 0)));
        assertTrue(spielerA.setIndecisive(1));
        assertTrue(spielerB.setIndecisive(1));
    }

    @org.junit.jupiter.api.Test
    void indecisiveStone() {
        assertEquals("indecisive", SteinPapierSchere.game(spielerA = new Spieler(2, "A", 0, 0, 0), spielerB = new Spieler(2, "B", 0, 0, 0)));
        assertTrue(spielerA.setIndecisive(1));
        assertTrue(spielerB.setIndecisive(1));
    }

    @org.junit.jupiter.api.Test
    void indecisiveScissors() {
        assertEquals("indecisive", SteinPapierSchere.game(spielerA = new Spieler(1, "A", 0, 0, 0), spielerB = new Spieler(1, "B", 0, 0, 0)));
        assertTrue(spielerA.setIndecisive(1));
        assertTrue(spielerB.setIndecisive(1));
    }

    @org.junit.jupiter.api.Test
    void aPaperBStone() {
        assertEquals("Player A wins", SteinPapierSchere.game(spielerA = new Spieler(0, "A", 0, 0, 0), spielerB = new Spieler(2, "B", 0, 0, 0)));
        assertTrue(spielerA.setWins(1));
        assertTrue(spielerB.setLose(1));
    }

    @org.junit.jupiter.api.Test
    void aPaperBScissors() {
        assertEquals("Player B wins", SteinPapierSchere.game(spielerA = new Spieler(0, "A", 0, 0, 0), spielerB = new Spieler(1, "B", 0, 0, 0)));
        assertTrue(spielerA.setLose(1));
        assertTrue(spielerB.setWins(1));
    }

    @org.junit.jupiter.api.Test
    void aScissorsBStone() {
        assertEquals("Player B wins", SteinPapierSchere.game(spielerA = new Spieler(1, "A", 0, 0, 0), spielerB = new Spieler(2, "B", 0, 0, 0)));
        assertTrue(spielerA.setLose(1));
        assertTrue(spielerB.setWins(1));
    }

    @org.junit.jupiter.api.Test
    void bPaperAStone() {
        assertEquals("Player B wins", SteinPapierSchere.game(spielerA = new Spieler(2, "A", 0, 0, 0), spielerB = new Spieler(0, "B", 0, 0, 0)));
        assertTrue(spielerA.setLose(1));
        assertTrue(spielerB.setWins(1));
    }

    @org.junit.jupiter.api.Test
    void bPaperAScissors() {
        assertEquals("Player A wins", SteinPapierSchere.game(spielerA = new Spieler(1, "A", 0, 0, 0), spielerB = new Spieler(0, "B", 0, 0, 0)));
        assertTrue(spielerA.setWins(1));
        assertTrue(spielerB.setLose(1));
    }

    @org.junit.jupiter.api.Test
    void bScissorsAStone() {
        assertEquals("Player A wins", SteinPapierSchere.game(spielerA = new Spieler(2, "A", 0, 0, 0), spielerB = new Spieler(1, "B", 0, 0, 0)));
        assertTrue(spielerA.setWins(1));
        assertTrue(spielerB.setLose(1));
    }
}