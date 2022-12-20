package animals;

import java.util.Objects;

public abstract class Mammal extends Animal {

    private String habitat;
    private final int speed;

    public Mammal(String name, int age, String habitat, int speed) {
        super(name, age);
        setHabitat(habitat);
        this.speed = (speed <= 0) ? 5 : speed;
    }

    public abstract void walk();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed && Objects.equals(habitat, mammal.habitat);
    }

    @Override
    public String toString() {
        return  super.toString() +
                " Mammal{" +
                "habitat='" + habitat + '\'' +
                ", speed=" + speed +
                "} ";
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = (habitat == null || habitat.isBlank()) ? "Earth" : habitat;
    }

    public int getSpeed() {
        return speed;
    }
}
