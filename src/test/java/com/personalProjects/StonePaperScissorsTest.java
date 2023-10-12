package com.personalProjects;

import static org.junit.jupiter.api.Assertions.*;

class StonePaperScissorsTest {
    Player playerA;
    Player playerB;

    @org.junit.jupiter.api.Test
    void indecisivePaper() {
        assertEquals("indecisive", StonePaperScissors.game(playerA = new Player(StonePaperScissors.Choices.PAPER, "A", 0, 0, 0), playerB = new Player(StonePaperScissors.Choices.PAPER, "B", 0, 0, 0)));
        assertTrue(playerA.getIndecisive() == 1);
        assertTrue(playerB.getIndecisive() == 1);
    }

    @org.junit.jupiter.api.Test
    void indecisiveStone() {
        assertEquals("indecisive", StonePaperScissors.game(playerA = new Player(StonePaperScissors.Choices.STONE, "A", 0, 0, 0), playerB = new Player(StonePaperScissors.Choices.STONE, "B", 0, 0, 0)));
        assertTrue(playerA.getIndecisive() == 1);
        assertTrue(playerB.getIndecisive() == 1);
    }

    @org.junit.jupiter.api.Test
    void indecisiveScissors() {
        assertEquals("indecisive", StonePaperScissors.game(playerA = new Player(StonePaperScissors.Choices.SCISSORS, "A", 0, 0, 0), playerB = new Player(StonePaperScissors.Choices.SCISSORS, "B", 0, 0, 0)));
        assertTrue(playerA.getIndecisive() == 1);
        assertTrue(playerB.getIndecisive() == 1);
    }

    @org.junit.jupiter.api.Test
    void aPaperBStone() {
        assertEquals("Player A wins", StonePaperScissors.game(playerA = new Player(StonePaperScissors.Choices.PAPER, "A", 0, 0, 0), playerB = new Player(StonePaperScissors.Choices.STONE, "B", 0, 0, 0)));
        assertTrue(playerA.getWins() == 1);
        assertTrue(playerB.getLose() == 1);
    }

    @org.junit.jupiter.api.Test
    void aPaperBScissors() {
        assertEquals("Player B wins", StonePaperScissors.game(playerA = new Player(StonePaperScissors.Choices.PAPER, "A", 0, 0, 0), playerB = new Player(StonePaperScissors.Choices.SCISSORS, "B", 0, 0, 0)));
        assertTrue(playerA.getLose() == 1);
        assertTrue(playerB.getWins() == 1);
    }

    @org.junit.jupiter.api.Test
    void aScissorsBStone() {
        assertEquals("Player B wins", StonePaperScissors.game(playerA = new Player(StonePaperScissors.Choices.SCISSORS, "A", 0, 0, 0), playerB = new Player(StonePaperScissors.Choices.STONE, "B", 0, 0, 0)));
        assertTrue(playerA.getLose() == 1);
        assertTrue(playerB.getWins() == 1);
    }

    @org.junit.jupiter.api.Test
    void bPaperAStone() {
        assertEquals("Player B wins", StonePaperScissors.game(playerA = new Player(StonePaperScissors.Choices.STONE, "A", 0, 0, 0), playerB = new Player(StonePaperScissors.Choices.PAPER, "B", 0, 0, 0)));
        assertTrue(playerA.getLose() == 1);
        assertTrue(playerB.getWins() ==1);
    }

    @org.junit.jupiter.api.Test
    void bPaperAScissors() {
        assertEquals("Player A wins", StonePaperScissors.game(playerA = new Player(StonePaperScissors.Choices.SCISSORS, "A", 0, 0, 0), playerB = new Player(StonePaperScissors.Choices.PAPER, "B", 0, 0, 0)));
        assertTrue(playerA.getWins() == 1);
        assertTrue(playerB.getLose() == 1);
    }

    @org.junit.jupiter.api.Test
    void bScissorsAStone() {
        assertEquals("Player A wins", StonePaperScissors.game(playerA = new Player(StonePaperScissors.Choices.STONE, "A", 0, 0, 0), playerB = new Player(StonePaperScissors.Choices.SCISSORS, "B", 0, 0, 0)));
        assertTrue(playerA.getWins() == 1);
        assertTrue(playerB.getLose() == 1);
    }
}