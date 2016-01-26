public class Pegasus extends Animal implements Flyable, Runnable {

    @Override
    public void fly() {
        System.out.println("Pegasus flies out of the cage!\n");
    }

    @Override
    public void run() {
        System.out.println("Pegasus runs through the door!\n");
    }
    
    @Override
    public void doTricks(){
        run();
        fly();
    }
}
