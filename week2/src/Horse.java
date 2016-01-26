public class Horse extends Animal implements Runnable {

    @Override
    public void run() {
        System.out.println("Horse runs into a wall!\n");
    }
    
    @Override
    public void doTricks(){
        run();
    }
}
