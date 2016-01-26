public class Cage {

    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void feed(Animal a) {
    }

    public void feed() {
        animal.eat();
    }
    public void printID() {
        System.out.println(id);
    }

    private int id;
    
    Cage(Animal ani, int id){
        this.id = id;
        animal = ani;
    }
    
    Cage(Animal a){
        animal = a;
    }
}
