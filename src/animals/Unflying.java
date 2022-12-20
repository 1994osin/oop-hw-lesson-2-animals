package animals;

import java.util.Objects;

public class Unflying extends Bird {

    private final String movementType;

    public Unflying(String name, int age, String habitat, String movementType) {
        super(name, age, habitat);
        this.movementType = (movementType == null || movementType.isBlank()) ? "land" : movementType;
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

    public void walk() {
        System.out.println(getName() + " walks in " + getHabitat());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Unflying unflying = (Unflying) o;
        return Objects.equals(movementType, unflying.movementType);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Unflying{" +
                "movementType='" + movementType + '\'' +
                "} ";
    }

    public String getMovementType() {
        return movementType;
    }
}
