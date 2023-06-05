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

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public void setIndecisive(int indecisive) {
        this.indecisive = indecisive;
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
