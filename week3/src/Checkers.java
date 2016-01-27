import java.util.Scanner;
public class Checkers extends Game {

    static Scanner in = new Scanner(System.in);
    public void makeMove() {
        System.out.println("Yor turn: ");
        int input = in.nextInt();
        isOver = true;
    }

    public void endOfGame() {
        System.out.println("Cleanin the checkers board");
        getWinner();
    }


    public String getWinner() {
        return this.winner = "Lassi";
    }
}
