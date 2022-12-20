package animals;

import java.util.Objects;

public class Amphibious extends Animal{

    private final String habitat;

    public Amphibious(String name, int age, String habitat) {
        super(name, age);
        this.habitat = (habitat == null || habitat.isBlank()) ? "water and land" : habitat;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps in " + getHabitat());
    }

    @Override
    public void move() {
        System.out.println(getName() + " moves");
    }

    public void hunts() {
        System.out.println(getName() + " hunts");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibious that = (Amphibious) o;
        return Objects.equals(habitat, that.habitat);
    }

    @Override
    public String toString() {
        return super.toString() +
                " Amphibious{" +
                "habitat='" + habitat + '\'' +
                "} ";
    }

    public String getHabitat() {
        return habitat;
    }
}
