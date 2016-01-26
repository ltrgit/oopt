import java.util.*;

public class Zoo {

    private List<Cage> cages;

    private static int numCages = 0;

    public void feedAnimals() {
        for(Cage cage: cages) {
            cage.feed();
        }
    }
    
    public List<Cage> getCages() {
        return cages;
    }

    public List<Cage> getAnimals() {
        return this.cages;
    }
    public void addAnimal(Animal a){
        int num = numCages;
        cages.add(new Cage(a, num));
        numCages++;
    }
    
    /* Search by cage id, not sure if this is what I'm supposed to do*/
    public Animal searchByCage(int cageID) {
        return cages.get(cageID).getAnimal();
    } 
    
    /* Let's try some new Java features */
    /* Let's get all the cages by animal type */
    public interface Predicate<T>{
        boolean test(T t);
    }
    /* Get all cages that satisfy the predicate, is animal p */
    static List<Cage> filterByAnimal(List<Cage> cages, Predicate<Animal> p) {
        List<Cage> result = new ArrayList<>();
        for(Cage cage: cages) {
            if (p.test(cage.getAnimal())){
                result.add(cage);
            }
        }
        return result;
    }
    
    /* A More generic version of filtering by animal */
    static List<Cage> filtByAn(List<Cage> cages, Animal anim) {
        List<Cage> result = new ArrayList<>();
        for(Cage cage: cages) {
            if(cage.getAnimal().getClass().equals(anim.getClass())) {
                result.add(cage);
            }
        }
        return result;
    }
    
    Zoo(){
        cages = new ArrayList<>();
    }

    public static void main(String args[]) {
        /* Create Korkeasaari */
        Zoo zoo = new Zoo();
        
        /* Smuggle some animals into it */
        zoo.addAnimal(new Bird());
        zoo.addAnimal(new Bird());
        zoo.addAnimal(new Pegasus());
        zoo.addAnimal(new PlatyPus());
        zoo.addAnimal(new Horse());
        zoo.addAnimal(new Horse());
        
        /* Make them do tricks */
        for (Cage cage : zoo.getAnimals()) {
            cage.printID();
            cage.getAnimal().doTricks();
        }
        
        /* Feed animals */
        zoo.feedAnimals();
        
        /* Get all cages where there is a Bird */
        List<Cage> birds = filterByAnimal(zoo.getCages(), (Animal a) -> a.getClass().equals(Bird.class));
        
        System.out.println("Birds are in cages: ");
        /* Print all bird cage ids */
        for(Cage cage: birds) {
            cage.printID();
        }
        
        /* a bit different version for horse test */
        Horse horse = new Horse();
        List<Cage> horses = filtByAn(zoo.getCages(), new Horse());
        System.out.println("Horses are in cages: \n");
        for(Cage cage: horses) {
            cage.printID();
        }
    }
}
