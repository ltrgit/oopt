public class PlatyPus extends Animal implements EggLayer, Shoutable, Runnable {

    @Override
    public void run() {
        System.out.println("Platypus runs slowly\n");
    }

    @Override
    public void shout() {
        System.out.println("Platypus shouts hnggggh\n");
    }

    @Override
    public void layEggs() {
        System.out.println("Platypus lays mini eggs\n");
    }
    
    @Override
    public void doTricks(){
        layEggs();
        shout();
        run();
    }
}
