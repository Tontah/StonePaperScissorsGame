package com.personalProjects;

public class Spieler {
    private int choice;
    private String name;
   private int wins;
    private int lose;
    private int indecisive;
    public Spieler(int choice, String name, int wins, int lose, int indecisive){
        this.choice = choice;
        this.name = name;
        this.wins = wins;
        this.lose = lose;
        this.indecisive = indecisive;
    }

    public boolean setChoice(int choice) {
        this.choice = choice;
        return true;
    }

    public boolean setName(String name) {
        this.name = name;
        return true;
    }

    public boolean setWins(int wins) {
        this.wins = wins;
        return true;
    }

    public boolean setLose(int lose) {
        this.lose = lose;
        return true;
    }

    public boolean setIndecisive(int indecisive) {
        this.indecisive = indecisive;
        return true;
    }

    public int getChoice() {
        return choice;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLose() {
        return lose;
    }

    public int getIndecisive() {
        return indecisive;
    }
}
