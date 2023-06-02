public class Spieler {
    int paperScissorsStone;
    String name;
    int wins;
    int lose;
    int indecisive;
    public Spieler(int random, String name, int wins, int lose, int indecisive){
        this.paperScissorsStone = random;
        this.name = name;
        this.wins = wins;
        this.lose = lose;
        this.indecisive = indecisive;
    }

    public void setPaperScissorsStone(int paperScissorsStone) {
        this.paperScissorsStone = paperScissorsStone;
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

    public int getPaperScissorsStone() {
        return paperScissorsStone;
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
