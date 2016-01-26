public class Griffin extends Animal implements Runnable, Flyable, Shoutable {

    @Override
    public void shout() {
        System.out.println("Griffin shouts yseflskemf!\n");
    }

    @Override
    public void run() {
        System.out.println("Griffin runs!\n");
    }

    @Override
    public void fly() {
        System.out.println("Griffin flies!\n");
    }
    
    @Override
    public void doTricks(){
        fly();
        run();
        shout();
    }
    
}
