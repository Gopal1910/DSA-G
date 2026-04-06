import java.util.*;

// Multiple inheritance using interface
public class MultipleInheritance {
    public static void main(String[] args) {

        Bear b = new Bear();
        b.eatsPlants();
        b.eatsMeat();
    }
}

interface Herbivore {
    void eatsPlants();
}

interface Carnivore {
    void eatsMeat();
}

class Bear implements Herbivore, Carnivore {
    public void eatsPlants() {
        System.out.println("Eats plants");
    }

    public void eatsMeat() {
        System.out.println("Eats meat");
    }
}
