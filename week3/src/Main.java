public class Main {

    public static void main(String args[]) {
        
        Chess chessGame = new Chess();
        Monopoly monopolyGame = new Monopoly();
        Checkers checkersGame = new Checkers();
        chessGame.Play();
        monopolyGame.Play();
        checkersGame.Play();
        
        System.out.println("All games over...");
    }
}
