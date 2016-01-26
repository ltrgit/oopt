public class Bird extends Animal implements Flyable {

    @Override
    public void fly() {
        System.out.println("Birdy flies!\n");
    }
    @Override
    public void doTricks(){
        fly();
    }
}
