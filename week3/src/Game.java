public abstract class Game {

    protected int maxPlayers;

    protected int numPlayers;

    protected boolean isOver;

    protected String winner;

    public final void Play() {
        initialize();
        while (!isOver) {
            makeMove();
        }
        endOfGame();
        printWinner();
        
    }

    public void initialize() {
        System.out.println("Initializing Game...\n");
    }

    public abstract void makeMove();

    public abstract void endOfGame();

    public void printWinner() {
        System.out.println("The winner is: " + winner);
    }

    public boolean getState() {
        return isOver;
    }

    public abstract String getWinner();
}
