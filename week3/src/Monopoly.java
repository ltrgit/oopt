import java.util.Scanner;
public class Monopoly extends Game {
    
    static Scanner in = new Scanner(System.in);
    public void makeMove() {
        System.out.println("Yor turn: ");
        int input = in.nextInt();
        isOver = true;
    }

    public void endOfGame() {
        System.out.println("Cleanin the monopoly board");
        System.out.println("And stealing all the money");
        getWinner();
    }


    public String getWinner() {
        return this.winner = "Gessle";
    }
}
