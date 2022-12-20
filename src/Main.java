import animals.*;

public class Main {
    public static void main(String[] args) {

        Herbivore gazelle = new Herbivore("gazelle", 4, null, 20, "grass");
        Herbivore giraffe = new Herbivore("giraffe", 2, null, 15, "leaves");
        Herbivore horse = new Herbivore("horse", 1, null, 20, "field");

        Predator hyena = new Predator("hyena", 2, "forest", 17, "meat");
        Predator tiger = new Predator("tiger", 6, "forest", 26, "meat");
        Predator bear = new Predator("bear", 10, "forest", 21, "meat");

        Amphibious frog = new Amphibious("frog", 1, "water");
        Amphibious freshwater = new Amphibious("freshwater", 2, "water");

        Unflying peacock = new Unflying("peacock", 2, null, "legs");
        Unflying penguin = new Unflying("penguin", 4, "ice", "legs");
        Unflying birdDodo = new Unflying("bird dodo", 5, null, "legs");

        Flying seagull = new Flying("seagull", 3, "sea", "wings");
        Flying albatross = new Flying("albatross", 7, "sea", "wings");
        Flying falcon = new Flying("falcon", 1, " ", "wings");


        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(freshwater);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(birdDodo);
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);

        falcon.eat();

        animalComparison(hyena, penguin);
        animalComparison(tiger, tiger);
    }

    public static void animalComparison(Animal animal1, Animal animal2) {
        if (animal1.equals(animal2)) {
            System.out.println("Животные одинаковые");
        } else {
            System.out.println("Животные разные");
        }
    }
}